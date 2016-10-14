 import java.util.Scanner;
public class Assignment8{
	static boolean loggedIn = false;
	public static void main(String[] args){
		int counter = 1;
		while(counter<4 && !loggedIn){
			login();
			counter++;
			if(loggedIn){
				System.out.println("Welcome");
				break;
			}
			else {
				if(counter<4)System.out.println("Try again");
				else System.out.println("Contact admin");
			}
		}
	}
	
	 static void login(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username :");
		String username = sc.next();
		System.out.println("Enter password :");
		String password = sc.next();
		
		if(username.equals("shrey")&&password.equals("shrey"))
			loggedIn = true;
		else loggedIn = false;
	}
}