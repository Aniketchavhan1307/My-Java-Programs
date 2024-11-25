package oops;

public class Mobile 
{
	String brand;
	double price;
	String color;
	String name;
	int ram;
	int hd;
	String processor;
	int camera;
	
	
	public Mobile()
	{
		
	}
	
	Battery bat = new Battery("Samsung", 4000, "Li-ion", 1, 20000.00);
	
	public Mobile(String brand, double price, String color, String name , int ram, int hd, String processor, int camera)
	{
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.name = name;
		this.ram = ram;
		this.hd = hd;
		this.processor = processor;
		this.camera = camera;
		
		System.out.println("Mobile is created.....!");
	}
	
	public void displayMobile()
	{
		System.out.println("Mobile..............");
		System.out.println("Brand : "+ brand);
		System.out.println("Price : "+ price);
		System.out.println("color : "+ color);
		System.out.println("name  : "+ name);
		System.out.println("ram   : "+ ram);
		System.out.println("hard disk : "+ hd);
		System.out.println("processor : "+ processor);
		System.out.println("camera : "+ camera);
		System.out.println("====================== ");
		
		
		
	}

}
