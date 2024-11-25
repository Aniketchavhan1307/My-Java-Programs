package demo;

import java.util.Scanner;

public class operator 
{
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(10.0%0);
		
		System.out.println("enter the no..");
		double no = sc.nextDouble();
		
		System.out.println("enter the den..");
		double den = sc.nextDouble();
		
		double result =no/den;
		System.out.println(result);
		
		System.out.println("square of no..");
		int sqr = sc.nextInt();
		
		int square = sqr*sqr;
		
		System.out.println(square);
		
		
	}

}
