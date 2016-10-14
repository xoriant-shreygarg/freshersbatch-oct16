public class Assignment6{
	public static void main(String[] args){
		int number = Integer.parseInt(args[0]);
		int numberCopy = number;
		int[] digits = new int[args[0].length()];
		
		for(int i=0;;i++){
			digits[i]=number%10;
			number/=10;
			if(number==0) break;
		}
		int total = 0;
		for(int i=0;i<args[0].length();i++)
		{
			int temp = digits[i];
			total += Math.pow(temp,3);
		}
		
		if(total == numberCopy)
			System.out.println("Armstrong number");
		else 
			System.out.println("Not an armstrong number");
	
		
	}
}