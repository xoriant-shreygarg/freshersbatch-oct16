public class Assignment7{
	public static void main(String[] args){
		
		for(int counter=100;counter<1000;counter++){
			int number = counter;
			int numberCopy = number;
			int[] digits = new int[3];
		
			for(int i=0;;i++){
				digits[i]=number%10;
				number/=10;
				if(number==0) break;
			}
			int total = 0;
			for(int i=0;i<3;i++)
			{
				total += Math.pow(digits[i],3);
			}
		
			if(total == numberCopy)
				System.out.println(numberCopy);
	}
		
	}
}