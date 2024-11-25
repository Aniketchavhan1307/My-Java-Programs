package demo;

public class test2 {
	
	static {
		System.out.println("From static block"
				+ " of test2 class");
		
		test t2 = new test();
		t2.showtest2();
		
		System.out.println("value of test t2 object");
	}
	public static void main(String [] args )
	{
		
		
		System.out.println("from main method()");
		
		test t1 = new test();
		
		t1.showtest();
		
		System.out.println("value of test t1 object");
				
	}
}
