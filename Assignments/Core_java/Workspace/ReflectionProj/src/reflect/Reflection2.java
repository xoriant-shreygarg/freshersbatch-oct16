package reflect;

import java.lang.reflect.Method;

class B{
	private int square(Integer x){
		return x*x;
	}
}

class Middleware{
	public Object invoke(String className, String methodName, Class[] paramTypes, Object[] paramValues) throws Exception{
		Class c = Class.forName(className);
		Method m = c.getDeclaredMethod(methodName, paramTypes);
		m.setAccessible(true);
		return m.invoke(c.newInstance(),paramValues);
	}
}

public class Reflection2 {
	public static void main (String[] args) throws Exception {
		System.out.println("Square : "+new Middleware().invoke("reflect.B", "square", new Class[]{Integer.class}, new Integer[]{5}));
	}
}
