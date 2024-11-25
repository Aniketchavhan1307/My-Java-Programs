package numberprograms;

import java.util.Scanner;

public class Duck_number 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the starting number...");
    	int start = sc.nextInt();
    	
//    	System.out.println("Enter the ending no...");
//    	int end = sc.nextInt();
//    	
    	while(start > 0 )
    	{
    		int rem = start%10;
    		if(rem == 0)
    		{
    			break;
    		}
    		start/=10;
    	}
    	if(start == 0)
    	{
    		System.out.println("is not duck number....."+ start);
    	}
    	else
    	{
    		System.out.println("is  duck number");
    	}
    }
}
