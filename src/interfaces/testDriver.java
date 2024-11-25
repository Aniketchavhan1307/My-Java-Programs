package interfaces;

public class testDriver 
{
	public static void main(String[] args)
	{
		test t1 = new testImp1();
		
		t1.add(23,55);	
		System.out.println(t1.add(23, 7));
		
		t1.subtract(44, 22);
		
		// t1.show();     we cannot access static method of interface if we want to then we gave the class name as a ref
							// because static method of interface can't inherit 
		test.show();
		
	//	t1.write();
   //   testImp1.write();      we can't write non-static method in interface
		
		System.out.println(t1.s);
		
		System.out.println(test.s);
		
		
		// System.out.println(t1.name);
		// System.out.println(testImp1.name);           non-static variable are not get inherited or access 
		
		System.out.println(t1.i);
		
		System.out.println(test.i);
		
		// System.out.println(testImp1.i);
		
	}
}
