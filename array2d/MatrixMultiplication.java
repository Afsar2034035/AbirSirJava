package array2d;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1,m1,n2,m2,sum=0;
		
		System.out.print("Enter 1st Matrix Row Number : ");
		n1 = input.nextInt();
		
		System.out.print("Enter 1st Matrix Column Number : ");
		m1 = input.nextInt();
		
		System.out.print("Enter 2nd Matrix Row Number : ");
		n2 = input.nextInt();
		
		System.out.print("Enter 2nd Matrix Column Number : ");
		m2 = input.nextInt();
		
		int[][] ara1 = new int[n1][m1];
		int[][] ara2 = new int[n2][m2];
		int[][] ara3 = new int[n1][m2];
		
		
		if(m1==n2)
		{
		
			System.out.print("Enter "+(n1*m1)+" Numbers for 1st Matrix: ");
			for(int i=0; i<n1; i++)
			{
				for(int j=0; j<m1; j++)
				{
					ara1[i][j] = input.nextInt();
				}
			}
			
			
			System.out.print("Enter "+(n2*m2)+" Numbers for 2nd Matrix: ");
			for(int i=0; i<n2; i++)
			{
				for(int j=0; j<m2; j++)
				{
					ara2[i][j] = input.nextInt();
				}
			}
			
			
			for(int i=0; i<n1; i++)
			{
				for(int j=0; j<m2; j++)
				{
					for(int k=0; k<m1; k++)
					{
						sum+=(ara1[i][k] * ara2[k][j]);
					}
					ara3[i][j] = sum;
					sum = 0;
				}
			}
			
			
			System.out.println();
			System.out.println("1st Matrix is : ");
			for(int i=0; i<n1; i++)
			{
				for(int j=0; j<m1; j++)
				{
					System.out.print(ara1[i][j]+" ");
				}
				System.out.println();
			}
			
			
			System.out.println();
			System.out.println("2nd Matrix is : ");
			for(int i=0; i<n2; i++)
			{
				for(int j=0; j<m2; j++)
				{
					System.out.print(ara2[i][j]+" ");
				}
				System.out.println();
			}
			
			
			System.out.println();
			System.out.println("Matrix Multiplication is : ");
			for(int i=0; i<n1; i++)
			{
				for(int j=0; j<m2; j++)
				{
					System.out.print(ara3[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
		else
		{
			System.out.println();
			System.out.println("Error!!! You must take same value as First Matrix Column Number and Second Matrix Row Number.");
		}
		input.close();


	}

}
