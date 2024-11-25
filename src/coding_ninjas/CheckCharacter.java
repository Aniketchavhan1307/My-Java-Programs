package coding_ninjas;

import java.util.Scanner;

public class CheckCharacter 
{

	
		    public static void main(String []args)
		    {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Character");

		        char ip = sc.next().charAt(0);

		        int result = checkChar(ip);
		        
		        System.out.println(result);

		    }

		    public static int checkChar(char ch)
		    {
		        if (ch >= 'A' && ch <= 'Z') {
		            return 1;
		        }
		        else if (ch >= 'a' && ch <= 'z')
		        {
		            return 0;
		        }

		        return -1;
		    }
		

	
}
