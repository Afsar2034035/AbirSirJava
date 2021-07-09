package conditionalOperator;
import java.util.Scanner;

public class PosNeg {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		String result;
		
		System.out.print("Enter a Number : ");
		a = input.nextInt();
		
		System.out.println();
		
		result = (a>0) ? "Positive" : "Negative";
		
		System.out.println(a+" is "+result+" Number.");
		
		input.close();
	}

}
