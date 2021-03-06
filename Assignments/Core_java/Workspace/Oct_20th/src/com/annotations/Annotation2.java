package com.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

class Test{
	private String name;
	private int age;
	private int number;
	
	@Getter
	public String getName() {
		return name;
	}
	
	@Getter
	public int getAge() {
		return age;
	}
	
	@Getter
	public void print() {
		
	}	
	
	@Getter
	public void fun() {
		
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", number=" + number + "]";
	}
	
	
}

public class Annotation2 {

	public static void main(String[] args) throws Exception {
//		Method m[] = Test.class.getDeclaredMethods();
//		Field f[] = Test.class.getDeclaredFields();
		
//		for(int i=0;i<m.length;i++){
//			Annotation[] a = m[i].getAnnotations();
//			for(int j=0;j<a.length;j++){
//				if(a[j] instanceof Getter){
//					String fieldName = m[i].getName().replace("get", "");
//					fieldName = fieldName.toLowerCase();
//					boolean flag = false;
//					for(int k=0;k<f.length;k++){
//						if(f[k].getName().equals(fieldName)){
//							flag = true;
//						}
//					}
//					if(!flag){
//						System.out.println("Method "+m[i].getName()+" isn't declared properly.");
//					}
//				}
//			}
//		}
		
		ArrayList<Method> mArrayList = new ArrayList<>(Arrays.asList(Test.class.getDeclaredMethods()));
		ArrayList<String> fNamesArrayList = new ArrayList<>();
		for(Field f : new ArrayList<>(Arrays.asList(Test.class.getDeclaredFields())))
			fNamesArrayList.add(f.getName());
		
		for(Method m : mArrayList)
			if(m.getAnnotation(Getter.class)!=null)
				if(!fNamesArrayList.contains(m.getName().replace("get", "").toLowerCase())) 
					System.out.println("Method "+m.getName()+" isn't correctly defined.");
		
	}

}
