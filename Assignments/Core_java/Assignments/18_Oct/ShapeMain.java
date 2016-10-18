abstract class Shape{
	abstract public void draw();
}

class Line extends Shape{
	public void draw(){
		System.out.println("This is a line");
	}
}

class Rectangle extends Shape{
	public void draw(){
		System.out.println("This is a rectangle");
	}
}

class Cube extends Shape{
	public void draw(){
		System.out.println("This is a cube");
	}
}

class ShapeMain{
	public static void main(String args[]){
		Shape s[] = new Shape[3];
		s[0] = new Line();
		s[1] = new Rectangle();
		s[2] = new Cube();
		
		for(int i=0;i<s.length;i++){
			s[i].draw();
		}
	}
}