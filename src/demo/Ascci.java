package demo;

public class Ascci 
{

	public static void main(String[] args) 
	{
//		int t = 65;
//		System.out.println((char)t);
//		
		int [] a = {5,26,65,4,66,26,123,66,85,90, 97,98,100,105};
		
		System.out.println(a.length);
		System.out.println("===============");
		int i;
		for( i=0; i<a.length; i++)
		{
			if(a[i]>65 && a[i]<122)
			{
			System.out.println((char)a[i]);
		}
		}
	}
	
	
}
