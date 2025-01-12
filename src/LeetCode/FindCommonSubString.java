package LeetCode;

import java.util.Arrays;
import java.util.List;

public class FindCommonSubString 
{
	
//	condition :- 
//	Input: strs = ["flower","flow","flight"]
//			Output: "fl"
//			Example 2:
//
//			Input: strs = ["dog","racecar","car"]
//			Output: ""
//			Explanation: There is no common prefix among the input strings.
//			 
	
	
	public static void main(String[] args) 
	{
		 String[] strs1 = {"flower", "flow", "flight"};
	        System.out.println("Output: " + longestCommonPrefix(strs1)); // Output: "fl"

	        // Example 2
	        String[] strs2 = {"car", "carracecar", "car"};
	        System.out.println("Output: " + longestCommonPrefix(strs2)); // Output: ""
		
	}

	public static String longestCommonPrefix(String[] str) 
	{
//		if(str == null || str.length == 0)
//			return "";
		
		StringBuilder builder = new StringBuilder();
		
		
		//String ans = "";
		
		Arrays.sort(str);
		
		int min = str[0].length() < str[1].length() ? str[0].length() : str[1].length();
		System.out.println(min);
		
		char[] first = str[0].toCharArray();
		char[] last = str[str.length-1].toCharArray();
		
		
		for(int i=0; i<min; i++)
		{
			if(first[i] != last[i]) break;
			
			//ans+= first[i];
			
			builder.append(first[i]);
		}
		
		return builder.toString();
	
	}

}
