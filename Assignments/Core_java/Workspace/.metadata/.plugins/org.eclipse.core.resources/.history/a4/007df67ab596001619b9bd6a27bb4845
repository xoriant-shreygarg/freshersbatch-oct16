package com.exceptions;

class InsufficientBalanceException extends RuntimeException{
	
	String message;

	public InsufficientBalanceException(String message) {
		this.message = message;
	}

	public InsufficientBalanceException() {
		message = "";
	}

	@Override
	public String toString() {
		return "Insufficient balance in account." + message;
	}
	
}
class Account{
	private static int accountNumberCounter = 1;
	private String name;
	private int accountNumber;
	private int balance;
	public Account(String name,int openingBalance){
		this.name = name;
		this.accountNumber = accountNumberCounter++;
		this.balance = openingBalance;
	}
public void deposit(int amount){
	this.balance += amount;
	System.out.println(""+amount+" added. Updated balance : "+this.balance);
}
public void withdraw(int amount) throws InsufficientBalanceException{
	if(balance>amount){
		this.balance -= amount;
		System.out.println("Success. Updated balance : "+this.balance);
	} else{
		throw new InsufficientBalanceException("Balance : "+balance+ ", amount enetered : "+amount);
	}
}
public void print(){
	System.out.println("Name : "+this.name+"\nAccount Number : "+this.accountNumber+"\nBalance : "+this.balance);
}

	public static void main(String args[]){
		Account a1 = new Account("Shrey Garg",5000);
		a1.print();
		a1.deposit(1000);
		a1.print();
//		try{
		a1.withdraw(10000);
		a1.print();
		a1.withdraw(500000);
		a1.print();
//		}
//		catch(InsufficientBalanceException e){
//			e.printStackTrace();
//		}
	}
}