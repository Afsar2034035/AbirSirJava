package finalLabXm;
import java.util.Scanner;

class B
{
	int a,b,c,d;
	double e;
	void input()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 4 Number : ");
		a = input.nextInt(); 
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
	}
	void avg()
	{
		e = (1.0)*(a+ b+ c + d)/4;
	}
	void output() {
		System.out.println("The Average : "+e);
	}

}

public class Que1{
	
	public static void main(String[] args) {

		B x = new B();
		x.input();
		x.avg();
		x.output();
	}

}

