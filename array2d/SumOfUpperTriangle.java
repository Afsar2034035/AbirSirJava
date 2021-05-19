package array2d;

import java.util.Scanner;

public class SumOfUpperTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter Row & Column Number : ");
		n = input.nextInt();
		
		
		int[][] ara = new int[n][n];
		
		System.out.print("Enter "+(n*n)+" Numbers : ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				ara[i][j] = input.nextInt();
			}
		}
		
		int sum = 0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i<j)
				{
					sum+=ara[i][j];
				}
			}
		}

		System.out.println();
		System.out.println("Matrix is : ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(ara[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sum Of Upper Triangular : "+sum);
		
		input.close();


	}

}
