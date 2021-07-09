package average;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, sum = 0;
		double result;
		
		System.out.print("Enter a Number : ");
		n = input.nextInt();
		
		int[] ara = new int[n+1];
		
		System.out.println();
		System.out.println("Enter "+n+" Number :");
		for(int i=0; i<n; i++)
		{
			ara[i] = input.nextInt();
			sum+= ara[i];
		}
		
		System.out.println("The sum is : "+sum);
		
		System.out.println();
		
		result = (sum*1.0)/n;
		
		System.out.println("The average is : "+result);
		
		input.close();
	}

}
