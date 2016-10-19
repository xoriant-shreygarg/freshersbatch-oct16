class String1{
	public static void main(String args[]){
		String s1 = "ABC";
		String s2 = new String("ABC");
		String s3 = "ABC";
		String s4 = new String("ABC");
		
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s1==s3 "+(s1==s3));
		System.out.println("s2==s4 "+(s3==s4));
		
		//---
		
		System.out.println("\nString without new String()");
		System.out.println("----------------------------");
		String str = "Hello";
		System.out.println("Before appending "+str.hashCode());
		str += " World";
		System.out.println("After appending "+str.hashCode());
		
		System.out.println("\nString with new String()");
		System.out.println("----------------------------");
		String strnew = new String("Hello");
		System.out.println("Before appending "+strnew.hashCode());
		strnew += " World";
		System.out.println("After appending "+strnew.hashCode());
		
		System.out.println("\nString buffer");
		System.out.println("----------------------------");
		StringBuffer strbfr = new StringBuffer("Hello");
		System.out.println("Before appending "+strbfr.hashCode());
		strbfr = strbfr.append(" World");
		System.out.println("After appending "+strbfr.hashCode());
		
		System.out.println("\nString builder");
		System.out.println("----------------------------");
		StringBuilder strbdr = new StringBuilder("Hello");
		System.out.println("Before appending "+strbdr.hashCode());
		strbdr = strbdr.append(" World");
		System.out.println("After appending "+strbdr.hashCode());
	}
}