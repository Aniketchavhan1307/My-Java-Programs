package do_you_know;

public class FindJavaVersionByCode
{
	public static void main(String[] args) {
		
		var r = Runtime.version();
		
		System.out.println("Java version is :"+ r);
		System.out.println("Java version is :"+ r.version());
	}

}
