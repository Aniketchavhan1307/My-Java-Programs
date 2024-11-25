package demo;

public class Song 
{
	String name ;
	String type;
	String singer;
	
	String movie;
	
	public Song()
	{
		
	}
	
	public Song(String name, String type, String singer, String movie)
	{
		this.name = name;
		this.movie =movie;
		this.singer = singer;
		this.type = type;
	
	}
	
	public String toString()
	{
		return "[ name : "+name + ", type: " + type + " ,Singer : "+ singer + " ,movie : " + movie + "]";
		
				
	}

}
