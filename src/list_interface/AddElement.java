package list_interface;

import java.util.ArrayList;
import java.util.List;

public class AddElement 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(24);
		l1.add(6);
		l1.add(28);
		l1.add(27);
		
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(3);
		l2.add(4);
		l2.add(5);
		
		System.out.println(l2);
		
		l1.addAll(1, l2);
		
		System.out.println(l1);
		
		
		
		System.out.println(l1.set(0, 5));
		
		
		System.out.println(l1.remove(6));
		
		System.out.println(l1.contains(5));
		
		System.out.println(l1.subList(2, 5));
		
		System.out.println(l1);
		
		l1.listIterator();
		System.out.println(l1);
		
		;
		System.out.println(l1.listIterator(0));
	
	
		
	}

}
