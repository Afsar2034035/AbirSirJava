package privateClass;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		A a = new A();
		String n;
		int r;
		
		System.out.print("Enter your Name : ");
		n = input.nextLine();
		
		System.out.print("Enter your Roll : ");
		r = input.nextInt();
		
		a.setNameRoll(n, r);
		
		System.out.println("Name is : "+a.getName());
		System.out.println("Roll is : "+a.getRoll());
		input.close();
				
	}

}
