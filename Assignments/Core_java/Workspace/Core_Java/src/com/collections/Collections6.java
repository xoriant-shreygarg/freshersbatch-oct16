package com.collections;

import java.util.*;

class User {
	private String name;
	private String password;

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
}

class Chatroom {
	private TreeSet<User> users;
	private ArrayList<String> messages;

	public Chatroom() {
		this.users = new TreeSet<>(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		this.messages = new ArrayList<>();
	}

	public TreeSet<User> getUsers() {
		return users;
	}

	public User getUser(String name) {
		for (User user : this.users) {
			if (user.getName().equals(name)) {
				return user;
			}
		}
		return null;
	}

	public void setUsers(TreeSet<User> users) {
		this.users = users;
	}

	public ArrayList<String> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}

	public void addUser(User user) {
		this.users.add(user);
	}

	public boolean containsUser(String name, String password) {
		for (User user : this.users) {
			if (user.getName().equals(name) && user.getPassword().equals(password))
				return true;
		}
		return false;
	}

	public boolean containsUser(String name) {
		for (User user : this.users) {
			if (user.getName().equals(name))
				return true;
		}
		return false;
	}

	public void addMessage(String message) {
		this.messages.add(message);
	}

	public void printAllMessages() {
		for (String message : this.messages) {
			System.out.println(message);
		}
	}

	public void printAllUsers() {
		for (User user : this.users) {
			System.out.println(user);
		}
	}

	public void deleteUser(String name) {
		for (User user : this.users) {
			if (user.getName().equals(name)) {
				this.users.remove(user);
				return;
			}
		}
	}
}

public class Collections6 {

	static User userLoggedIn = null;
	static Chatroom chatroomLoggedIn = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Chatroom> chatrooms = new HashMap<>();
		char choice;
		do {
			System.out.println("\n\nA) Create a chatroom\nB) Add user\nC) User login\n"
					+ "D) Send a message\nE) Display the messages from a specific chatroom\n"
					+ "F) List down all users belonging to the specified chat room.\n"
					+ "G) Logout\nH) Delete a user\nI) Delete the chat room\n" + "Please enter your option : \n");
			String choiceString = sc.next();
			if (choiceString.length() == 1)
				choice = choiceString.charAt(0);
			else
				choice = 'X';
			switch (choice) {
			case 'A':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name : ");
					String chatroomName2 = sc.next();
					if (!chatrooms.containsKey(chatroomName2)) {
						chatrooms.put(chatroomName2, new Chatroom());
						System.out.println("Chatroom created.");
					} else {
						System.out.println("Chatroom " + chatroomName2 + " already exists.");
					}
				} else {
					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to create chatroom.");
				}
				break;
			case 'B':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name in which you wish to add the user: ");
					String chatroomName = sc.next();
					if (chatrooms.containsKey(chatroomName)) {
						System.out.println("Enter user name and password : ");
						String name = sc.next();
						String password = sc.next();
						Chatroom chatroom = chatrooms.get(chatroomName);
						if (!chatroom.containsUser(name, password)) {
							chatroom.addUser(new User(name, password));
							System.out.println("User added.");
						} else {
							System.out.println("User already present.");
						}
					} else {
						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
					}
				} else {
					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to create chatroom.");
				}
				break;
			case 'C':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name : ");
					String chatroomName1 = sc.next();
					if (chatrooms.containsKey(chatroomName1)) {
						System.out.println("Enter user name and password : ");
						Chatroom chatroom = chatrooms.get(chatroomName1);
						String name = sc.next();
						String password = sc.next();
						if (chatroom.containsUser(name, password)) {
							userLoggedIn = chatroom.getUser(name);
							chatroomLoggedIn = chatroom;
							System.out.println("Logged in as " + name);
						} else {
							System.out.println("Invalid user name or password");
						}
					} else {
						System.out.println("Chatroom " + chatroomName1 + " doesn't exist.");
					}
				} else {
					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to create chatroom.");
				}
				break;
			case 'D':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name : ");
					String chatroomName11 = sc.next();
					if (chatrooms.containsKey(chatroomName11)) {
						System.out.println("Enter message : ");
						String message = sc.next();
						Chatroom chatroom = chatrooms.get(chatroomName11);
						chatroom.addMessage("Anonymous : "+message);
						System.out.println("Message : " + message + " sent.");
					} else {
						System.out.println("Chatroom " + chatroomName11 + " doesn't exist.");
					}
				} else {
					System.out.println("Enter message : ");
					String message = sc.next();
					chatroomLoggedIn.addMessage(userLoggedIn.getName()+" : "+message);
					System.out.println("Message : " + message + " sent.");
				}
				break;
			case 'E':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name : ");
					String chatroomName111 = sc.next();
					if (chatrooms.containsKey(chatroomName111)) {
						System.out.println("\nChatroom Messages : \n");
						chatrooms.get(chatroomName111).printAllMessages();
					} else {
						System.out.println("Chatroom " + chatroomName111 + " doesn't exist.");
					}
				} else {
					System.out.println("\nChatroom Messages : \n");
					chatroomLoggedIn.printAllMessages();
				}
				break;
			case 'F':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name : ");
					String chatroomName1111 = sc.next();
					if (chatrooms.containsKey(chatroomName1111)) {
						System.out.println("\nChatroom Users : \n");
						chatrooms.get(chatroomName1111).printAllUsers();
					} else {
						System.out.println("Chatroom " + chatroomName1111 + " doesn't exist.");
					}
				} else {
					System.out.println("\nChatroom Users : \n");
					chatroomLoggedIn.printAllUsers();
				}
				break;
			case 'G':
				if (userLoggedIn != null && chatroomLoggedIn != null) {
					System.out.println("User " + userLoggedIn.getName() + " logged out.");
					chatroomLoggedIn = null;
					userLoggedIn = null;
				} else {
					System.out.println("No user logged in.");
				}
				break;
			case 'H':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name : ");
					String chatroomName111111 = sc.next();
					if (chatrooms.containsKey(chatroomName111111)) {
						System.out.println("Enter user name : ");
						Chatroom chatroom = chatrooms.get(chatroomName111111);
						String name = sc.next();
						if (chatroom.containsUser(name)) {
							chatroom.deleteUser(name);
							System.out.println("User " + name + " deleted.");
						} else {
							System.out.println("User " + name + " doesn't exist.");
						}
					} else {
						System.out.println("Chatroom " + chatroomName111111 + " doesn't exist.");
					}
				} else {
					chatroomLoggedIn.deleteUser(userLoggedIn.getName());
					System.out.println("User " + userLoggedIn.getName() + " deleted.");
				}
				break;
			case 'I':
				if (userLoggedIn == null && chatroomLoggedIn == null) {
					System.out.println("Enter chatroom name : ");
					String chatroomName1111111 = sc.next();
					if (chatrooms.containsKey(chatroomName1111111)) {
						chatrooms.remove(chatroomName1111111);
						System.out.println("Chatroom " + chatroomName1111111 + " deleted.");
					} else {
						System.out.println("Chatroom " + chatroomName1111111 + " doesn't exist.");
					}
				} else {
					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to delete chatroom.");
				}
				break;
			}
		} while (choice == 'A' || choice == 'B' || choice == 'C' || choice == 'D' || choice == 'E' || choice == 'F'
				|| choice == 'G' || choice == 'H' || choice == 'I');
	}

}