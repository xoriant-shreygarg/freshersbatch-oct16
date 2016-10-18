interface Sortable{
	boolean compare(Sortable s);
}

class Employee implements Sortable{
	private int id;
	private String name;
	public boolean compare(Sortable e){
		if(this.id>((Employee)e).getId())
			return true;
		return false;
	}
	public String toString(){
		return "Id : "+this.id+", Name : "+this.name;
	}
	public Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	public int getId(){
		return this.id;
	}
}

class Circle implements Sortable{
	private int radius;
	public boolean compare(Sortable[] s, int index){
		if(((Circle)s[index-1]).getRadius()>((Circle)s[index]).getRadius())
			return true;
		return false;
	}
	public String toString(){
		return "Radius : "+this.radius;
	}
	public boolean compare(Sortable e){
		if(this.radius>((Circle)e).getRadius())
			return true;
		return false;
	}
	public Circle(int radius){
		this.radius = radius;
	}
	public int getRadius(){
		return this.radius;
	}
}
	
class SortableMain{
	public static void main(String args[]){
		Sortable employees[] = new Sortable[3];
		employees[0] = new Employee(2,"Shrey");
		employees[1] = new Employee(3,"Archit");
		employees[2] = new Employee(1,"Sneha");
		Sortable circles[] = new Sortable[3];
		circles[0] = new Circle(10);
		circles[1] = new Circle(15);
		circles[2] = new Circle(20);
		sortAll(employees);
		sortAll(circles);
	}
	public static void sortAll(Sortable[] s){
		
		Sortable temp = null;  
         for(int i=0; i < s.length; i++){  
                 for(int j=i+1; j < s.length; j++){  
                          if(s[i].compare(s[j])){   
                                 temp = s[i];  
                                 s[i] = s[j];  
                                 s[j] = temp;  
                         }  
                 }  
         }
		
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}
