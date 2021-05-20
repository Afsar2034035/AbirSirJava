package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(4, 50);
		num.add(60);
		
		num.set(3, 40);
		
		num1.addAll(num); 
		
		//System.out.println(num);
		
		//num.remove(3);
		//num.clear();
		
		
		System.out.println("Traditional For Loop For Num: ");
		for(int i=0; i<num.size(); i++)
		{
			System.out.println(num.get(i));
		}
		
		System.out.println("Traditional For Loop For Num1: ");
		for(int i=0; i<num1.size(); i++)
		{
			System.out.println(num1.get(i));
		}
		
		/*
		 * System.out.println("For Each Loop : "); for(int x: num) {
		 * System.out.println(x); }
		 */
		
		/*
		 * System.out.println("Iterator : "); Iterator it = num.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		
		/*
		 * boolean a = num.equals(num1); System.out.println(a);
		 */
		
		/*
		 * boolean b = num.contains(35); System.out.println(b);
		 */
		
		/*
		 * boolean c = num.isEmpty(); System.out.println(c);
		 */
		
		/*
		 * int pos = num.indexOf(40); System.out.println(pos);
		 */
		
		

	}

}
