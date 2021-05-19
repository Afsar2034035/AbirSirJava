package ct1;
import java.util.Scanner;

public class B {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		A a = new A();
		
		double x,y;
		
		System.out.print("Enter a Number : ");
		x = input.nextDouble();
		
		System.out.print("Enter another Number : ");
		y = input.nextDouble();
		
		A.triangle(x,y);
		A.rectangle(x,y);
	}

}
