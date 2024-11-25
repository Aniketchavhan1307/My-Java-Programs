package numberprograms;

import java.util.Scanner;

public class square
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the starting Number....");
		int num = sc.nextInt();
		
		for(int i = 1; i<=10; i++)
		{
			int sqr = i*num;
			
			System.out.println(num+"*"+i+"="+sqr);
		}
		System.out.println("=============");
		
		for(int i = 1; i<=10; i++)
		{
			int sqr = i*i;
			
			System.out.println(i+"*"+i+"="+sqr);
		}
	}
}
