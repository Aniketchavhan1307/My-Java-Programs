package do_you_know;

import java.time.LocalDate;
import java.util.Scanner;

public class Date 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year [YYYY] ");
		int y = sc.nextInt();
		
		System.out.println("Enter the Year [MM] ");
		int m = sc.nextInt();
		
		System.out.println("Enter the Year [DD] ");
		int d = sc.nextInt();
		
		LocalDate date = LocalDate.of(y, m, d);
		
		System.out.println("You added : "+ date.toString());
		
		System.out.println("Enter Month you want to update");
		int update = sc.nextInt();
		
		LocalDate updatedDate = date.plusMonths(update);
		
		System.out.println("Updated date : "+ updatedDate.toString());
		
		
		
	}

}
