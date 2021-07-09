package conditionalOperator;
import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		String result;
		
		System.out.print("Enter a Number : ");
		a = input.nextInt();
		
		System.out.println();
		
		result = (a%2==0) ? "Even" : "Odd";
		
		System.out.print(a+" is "+result+" Number.");
		
		input.close();
	}

}
