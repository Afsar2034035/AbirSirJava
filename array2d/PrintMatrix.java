package array2d;

import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n,m;
		
		System.out.print("Enter Row Number : ");
		n = input.nextInt();
		
		System.out.print("Enter Column Number : ");
		m = input.nextInt();
		
		int[][] ara = new int[n][m];
		
		System.out.print("Enter "+(n*m)+" Numbers : ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				ara[i][j] = input.nextInt();
			}
		}
		
		
		System.out.println();
		System.out.println("2D Array is : ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(ara[i][j]+" ");
			}
			System.out.println();
		}
		
		
		input.close();

	}

}
