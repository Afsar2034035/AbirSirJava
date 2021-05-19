package ValueReturn;

class A
{
	int square(int l)
	{
		return l*l;
	}
	
}

public class First {
	
	public static void main(String[] args)
	{
		A a = new A();
		
		int result;
		
		result = a.square(12);
		
		System.out.println("Square is : "+result);
	}
}
