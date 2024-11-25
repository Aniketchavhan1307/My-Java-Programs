package demo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementUserInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array values.... ");
		
		int []ar = new int[10];
		
		for (int i = 0; i < ar.length; i++)
		{

			int ip = sc.nextInt();
			
			ar[i] = ip;
			
		}
		
		System.out.println(Arrays.toString(ar));
	}

}
