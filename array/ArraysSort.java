package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter a Number : ");
		n = input.nextInt();
		
		int[] ara = new int[n];
		
		System.out.print("Enter "+n+" numbers : ");
		
		for(int i=0; i<n; i++)
		{
			ara[i] = input.nextInt();
		}
		
		System.out.print("Array is : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(ara[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(ara);
		
		System.out.print("Ascending order : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(ara[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Descending order : ");
		for(int i=n-1; i>=0; i--)
		{
			System.out.print(ara[i]+" ");
		}
		
		System.out.println();
		
		
		input.close();

	}

}
