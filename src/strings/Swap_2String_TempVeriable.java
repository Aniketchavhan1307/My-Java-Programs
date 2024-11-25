package strings;

public class Swap_2String_TempVeriable 
{
	public static void main(String[] args) 
	{
		String a = "India";
		String b = "Bharat";
		
		System.out.println("befor swap a = " + a + " and b = "+ b);
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("after swap a = " + a + " and b = "+ b);
		
	}

}
