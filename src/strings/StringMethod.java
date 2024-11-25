package strings;

import java.util.Arrays;

public class StringMethod 
{
	public static void main(String[] args) 
	{
		String s = "Bharat is my country";
		String s1 = "Bharat is my country";
		String a = "My name is Aniket";
		
		System.out.println(s.compareTo(s1));
		
		
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		System.out.println(s.indexOf('t',6));
		System.out.println(s.indexOf('t'));
		System.out.println(s.replace('a','@'));
		
		String []sp = s.split(" ");
		System.out.println(Arrays.toString(sp));
		System.out.println(s.subSequence(3, 17));
		
		char []ch = s.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		System.out.println("    abc    ".trim());
		
		System.out.println(s.codePointAt(6));
		
		s.getChars(4, 15, ch, 5);
		System.out.println(Arrays.toString(ch));
		
		System.out.println(s.contains("er"));
		System.out.println(s.endsWith("e"));
		
		System.out.println(s.toString());
	System.out.println(s.intern());	
		
	
	System.out.println(s.startsWith("B"));
	System.out.println(s.lastIndexOf("y"));
	
	
	}

}
