package demo;
public class A 
{
		private static int x =100;
		private char ch = 'a';
		
		private static void demo1()
		{
			System.out.println("from static demo()");
		}
		private void test()
		{
			System.out.println("from non-static test");
		}
		private A()
		{
			
		}
		public static void main(String[] args) 
		{
			System.out.println(x);
			System.out.println(new A().ch);
			System.out.println(new A().hashCode());
			System.out.println(new A());
			
			demo1();
			A.demo1();
			
			new A().test();
			System.out.println("=========================");
			
			new A().test();
			
			A a1 = new A();
			System.out.println(a1.x);
			System.out.println(A.x);
			
			System.out.println(a1.ch);
			
			// System.out.println(A.ch);              we cannot access non static member with the 
														//help of class ref....like static member...
			a1.test();
			a1.demo1();
			demo1();
			
			System.out.println(a1.hashCode());
			System.out.println(a1);
			
			
		}
}
