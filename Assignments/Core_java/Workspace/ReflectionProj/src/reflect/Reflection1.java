package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection1 {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName(args[0]);
		Constructor constructor[] = c.getDeclaredConstructors();
		Method method[] = c.getDeclaredMethods();
		Field field[] = c.getDeclaredFields();
		for(Constructor ctr: constructor)
			System.out.println(ctr);
		System.out.println();
		for(Method m: method)
			System.out.println(m);
		System.out.println();
		for(Field f: field)
			System.out.println(f);
	}

}

class A{
	private int i;
	public void fun(){}
}
