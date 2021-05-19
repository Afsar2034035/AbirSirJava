package string;

import java.util.Scanner;

public class String_Buffer {

	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String s1;
		
		System.out.print("Enter a String : ");
		s1 = input.nextLine();
		
		System.out.println("String is : "+s1);

        StringBuffer s = new StringBuffer(s1);

        System.out.println("String Buffer is : "+s);

        s.append(" Hossain.");
        System.out.println("String Buffer Append is : "+s);

//        s.reverse();
//        System.out.println("String Buffer Reverse is : "+s);

//        s.delete(0,5);
//        System.out.println("String Buffer Deleter : "+s);

//        s.setLength(8);
//        System.out.println("String Buffer Length is : "+s);
		
		input.close();
    }
}
