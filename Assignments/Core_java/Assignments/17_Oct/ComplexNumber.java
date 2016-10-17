class ComplexNumber{
	private int real, imaginary;
	
	public ComplexNumber(){
		real = 11;
		imaginary = 9;
	}
	public ComplexNumber(int real,int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	public void add(ComplexNumber c1, ComplexNumber c2){
		System.out.println("Addition : ("+(c1.real+c2.real)+","+(c1.imaginary+c2.imaginary)+")");
	}
	public void subtract(ComplexNumber c1, ComplexNumber c2){
		System.out.println("Subtaction : ("+(c1.real-c2.real)+","+(c1.imaginary-c2.imaginary)+")");
	}
	public void multiply(ComplexNumber c1, ComplexNumber c2){
		System.out.println("Multiply : ("+(c1.real*c2.real)+","+(c1.imaginary*c2.imaginary)+")");
	}
	public void swap(ComplexNumber[] complexNumberArray){
		ComplexNumber tempComplexNumber = complexNumberArray[0];
		complexNumberArray[0] = complexNumberArray[1];
		complexNumberArray[1] = tempComplexNumber;
	}
	public void printComplexNumber(){
		System.out.println("("+(this.real)+","+(this.imaginary)+")");
	}
	public static void main(String args[]){
		ComplexNumber c1 = new ComplexNumber(1,2);
		ComplexNumber c2 = new ComplexNumber(3,4);
		c1.add(c1,c2);
		c1.subtract(c1,c2);
		c1.multiply(c1,c2);
		ComplexNumber[] complexNumberArray = new ComplexNumber[2];
		complexNumberArray[0] = c1;
		complexNumberArray[1] = c2;
		for(int i=0;i<complexNumberArray.length;i++){
			complexNumberArray[i].printComplexNumber();
		}
		c1.swap(complexNumberArray);
		for(int i=0;i<complexNumberArray.length;i++){
			complexNumberArray[i].printComplexNumber();
		}
		
	}
}