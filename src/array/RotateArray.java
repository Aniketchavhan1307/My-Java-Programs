package array;

public class RotateArray {

	public static void main(String[] args) {
		
		int []ar = {1,2,3,4,5,6};
		

		int []ans1 = rotateRight(ar,3);
		
		for(int i =0; i<ans1.length;i++)
		{
			System.out.print(ans1[i]+",");
		}
	
		System.out.println("====================");
		
//		int []ans = rotateLelf(ar,4 );
//		
//		
//		for(int i =0; i<ans.length;i++)
//		{
//			System.out.print(ans[i]+",");
//		}
//		
		
		
	}
	
	public static int[] rotateRight(int []ar, int rot)
	{
		for(int i = 0; i<rot; i++)
		{
			int temp =  ar[ar.length-1];
			
			for(int j=ar.length-1; j>0; j--)
			{
				ar[j] = ar[j-1];
			}
			ar[0] = temp;
		}
		return ar;
		
	}
	
	
	public static int[] rotateLelf(int []ar, int rot)
	{
		for(int i=0; i<rot; i++)
		{
			int temp = ar[0];
			
			for(int j=0; j<ar.length-1; j++)
			{
				ar[j] = ar[j+1];
				
			}
			ar[ar.length-1] = temp;
	}
		return ar;
		
	}
	
	
}
