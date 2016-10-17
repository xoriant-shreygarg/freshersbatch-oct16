public class Assignment4{
	public static void main(String[] args){
		int[] marks = new int[args.length];
		for(int i=0;i<args.length;i++){
			marks[i] = Integer.parseInt(args[i]);
		}
		int counter = 0;
		for(int i=0;i<args.length;i++){
			if(marks[i]>60)
				counter++;
		}
		if(counter==3)
			System.out.println("Passed");
		else if(counter==2)
			System.out.println("Promoted");
		else 
			System.out.println("Failed");
		
	}
}