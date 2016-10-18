interface Printable{
	void print();
}
class Employee implements Printable{
	public void print(){
		System.out.println("Employee");
	}
}
class Circle implements Printable{
	public void print(){
		System.out.println("Circle");
	}
}
class PrintableMain{
	public static void main(String args[]){
		Printable p[] = new Printable[5];
		p[0] = new Employee();
		p[1] = new Circle();
		p[2] = new Employee();
		p[3] = new Circle();
		p[4] = new Employee();
		printAll(p);
	}
	public static void printAll(Printable[] p){
		for(int i=0;i<p.length;i++)
			p[i].print();
	}
}