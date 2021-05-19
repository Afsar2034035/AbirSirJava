package assignment1;
import java.util.Scanner;

public class SirDetails {
	
	Scanner input = new Scanner(System.in);
	
	String name, designation, qualification;
	int salary, age;
	
	void getInfo()
	{
		System.out.print("Enter your name : ");
		name = input.nextLine();
		
		System.out.print("Enter your designation : ");
		designation = input.nextLine();
		
		System.out.print("Enter your qualification : ");
		qualification = input.nextLine();
		
		System.out.print("Enter your age : ");
		age = input.nextInt();
		
		System.out.print("Enter your salary : ");
		salary = input.nextInt();
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Your Name is : "+name);
		System.out.println("Your Designation is : "+designation);
		System.out.println("Your Qualification : "+qualification);
		System.out.println("Your Age is : "+age);
		System.out.println("Youe Salary is : "+salary);
		System.out.println();
	}

}
