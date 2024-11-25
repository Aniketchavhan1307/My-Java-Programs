package stringsBuffer;

public class CheckLength 
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Aniket");
		
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		
		
		//System.out.println(s.lastIndexOf("Aniket"));
		
		System.out.println(s.substring(3));
		
		System.out.println(s.substring(1, 5));
		
		String p = s.toString();
		System.out.println(p);
		
		System.out.println(s.toString());
		
		System.out.println(s.subSequence(1, 5));
		
		System.out.println(s.lastIndexOf("ket"));
	}

}
