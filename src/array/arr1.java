package array;

public class arr1 
{
	public static void main(String[] args) {
		
		int []a = {23,58,84,6,1,68,56,48,5,41,55,65,67,68,69,70,90,97,98,99,100,122};
		
		int count = 0;
		int sum = 0;
		
		System.out.println(a.length);
		System.out.println("==============");
		
		for (int i = 0; i < a.length; i++)
		{
			sum+=a[i];
			
			if(a[i]%2!=0)
			{
				count++;
				System.out.println("odd value of index "+i+"...is -->"+a[i]);
			
			}
		}
		System.out.println("============================");
		System.out.println("count of odd values..."+count);
		System.out.println("================================");
	
		System.out.println("sum of array is ----->"+sum);
		
		

	}
	

}
