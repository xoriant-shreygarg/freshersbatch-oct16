package stud;

import fact.*;

public class Student{
	public static void main(String args[]){
		Faculty f = new Faculty();
		System.out.println("Marks = "+f.getStudentMarks(1));
	}
}