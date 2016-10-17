import java.util.ArrayList;
import java.util.Scanner;
public class Assignment9{
	public static void main(String[] args){
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 numbers :");
		ArrayList<Integer> userNumbers = new ArrayList<>(),randomNumbers = new ArrayList<>();
		
		while(randomNumbers.size()<6){
			int randomNumber = (int)(Math.random()*100);
			if(randomNumber>=1&&randomNumber<=49&&!randomNumbers.contains(randomNumber))
				randomNumbers.add(randomNumber);
		}
		
		while(userNumbers.size()<6){
			int temp = Integer.parseInt(sc.next());
			if(!userNumbers.contains(temp)&&temp>=1&&temp<=49)
				userNumbers.add(temp);
			else
				System.out.println("Enter some other number. Between 1-49");
		}
		
		for(int i=0;i<randomNumbers.size();i++){
			System.out.println("user " +userNumbers.get(i));
			System.out.println("random " +randomNumbers.get(i));
			if(userNumbers.contains(randomNumbers.get(i))){
			System.out.println("Congratulations!!! Number : "+randomNumbers.get(i)+" won!");
			flag = true;}
		}
		
		if(!flag)
			System.out.println("Sorry you didnt win");
	}
}