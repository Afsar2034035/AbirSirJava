package ct2;

import java.util.Scanner;

public class A {
	
	static int n;
	
	A()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = input.nextInt();
		
		int sum=0;
		
		for(int i=9; i>=n; i-=2)
		{
			sum = sum + i;
		}
		
		System.out.println("The Sum is : "+sum);
	}
	
	

}
