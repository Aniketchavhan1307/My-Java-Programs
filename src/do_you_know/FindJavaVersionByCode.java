package do_you_know;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class FindJavaVersionByCode
{
	public static void main(String[] args) throws IOException
	{
		
		var r = Runtime.version();
		
		System.out.println("Java version is :"+ r);
		System.out.println("Java version is :"+ r.version());
		
		
		System.out.println("=================");
		
		//2. java version
		
		Runtime.Version version = Runtime.version();
		
		System.out.println("2nd way : "+ version.version());
		
		//======================================================
		//  get password from cmd but without showing the password.........
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Email");
		String email = scanner.next();
		
		System.out.println("Enter password");
		String password = scanner.next();
		
		System.out.println("Email : "+ email);
		System.out.println("Password : "+ password);
		
		
//		System.out.println(" Enter password This password is secure...");
//		
//		Console console = System.console();
//		char[] ch = console.readPassword();
//		
//		String pass = new String(ch);
//		System.out.println("Secure password "+pass);
	}

}
