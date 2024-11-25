package oops;

public class Battery
{
	String brand;
	int cap;
	String type;
	int warrenty;
	double price;
	
	public Battery() 
	{
		
	}
	
	Battery(String brand, int cap, String type , int warrenty, double price)
	{
		this.brand = brand;
		this.cap = cap;
		this.type = type;
		this.warrenty = warrenty;
		this.price = price;
		
		System.out.println(" Battery created.........!");
		
	}
	
	public void showBattery()
	{
		System.out.println("Battery...............");
		System.out.println("Brand :"+ brand);
		
		System.out.println("price :"+ price);
		System.out.println("capacity :"+ cap);
		System.out.println("type :"+ type);
		System.out.println("warrenty :"+ warrenty);
		System.out.println("====================");
		
	
	}
	
	
}
