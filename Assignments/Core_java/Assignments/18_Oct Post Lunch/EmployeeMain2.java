
class Employee implements Cloneable{
	 Date dateOfBirth;
	public String toString(){
		return this.dateOfBirth.toString();
	}
	public Employee(int day, int month, int year){
		this.dateOfBirth = new Date(day, month, year);
	}
	protected Object clone() throws CloneNotSupportedException
    {
        Object o = super.clone();
		((Employee)o).dateOfBirth = (Date) this.dateOfBirth.clone();
		return o;
    }
	public Date getDate(){
		return this.dateOfBirth;
	}
	public void setDate(Date d){
		this.dateOfBirth = d;
	}
}
class Date implements Cloneable{
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
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class EmployeeMain2{
	public static void main(String args[]){
		Employee e1 = new Employee(11,11,1992);
		System.out.print(e1);
		Employee e2 = null;
		try{
			e2 = (Employee) e1.clone();
			System.out.print(e2);
		}catch(CloneNotSupportedException e){}
		e1.getDate().setDay(13);
		System.out.print(e1);
		System.out.print(e2);
		
		//System.out.println(e1.getDate().hashCode());
		//System.out.println(e2.dateOfBirth.hashCode());
	}
}