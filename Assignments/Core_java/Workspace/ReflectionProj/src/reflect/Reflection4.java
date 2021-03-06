package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class D{
	private int val = 10;
	private int square(Integer x){
		return x*x;
	}
}
@SuppressWarnings("unchecked") 
public class Reflection4 {
	public static void main (String[] args) throws Exception {
		Class c = Class.forName("reflect.D");
		Method m = c.getDeclaredMethod("square", new Class[]{Integer.class});
		Field f = c.getDeclaredField("val");
		f.setAccessible(true);
		System.out.println("Value : " + f.getInt(new D()));
		m.setAccessible(true);
		System.out.println("Square : " + m.invoke(new D(),new Object[]{5}));
	}
}

/*
>java -Djava.security.manager -Djava.security.policy==mypolicy.policy reflect.Reflection4

Exception in thread "main" java.security.AccessControlException: access denied (
"java.lang.reflect.ReflectPermission" "suppressAccessChecks")
        at java.security.AccessControlContext.checkPermission(AccessControlConte
xt.java:457)
        at java.security.AccessController.checkPermission(AccessController.java:
884)
        at java.lang.SecurityManager.checkPermission(SecurityManager.java:549)
        at java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.jav
a:128)
        at reflect.Reflection4.main(Reflection4.java:18)
        
>java  reflect.Reflection4
Value : 10
Square : 25
*/