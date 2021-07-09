package conditionalOperator;
import java.util.Scanner;

public class MinNum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b,min;
		
		System.out.print("Enter First Number : ");
		a = input.nextInt();
		
		System.out.println();
		
		System.out.print("Enter Second Number : ");
		b = input.nextInt();
		
		System.out.println();
		
		min = (a<b) ? a : b;
		
		System.out.println("Minimum Number is : "+min);
		input.close();
	}

}
