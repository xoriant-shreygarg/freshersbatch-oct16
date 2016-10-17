class Employee{
	private int employeeNumber;
	private String name;
	private double salary;
	
	public Employee(int employeeNumber,String name,double salary){
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public int getEmployeeNumber(){
		return this.employeeNumber;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return "\nEmployee number : "+this.employeeNumber+"\nName : "+this.name + "\nSalary : "+this.salary;		
	}
}

class Labour extends Employee{
	private double overtime;
	
	public Labour(int employeeNumber,String name,double salary, double overtime){
		super(employeeNumber,name,salary);
		this.overtime = overtime;
	}
	
	public double getSalary(){
		return super.getSalary() + this.overtime;
	}	
	
	public String toString(){
		return "\nEmployee number : "+super.getEmployeeNumber()+"\nName : "+super.getName()+ "\nSalary : "+this.getSalary();		
	}
}

class Manager extends Employee{
	private double incentive;
		
	public Manager(int employeeNumber,String name,double salary, double incentive){
		super(employeeNumber,name,salary);
		this.incentive = incentive;
	}
	
	public double getSalary(){
		return super.getSalary() + this.incentive;
	}
	
	public String toString(){
		return "\nEmployee number : "+super.getEmployeeNumber()+"\nName : "+super.getName()+ "\nSalary : "+this.getSalary();		
	}
}

class EmployeeMain{
	public static void main(String args[]){
		Employee[] employees = new Employee[10];
		employees[0] = new Employee(1,"Shrey",10000);
		employees[1] = new Labour(2,"Ankit",20000,1000);
		employees[2] = new Manager(3,"Archit",25000,5000);
		employees[3] = new Employee(4,"Archana",10000);
		employees[4] = new Labour(5,"Sneha",20000,1000);
		employees[5] = new Manager(6,"Mayur",25000,5000);
		employees[6] = new Employee(7,"Anand",10000);
		employees[7] = new Labour(8,"Aditya",20000,1000);
		employees[8] = new Manager(9,"Akshay",25000,5000);
		employees[9] = new Employee(10,"Piyush",10000);
		
		System.out.println("Total salary : "+getTotalSalary(employees));
	
	}
	
	public static double getTotalSalary(Employee[] employees){
		double totalSalary = 0;
		for(int i = 0;i<employees.length;i++){
			totalSalary += employees[i].getSalary();
		}
		return totalSalary;
	}
}