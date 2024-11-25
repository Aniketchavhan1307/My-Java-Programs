package oops;

public class MobileDriver {

	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("Samsung", 50000.00, "white", "S 21", 8, 256, "Snapdrogon", 3);
		
		m1.displayMobile();
		m1.bat.showBattery();
		
	}

}
