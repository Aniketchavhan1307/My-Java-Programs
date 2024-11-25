package coding_ninjas;

import java.util.Scanner;

public class CheckDataType 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the DataType...");
		
		String dataType = sc.next();
		
		int value = checkDataType(dataType);
		
		System.out.println(value);
		
	}
	
	public static int checkDataType(String type)
	{
		switch (type) 
		{
		case "Integer": 
		{
			
			return 4;
		}
		
		case "Short": 
		{
			
			return 2;
		}
		
		case "Double": 
		{
			
			return 8;
		}
		
		case "Long": 
		{
			
			return 8;
		}
		
		case "Character": 
		{
			
			return 1;
		}
		
		case "Float": 
		{
			
			return 4;
		}
		
		default:
			return -1;
		}
	}

}
