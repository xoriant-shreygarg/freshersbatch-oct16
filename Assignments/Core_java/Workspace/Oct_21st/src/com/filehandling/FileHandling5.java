package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*
class Date implements Serializable{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}

class Account implements Serializable {
	
	//private static final long serialVersionUID = 1l;
	
	private int number;
	private transient String name;
	private double balance;
	private Date dob;
	
	public Account(int number, String name, double balance, Date dob) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.dob = dob;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", balance=" + balance + ", dob=" + dob + "]";
	}

}*/

public class FileHandling5 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account account = new Account(1, "Shrey", 1000, new Date(10,10,2010));
		
		writeAccount(account);
		readAccount();
	}

	private static void readAccount() throws IOException, ClassNotFoundException {
		File file = new File("filehandling5.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println((Account) ois.readObject());
	}

	private static void writeAccount(Account a) throws IOException {
		File file = new File("filehandling5.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.flush();
		oos.close();
	}

}
