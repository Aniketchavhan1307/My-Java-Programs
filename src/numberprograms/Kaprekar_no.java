package numberprograms;

import java.util.Scanner;

public class Kaprekar_no 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number......");
		
		int ip = sc.nextInt();
		
		int temp = ip;
		
		
		
		int sqr = ip*ip;
		
		int count= count(sqr);
		
		if(count%2==0 )
		{
			int den = power(10, count/2);
			
			int lastHalf = sqr %den;
			int firstHalf = sqr / den;
			
			int sum = lastHalf + firstHalf;
			
			if(sum == temp )
			{
				System.out.println("The number is a Kaprekar number");
			}
			else
			{
				System.out.println("The number not  Kaprekar number");

			}
			
		}
		else
		{
			System.out.println("The number not  Kaprekar number");
			System.out.println("else");
		}
		
	}
	
	public static int count(int num)
	{
		int ct= 0;
		while (num>0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	
	public static int power(int base, int raise)
	{
		int power =1;
		
		for(int i=0; i<raise; i++)
		{
			power = power*base;
		}
		return power;
	}

}
