package com.spring.rest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advertisement")
public class AdvertisementController {

	static int token = 1;
	static ArrayList<Integer> loggedInUserAuthTokens = new ArrayList<Integer>();

	static ArrayList<User> loggedInUsers = new ArrayList<User>();
	static ArrayList<Message> messages = new ArrayList<Message>();
	static ArrayList<User> users = new ArrayList<User>();

	static {
		users.add(new User("Shrey", "Garg", "shrey", "shrey", "shrey@gmail.com", 12345));
	}

	static ArrayList<Advertisement> advertisements = new ArrayList<Advertisement>();

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestBody User user) {
		if (users.contains(user)) {
			loggedInUsers.add(user);
			loggedInUserAuthTokens.add(token);
			return "Logged in, auth_token: 	" + token++;
		}
		return "Couldn't login, register first";
	}

	@RequestMapping(headers = { "auth_token" }, value = "/logout", method = RequestMethod.DELETE)
	public String logout(@RequestHeader Integer auth_token, @RequestParam(value = "username") String username) {
		if (loggedInUserAuthTokens.contains(auth_token)) {
			for (User user : loggedInUsers) {
				if (user.getUsername().equals(username)) {
					loggedInUsers.remove(user);
				}
			}
			loggedInUserAuthTokens.remove(auth_token);
			return "Logged out.";
		}
		return "Invalid auth_code, couldn't log out.";
	}

	@RequestMapping(headers = {
			"auth_token" }, value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody User user) {
		if (!users.contains(user)) {
			users.add(user);
			return "User registered.";
		}
		return "User already registered";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUser(@RequestParam(value = "username") String username) {
		for (User user : users) {
			if (user.getUsername().equals(username))
				return user;
		}
		return null;
	}

	@RequestMapping(headers = {
			"auth_token" }, value = "/postAd", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String postAd(@RequestHeader Integer auth_token, @RequestBody Advertisement advertisement) {
		if (loggedInUserAuthTokens.contains(auth_token)) {
			if (!advertisements.contains(advertisement)) {
				advertisements.add(advertisement);
				return "Ad posted";
			} else
				return "Ad already posted";
		} else
			return "Couldn't post ad,Invalid auth code";

	}

	@RequestMapping(headers = {
			"auth_token" }, value = "/postAd", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateAd(@RequestHeader Integer auth_token, @RequestBody Advertisement advertisement) {
		if (loggedInUserAuthTokens.contains(auth_token)) {
			if (advertisements.contains(advertisement)) {
				for (Advertisement ad : advertisements) {
					if (ad.equals(advertisement)) {
						ad.setPostId(advertisement.getPostId());
						ad.setStatus(advertisement.getStatus());
						ad.setTitle(advertisement.getTitle());
						ad.setName(advertisement.getName());
						ad.setCategory(advertisement.getCategory());
						ad.setDescription(advertisement.getDescription());
						return "Ad updated";
					}
				}
				return "Ad not found";
			} else
				return "Ad not found";
		} else
			return "Couldn't post ad,Invalid auth code";
	}

	@RequestMapping(headers = {
			"auth_token" }, value = "/posts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Advertisement> getPosts(@RequestHeader Integer auth_token) {
		ArrayList<Advertisement> advertisementsResult = new ArrayList<Advertisement>();
		if (loggedInUserAuthTokens.contains(auth_token)) {
			User user = getCurrentLoggedInUser(auth_token);
			if (user != null) {

				for (Advertisement advertisement : advertisements) {
					if (advertisement.getPostedByUsername().equals(user.getUsername()))
						advertisementsResult.add(advertisement);
				}
			}
		}
		return advertisementsResult;

	}

	@RequestMapping(headers = {
			"auth_token" }, value = "/post", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Advertisement getPost(@RequestHeader Integer auth_token, @RequestParam(value = "postId") String postId) {
		Advertisement advertisementResult = new Advertisement();
		if (loggedInUserAuthTokens.contains(auth_token)) {
			for (Advertisement advertisement : advertisements) {
				if (advertisement.getPostId().equals(postId))
					return advertisement;
			}
		}
		return advertisementResult;

	}

	public static User getCurrentLoggedInUser(Integer token) {
		int index = -1;
		for (int i = 0; i < loggedInUserAuthTokens.size(); i++) {
			if (loggedInUserAuthTokens.get(i) == token) {
				return loggedInUsers.get(i);
			}
		}
		return null;
	}

	@RequestMapping(headers = { "auth_token" }, value = "/post", method = RequestMethod.DELETE)
	public String deletePost(@RequestHeader Integer auth_token, @RequestParam(value = "postId") String postId) {
		Advertisement advertisementResult = new Advertisement();
		if (loggedInUserAuthTokens.contains(auth_token)) {
			for (Advertisement advertisement : advertisements) {
				if (advertisement.getPostId().equals(postId))
					advertisements.remove(advertisement);
				return "Ad deleted";
			}
		}
		return "Ad not found";

	}

	@RequestMapping(headers = {
			"auth_token" }, value = "/viewAd", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Advertisement viewAd(@RequestHeader Integer auth_token, @RequestParam(value = "postId") String postId) {
		Advertisement advertisementResult = new Advertisement();
		if (loggedInUserAuthTokens.contains(auth_token)) {
			for (Advertisement advertisement : advertisements) {
				if (advertisement.getPostId().equals(postId))
					return advertisement;
			}
		}
		return advertisementResult;

	}

	@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HashSet<String> allCategories() {
		HashSet<String> categories = new HashSet<String>();
		for (Advertisement advertisement : advertisements) {
			categories.add(advertisement.getCategory());
		}
		return categories;

	}

	@RequestMapping(value = "/actions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HashSet<String> allActions() {
		HashSet<String> actions = new HashSet<String>();
		actions.add("Buy");
		actions.add("Sell");
		actions.add("Rent");
		return actions;

	}

	@RequestMapping(headers = {
			"auth_token" }, value = "/message", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String message(@RequestHeader Integer auth_token, @RequestBody Message message) {
		if (loggedInUserAuthTokens.contains(auth_token)) {
			for (Advertisement advertisement : advertisements) {
				if (advertisement.getPostId().equals(message.getPostId())) {
					messages.add(message);
					return "Message sent";
				}
			}
		}
		return "Invalid auth token";
	}

}