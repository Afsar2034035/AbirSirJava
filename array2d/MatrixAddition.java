package array2d;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n,m;
		
		System.out.print("Enter Matrix Row Number : ");
		n = input.nextInt();
		
		System.out.print("Enter Matrix Column Number : ");
		m = input.nextInt();
		
		int[][] ara1 = new int[n][m];
		int[][] ara2 = new int[n][m];
		int[][] ara3 = new int[n][m];
		
		System.out.print("Enter "+(n*m)+" Numbers for 1st Matrix: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				ara1[i][j] = input.nextInt();
			}
		}
		
		
		System.out.print("Enter "+(n*m)+" Numbers for 2nd Matrix: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				ara2[i][j] = input.nextInt();
			}
		}
		
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				ara3[i][j] = ara1[i][j] + ara2[i][j];
			}
		}
		
		
		System.out.println();
		System.out.println("1st Matrix is : ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(ara1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("2nd Matrix is : ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(ara2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Matrix Addition is : ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(ara3[i][j]+" ");
			}
			System.out.println();
		}
		
		input.close();


	}

}
