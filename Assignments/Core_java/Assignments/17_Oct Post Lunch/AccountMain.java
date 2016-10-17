class Account{
	private int number;
	private String name;
	private double balance;
	
	public Account(int number,String name,double balance){
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
}

class SavingsAccount extends Account{
	private double fixDeposit;
	
	public SavingsAccount(int number,String name,double balance,double fixDeposit){
		super(number,name,balance);
		this.fixDeposit = fixDeposit;
	}
		
	public double getBalance(){
		return super.getBalance() + this.fixDeposit;
	}
}

class CurentAccount extends Account{
	private double cashCredit;
	
	public CurentAccount(int number,String name,double balance,double cashCredit){
		super(number,name,balance);
		this.cashCredit = cashCredit;
	}
		
	public double getBalance(){
		return super.getBalance() + this.cashCredit;
	}
}

class AccountMain{
	
	public static void main(String args[]){
		Account[] accounts = new Account[10];
		accounts[0] = new CurentAccount(1,"Shrey",10000,100);
		accounts[1] = new SavingsAccount(2,"Ankit",20000,1000);
		accounts[2] = new CurentAccount(3,"Archit",25000,5000);
		accounts[3] = new SavingsAccount(4,"Archana",10000,500);
		accounts[4] = new CurentAccount(5,"Sneha",20000,1000);
		accounts[5] = new SavingsAccount(6,"Mayur",25000,5000);
		accounts[6] = new CurentAccount(7,"Anand",10000,9000);
		accounts[7] = new SavingsAccount(8,"Aditya",20000,1000);
		accounts[8] = new CurentAccount(9,"Akshay",25000,5000);
		accounts[9] = new SavingsAccount(10,"Piyush",10000,0);
		//System.out.println("Total cash in bank : "+(10000+100+20000+1000+25000+5000+10000+500+20000+1000+25000+5000+10000+9000+20000+1000+25000+5000+10000));
		System.out.println("Total cash in bank : "+getTotalCashInBank(accounts));
	}
	
	public static double getTotalCashInBank(Account[] accounts){
		double totalCash = 0;
		for(int i=0;i<accounts.length;i++){
			totalCash += accounts[i].getBalance();
		}
		return totalCash;
	}
	
}