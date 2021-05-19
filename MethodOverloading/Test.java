package MethodOverloading;

public class Test {
	
	public static void main(String[] args)
	{
		Add a = new Add();
		
		a.add();
		a.add(10,15);
		a.add(14.21, 15.35);
		a.add(10,20,30);
	}

}
