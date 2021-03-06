//package com.hibernate.chatapp;
//
//import java.util.*;
//
//class User {
//	private String name;
//	private String password;
//
//	public User(String name, String password) {
//		super();
//		this.name = name;
//		this.password = password;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	@Override
//	public String toString() {
//		return "User [name=" + name + ", password=" + password + "]";
//	}
//}
//
//class Message {
//	private String message;
//
//	public Message(String message) {
//		super();
//		this.message = message;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	@Override
//	public String toString() {
//		return "Message [message=" + message + "]";
//	}
//	
//}
//
//class Chatroom {
//	private TreeSet<User> users;
//	private ArrayList<Message> messages;
//
//	public Chatroom() {
//		this.users = new TreeSet<User>(new Comparator<User>() {
//			public int compare(User o1, User o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
//		this.messages = new ArrayList<Message>();
//	}
//
//	public TreeSet<User> getUsers() {
//		return users;
//	}
//
//	public User getUser(String name) {
//		for (User user : this.users) {
//			if (user.getName().equals(name)) {
//				return user;
//			}
//		}
//		return null;
//	}
//
//	public void setUsers(TreeSet<User> users) {
//		this.users = users;
//	}
//
//	public ArrayList<Message> getMessages() {
//		return messages;
//	}
//
//	public void setMessages(ArrayList<Message> messages) {
//		this.messages = messages;
//	}
//
//	public void addUser(User user) {
//		this.users.add(user);
//	}
//
//	public boolean containsUser(String name, String password) {
//		for (User user : this.users) {
//			if (user.getName().equals(name) && user.getPassword().equals(password))
//				return true;
//		}
//		return false;
//	}
//
//	public boolean containsUser(String name) {
//		for (User user : this.users) {
//			if (user.getName().equals(name))
//				return true;
//		}
//		return false;
//	}
//
//	public void addMessage(String message) {
//		this.messages.add(new Message("message"));
//	}
//
//	public void printAllMessages() {
//		for (Message message : this.messages) {
//			System.out.println(message);
//		}
//	}
//
//	public void printAllUsers() {
//		for (User user : this.users) {
//			System.out.println(user);
//		}
//	}
//
//	public void deleteUser(String name) {
//		for (User user : this.users) {
//			if (user.getName().equals(name)) {
//				this.users.remove(user);
//				return;
//			}
//		}
//	}
//}
//
//public class ChatApp {
//
//	static User userLoggedIn = null;
//	static Chatroom chatroomLoggedIn = null;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
//		char choice;
//		do {
//			System.out.println("\n\nA) Create a chatroom\nB) Add user\nC) User login\n"
//					+ "D) Send a message\nE) Display the messages from a specific chatroom\n"
//					+ "F) List down all users belonging to the specified chat room.\n"
//					+ "G) Logout\nH) Delete a user\nI) Delete the chat room\nX)Exit\n\n" + "Please enter your option : \n");
//			String choiceString = sc.next();
//			if (choiceString.length() == 1)
//				choice = choiceString.charAt(0);
//			else
//				choice = 'X';
//			String chatroomName;
//			switch (choice) {
//			case 'A':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name : ");
//					String chatroomName2 = sc.next();
//					if (!chatrooms.containsKey(chatroomName2)) {
//						chatrooms.put(chatroomName2, new Chatroom());
//						System.out.println("Chatroom created.");
//					} else {
//						System.out.println("Chatroom " + chatroomName2 + " already exists.");
//					}
//				} else {
//					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to create chatroom.");
//				}
//				break;
//			case 'B':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name in which you wish to add the user: ");
//					chatroomName = sc.next();
//					if (chatrooms.containsKey(chatroomName)) {
//						System.out.println("Enter user name and password : ");
//						String name = sc.next();
//						String password = sc.next();
//						Chatroom chatroom = chatrooms.get(chatroomName);
//						if (!chatroom.containsUser(name, password)) {
//							chatroom.addUser(new User(name, password));
//							System.out.println("User added.");
//						} else {
//							System.out.println("User already present.");
//						}
//					} else {
//						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
//					}
//				} else {
//					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to create user.");
//				}
//				break;
//			case 'C':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name : ");
//					chatroomName = sc.next();
//					if (chatrooms.containsKey(chatroomName)) {
//						System.out.println("Enter user name and password : ");
//						Chatroom chatroom = chatrooms.get(chatroomName);
//						String name = sc.next();
//						String password = sc.next();
//						if (chatroom.containsUser(name, password)) {
//							userLoggedIn = chatroom.getUser(name);
//							chatroomLoggedIn = chatroom;
//							System.out.println("Logged in as " + name);
//						} else {
//							System.out.println("Invalid user name or password");
//						}
//					} else {
//						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
//					}
//				} else {
//					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to create chatroom.");
//				}
//				break;
//			case 'D':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name : ");
//					chatroomName = sc.next();
//					if (chatrooms.containsKey(chatroomName)) {
//						System.out.println("Enter message : ");
//						String message = sc.next();
//						Chatroom chatroom = chatrooms.get(chatroomName);
//						chatroom.addMessage("Anonymous : "+message);
//						System.out.println("Message : " + message + " sent.");
//					} else {
//						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
//					}
//				} else {
//					System.out.println("Enter message : ");
//					String message = sc.next();
//					chatroomLoggedIn.addMessage(userLoggedIn.getName()+" : "+message);
//					System.out.println("Message : " + message + " sent.");
//				}
//				break;
//			case 'E':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name : ");
//					chatroomName = sc.next();
//					if (chatrooms.containsKey(chatroomName)) {
//						System.out.println("\nChatroom Messages : \n");
//						chatrooms.get(chatroomName).printAllMessages();
//					} else {
//						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
//					}
//				} else {
//					System.out.println("\nChatroom Messages : \n");
//					chatroomLoggedIn.printAllMessages();
//				}
//				break;
//			case 'F':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name : ");
//					chatroomName = sc.next();
//					if (chatrooms.containsKey(chatroomName)) {
//						System.out.println("\nChatroom Users : \n");
//						chatrooms.get(chatroomName).printAllUsers();
//					} else {
//						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
//					}
//				} else {
//					System.out.println("\nChatroom Users : \n");
//					chatroomLoggedIn.printAllUsers();
//				}
//				break;
//			case 'G':
//				if (userLoggedIn != null && chatroomLoggedIn != null) {
//					System.out.println("User " + userLoggedIn.getName() + " logged out.");
//					chatroomLoggedIn = null;
//					userLoggedIn = null;
//				} else {
//					System.out.println("No user logged in.");
//				}
//				break;
//			case 'H':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name : ");
//					chatroomName = sc.next();
//					if (chatrooms.containsKey(chatroomName)) {
//						System.out.println("Enter user name : ");
//						Chatroom chatroom = chatrooms.get(chatroomName);
//						String name = sc.next();
//						if (chatroom.containsUser(name)) {
//							chatroom.deleteUser(name);
//							System.out.println("User " + name + " deleted.");
//						} else {
//							System.out.println("User " + name + " doesn't exist.");
//						}
//					} else {
//						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
//					}
//				} else {
//					chatroomLoggedIn.deleteUser(userLoggedIn.getName());
//					System.out.println("User " + userLoggedIn.getName() + " deleted.");
//					userLoggedIn = null;
//					chatroomLoggedIn = null;
//				}
//				break;
//			case 'I':
//				if (userLoggedIn == null && chatroomLoggedIn == null) {
//					System.out.println("Enter chatroom name : ");
//					chatroomName = sc.next();
//					if (chatrooms.containsKey(chatroomName)) {
//						chatrooms.remove(chatroomName);
//						System.out.println("Chatroom " + chatroomName + " deleted.");
//					} else {
//						System.out.println("Chatroom " + chatroomName + " doesn't exist.");
//					}
//				} else {
//					System.out.println("User " + userLoggedIn.getName() + " is logged in. Logout to delete chatroom.");
//				}
//				break;
//			}
//		} while (choice != 'X');
//	}
//
//}