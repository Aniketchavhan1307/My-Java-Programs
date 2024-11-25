package array;

public class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		Employee [] db = new Employee[4];
		
		db[0] = new Employee("Smith", "12/12/12", 1232, 50000.00, "Pune", "Raju", 10, "salesman");
		db[1] = new Employee("Scott", "15/1/18", 6525, 60000.00, "Mumbai", "king", 10, "Accountant");
		db[2] = new Employee("Blake", "16/12/22", 3142, 80000.00, "pune", "king", 10, "operations");
		db[3] = new Employee("Miller", "18/11/24", 5412, 20000.00, "Goa", "Raju", 10, "salesman");
		
		
		
		for (int i = 0; i < db.length; i++)
		{
			System.out.println(db[i]);
			
		}
		
		System.out.println("==================================================================");
		
		System.out.println(findMaxSalary(db));
		
		System.out.println("==================================================================");

		System.out.println(searchByManager(db,"Raju" ));
	
		System.out.println("==================================================================");
	
		searchByManagerWithVoidMethod(db, "king");
		
		System.out.println("======================================");
		findSecondMaxSalary(db);
		
	}
	
	public static Employee findMaxSalary(Employee []ar )
	{
		double max  = -2147483648;
		
		int index = 0;
		
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i].sal > max)
			{
				max = ar[i].sal;
				index = i;
			}
			
		}
		return ar[index];
		
	}
	
	public static Employee searchByManager(Employee []ar, String search)
	{
		int index = 0;
		for (int i = 0; i < ar.length; i++) 
		{
			if(search == ar[i].manager)
			{
				index = i;
			}
			
		}
		return ar[index];
	}

	
	public static void searchByManagerWithVoidMethod(Employee []ar, String search)
	{
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(search == ar[i].manager)
			{
				System.out.println(ar[i]);
			}
			
		}
		
	}
	
	public static void findSecondMaxSalary(Employee []ar )
	{
		double max  = -2147483648;
		double secMax  = -2147483648;
		
		
		
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i].sal > max)
			{
				secMax = max;
				
				max = ar[i].sal;
			
			}
			else if (ar[i].sal > secMax && ar[i].sal != max) 
			{
				
				secMax = ar[i].sal;
				
			}
			
		}
		System.out.println(secMax);
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i].sal == secMax)
			{
				System.out.println(ar[i]);
			}
			
		}
	}

}
