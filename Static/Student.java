package Static;

public class Student {
	
	String name;
	int roll;
	static String uni = "BGC Trust University Bangladesh";
	
	Student(String n, int r)
	{
		name = n;
		roll = r;
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("University : "+uni);
		System.out.println();
	}
	
	/*void display(String n, int r)
	{
		name = n;
		roll = r;
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("University : "+uni);
		System.out.println();
	}*/

}
