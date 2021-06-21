package finalLabXm;
import java.util.ArrayList;
import java.util.Iterator;

public class Que2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(70);
		num.add(80);
		num.add(90);
		num.add(100);

		
		System.out.println("Traditional For Loop For Num: ");
		for(int i=0; i<num.size(); i++)
		{
			System.out.println(num.get(i));
		}
	}
}
