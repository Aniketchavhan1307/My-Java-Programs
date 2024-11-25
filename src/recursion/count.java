package recursion;

public class count 
{
	static int count =0;
	public static void main(String[] args) 
	{
		count1(5678, 0);
	}
	public static void count1(int num, int ct)
	{
		if(num==0)
		{
			return ;
		}
		else
		{
			//int ct=0;
			
			if(num!=0)
			{
				ct++;
				count1(num/10, ct);
				
			}
			//System.out.println("number...."+num+", count..."+ct);
			
		}
		
		count = ct;
		System.out.println("number...."+num+", count..."+ct);
		System.out.println(count);
	}
	
}
