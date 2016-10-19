class Banner{
	public static void main(String args[]) throws Exception{
		//StringBuffer s = new StringBuffer("This is a StringBuffer");
		StringBuilder s = new StringBuilder("This is a StringBuilder");
		while(true){
			System.out.print("\r"+s);
			char c = s.charAt(0);
			StringBuilder temp = new StringBuilder(s.substring(1,s.length()));
			s = temp.append(""+c);
			Thread.sleep(100);
		}
	}
}