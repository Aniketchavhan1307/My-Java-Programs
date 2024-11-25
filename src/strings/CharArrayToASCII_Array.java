package strings;

import java.util.Arrays;

public class CharArrayToASCII_Array 
{
	public static void main(String[] args) 
	{
		String s ="Qspider";
		
		
		int []ar = charToAscii(s);
		
		System.out.println(Arrays.toString(ar));
		
		char[]arr = stringToCharArray(s);
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+",");
			
		}
		
	}
	
	public static int[] charToAscii(String s)
	{
		int [] ar = new int [s.length()];
	
		
		for(int i =0; i<ar.length; i++)
		{
			ar[i] = s.charAt(i);
		}
		
		return ar;
	}
	
	
	public static char[] stringToCharArray(String s)
	{
		
		char [] arr = new char [s.length()];
		
		
		for(int i =0; i<arr.length; i++)
		{
			arr[i] = s.charAt(i);
		}
		
		return arr;
	}


}
