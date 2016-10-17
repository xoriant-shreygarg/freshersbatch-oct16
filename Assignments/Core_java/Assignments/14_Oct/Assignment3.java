public class Assignment3{
	public static void main(String[] args){
		int[] numbers = new int[args.length];
		for(int i=0;i<args.length;i++){
			numbers[i] = Integer.parseInt(args[i]);
		}
		
		int temp = 0;  
         for(int i=0; i < args.length; i++){  
                 for(int j=1; j < (args.length-i); j++){  
                          if(numbers[j-1] > numbers[j]){   
                                 temp = numbers[j-1];  
                                 numbers[j-1] = numbers[j];  
                                 numbers[j] = temp;  
                         }  
                          
                 }  
         }

		
		for(int i=0;i<args.length;i++){
			System.out.println(numbers[i]);
		}
	}
}