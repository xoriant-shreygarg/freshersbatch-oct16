
class Employee implements Cloneable{
	private Date dateOfBirth;
	public String toString(){
		return this.dateOfBirth.toString();
	}
	public Employee(int day, int month, int year){
		this.dateOfBirth = new Date(day, month, year);
	}
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	public Date getDate(){
		return this.dateOfBirth;
	}
}
class Date{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day){
		this.day = day;
	}
	public String toString(){
		return "\nDay : "+this.day+", month : "+this.month+",year : "+this.year;
	}
}
class EmployeeMain{
	public static void main(String args[]){
		Employee e1 = new Employee(11,11,1992);
		System.out.print(e1);
		e1.getDate().setDay(12);
		System.out.print(e1);
		try{
			Employee e2 = (Employee) e1.clone();
			System.out.print(e2);
		}catch(CloneNotSupportedException e){}
	}
}