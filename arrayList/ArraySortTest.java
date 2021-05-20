package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(40);
		num.add(10);
		num.add(-30);
		num.add(80);
		num.add(30);
		num.add(-10);
		
		System.out.println(num);
		
		System.out.println("Ascending Order : ");
		Collections.sort(num);
		for(int x: num)
		{
			System.out.println(x);
		}
		
		System.out.println("Descending Order : ");
		Collections.reverse(num);
		//Collections.sort(num, Collections.reverseOrder());
		for(int x: num)
		{
			System.out.println(x);
		}
	}

}
