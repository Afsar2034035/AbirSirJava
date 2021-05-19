package MethodOverloading;

public class Add {
	
	void add()
	{
		System.out.println("No Parameter.");
	}
	
	void add(int a, int b)
	{
		System.out.println("Sum = "+(a+b));
	}

	void add(double a, double b)
	{
		System.out.println("Sum = "+(a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Sum = "+(a+b+c));
	}
}
