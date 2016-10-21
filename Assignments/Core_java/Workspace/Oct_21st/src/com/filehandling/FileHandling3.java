package com.filehandling;

import java.io.*;
/*
class Account {
	private int number;
	private String name;
	private double balance;

	public Account(int number, String name, double balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", balance=" + balance + "]";
	}
}
*/
public class FileHandling3 {

	public static void main(String[] args) throws IOException {
	/*	Account accounts[] = new Account[3];
		accounts[0] = new Account(1, "Shrey", 1000);
		accounts[1] = new Account(2, "Shreya", 2000);
		accounts[2] = new Account(3, "Shreyas", 3000);

		writeAccount(accounts);*/
		readAccount();
	}

	private static void writeAccount(Account[] accounts) throws IOException {
		File file = new File("accounts.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		for (Account a : accounts) {
			dos.writeInt(a.getNumber());
			dos.writeUTF(a.getName());
			dos.writeDouble(a.getBalance());
		}
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
	}

	private static void readAccount() throws IOException {
		File file = new File("accounts.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		for (int i = 0; i < 3; i++) {
			Account a = new Account();
			a.setNumber(dis.readInt());
			a.setName(dis.readUTF());
			a.setBalance(dis.readDouble());
			System.out.println(a);
		}
		dis.close();
		fis.close();
	}

}
