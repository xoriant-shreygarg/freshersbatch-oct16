package com.annotations;

class A{
	@Deprecated
	public void fun(){
		System.out.println("Hello!");
	}
	public void fun2(){
		System.out.println("Hey!");
	}
}

class B extends A{
	@Override
	public void fun2(){
		System.out.println("Hey there!");
	}
}

public class Annotations1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		new A().fun();
		new B().fun2();
	}

}
