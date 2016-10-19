package reflect;

class C{
	public C(){
		System.out.println("Hello from Class C");
	}
}

public class Reflection3 {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName(args[0]);
		Object o = c.newInstance();
	}

}
