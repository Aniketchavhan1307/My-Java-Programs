package array;

public class Employee 
{
	String name;
	String hireDate;
	int empId;
	double sal;
	String loc;
	String manager;
	int deptNo;
	String role;
	
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String hireDate, int empId, double sal, String loc, String manager,  int deptNo, String role)
	{
		this.name = name;
		this.hireDate = hireDate;
		this.empId = empId;
		this.sal = sal;
		this.loc = loc;
		this.deptNo = deptNo;
		this.role = role;
		this.manager = manager;
		
	}
	
	public String toString()
	{
		return "[ name = "+ name + ", hireDate = "+ hireDate + ", empId = "+ empId + ", sal = "+ sal + 
				", location = "+ loc + ", Manager = "+ manager + ", deptNo = "+ deptNo +", role = "+ role + "]";
	}
	

}
