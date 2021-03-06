package com.generics;

//class GenericWrapper{
//	Object obj;
//	public Object getObj() {
//		return this.obj;
//	}
//	public void setObj(Object obj) {
//		this.obj = obj;
//	}
//}

class GenericWrapper<T>{
	T t;
	public T get() {
		return this.t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class Generics1 {
	
	public static void main(String[] args) {
//		GenericWrapper genericWrapper = new GenericWrapper();
//		String str = "ABC";
//		genericWrapper.setObj(str);
//		str = genericWrapper.getObj();
		GenericWrapper<String> genericWrapper = new GenericWrapper<>();
		genericWrapper.set("ABC");
		System.out.println(genericWrapper.get());
		GenericWrapper<Integer> genericWrapper2 = new GenericWrapper<>();
		genericWrapper2.set(1);
		System.out.println(genericWrapper2.get());
	}

}
