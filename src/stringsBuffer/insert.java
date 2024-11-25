package stringsBuffer;

public class insert 
{
	public static void main(String[] args) 
	{
		StringBuffer s = new StringBuffer("Aniket");
		
		s.insert(1, "Hello");
		s.insert(8, 1234);
		System.out.println(s);
		
	}

}
