interface Printable{
	void print();
}
class Employee implements Printable{
	void print(){
		System.out.println("Employee");
	}
}
class Circle implements Printable{
	void print(){
		System.out.println("Circle");
	}
}
class PrintableMain{
	public static void main(String args[]){
		Printable p = new Printable[5];
		p[0] = new Employee();
		p[1] = new Circle();
		p[2] = new Employee();
		p[3] = new Circle();
		p[4] = new Employee();
		printAll(p);
	}
	public staic void printAll(Printable[] p){
		for(int i=0;i<p.length;i++)
			System.out.println(p[i].print());
	}
}