package demo;

import java.util.Arrays;

public class StringToAscci
{
	public static void main(String... args ) {
		
		String s = "Aniket chavhan";
		
		//System.out.println(s.toUpperCase());
		
		//int[] a = s.toCharArray();
		
		int []a = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) 
		{
			a[i] = s.charAt(i);
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
}

