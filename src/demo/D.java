package demo;

public class D {
	
	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40};
		int noChangable = 5;
		
		check(ar, noChangable);
		
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
		
		System.out.println(noChangable);
	}
	
	public static void check(int[] ar, int non)
	{
		non= 10;
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]= ar[i]+1;
			
		}
		System.out.println(non);
	}

}
