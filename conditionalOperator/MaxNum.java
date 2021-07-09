package conditionalOperator;
import java.util.Scanner;

public class MaxNum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b,max;
		
		System.out.print("Enter First Number : ");
		a = input.nextInt();
		
		System.out.println();
		
		System.out.print("Enter Second Number : ");
		b = input.nextInt();
		
		max = (a>b) ? a : b;
		
		System.out.println();
		
		System.out.println("Maximum Number is : "+max);
		input.close();
	}

}
