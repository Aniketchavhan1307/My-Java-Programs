package stringsBuffer;

public class CheckCapacity 
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer();
		
		
		System.out.println(s.capacity());
		
		s.append("Hello");
		System.out.println(s);
		
		System.out.println(s.capacity());
		
		s.append("java is my favourite language");
		
		System.out.println(s);
		
		System.err.println(s.capacity());
		
		
		
//		StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity()); // default 16
//        sb.append("Hello");
//        System.out.println(sb.capacity()); // now 16
//        sb.append("java is my favourite language");
//        System.out.println(sb.capacity());
//        // Now (16*2)+2=34     i.e (oldcapacity*2)+2
		
		
		
	}

}
