package do_you_know;

public class FindJavaVersionByCode
{
	public static void main(String[] args) {
		
		var r = Runtime.version();
		
		System.out.println("Java version is :"+ r);
		System.out.println("Java version is :"+ r.version());
		
		
		System.out.println("=================");
		
		//2. java version
		
		Runtime.Version version = Runtime.version();
		
		System.out.println("2nd way : "+ version.version());
		
		
	}

}
