package demo;

public class Primative 
{
	String name;
	String brand;
	String color;
	int price;
	int ram;
	
	public Primative()
	{
		
	}

	public Primative(String name, String brand, String color, int price , int ram)
	{
		this.brand = brand;
		this.color = color;
		this.name = name;
		this.price = price;
		this.ram = ram;
		
		System.out.println("Mobile created");
		
	}
	
	public String toString()
	{
		return "[name : " + name + ", brand :"+ brand+ ", color : "+ color+ ",Price:"+price+"Ram: "+ram+ "]";
	}
	public boolean equals(Object ref)
	{
		Primative i = (Primative) ref;
		if(this.name == i.name && this.brand == i.brand && this.color== i.color && this.price == i.price && this.ram == i.ram)
		{
			return true;
		}
		return false;
	}
	
	public int hashCode()
	{
		return price+ram;
	}
	
	public void showMobile()
	{
		System.out.println("======================");
		System.out.println("Brand: "+ brand);
		System.out.println("name: "+ name);
		System.out.println("color: "+ color);
		System.out.println("Price: "+ price);
		System.out.println("RAM: "+ ram);
		System.out.println("====================== ");
	}
}
