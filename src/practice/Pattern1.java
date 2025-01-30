package practice;

import java.util.Scanner;

public class Pattern1 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number : ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		
//		Enter the Number : 
//			9
//			        * 
//			      * * * 
//			    * * * * * 
//			  * * * * * * * 
//			* * * * * * * * * 
//			  * * * * * * * 
//			    * * * * * 
//			      * * * 
//			        * 

		
		
//		int space =n/2;
//		int star =1;
//		
//		for(int i = 0; i<n; i++)
//		{
//			for(int j =0; j<space; j++)
//			{
//				System.out.print(" "+ " ");
//				
//			}
//			
//			for(int j=0; j<star ; j++)
//			{
//				System.out.print("*"+" ");
//			}
//			
//			if(i < n/2)
//			{
//				space--;
//				star+=2;
//			}
//			else
//			{
//				space++;
//				star-=2;
//			}
//			
//			System.out.println();
//		}
//		
		
		
		
//		Enter the Number : 
//			7
//			      * 
//			    * * 
//			  * * * 
//			* * * * 
//			  * * * 
//			    * * 
//			      * 

		
//		int space =n/2;
//		int star =1;
//		
//		for(int i = 0; i<n; i++)
//		{
//			for(int j =0; j<space; j++)
//			{
//				System.out.print(" "+ " ");
//				
//			}
//			
//			for(int j=0; j<star ; j++)
//			{
//				System.out.print("*"+" ");
//			}
//			
//			if(i < n/2)
//			{
//				space--;
//				star++;
//			}
//			else
//			{
//				space++;
//				star--;
//			}
//			
//			System.out.println();
//		}
//		
		
		
		
		
//		Enter the Number : 
//			13
//			* * * *           * * * * 
//			*     *           *     * 
//			*     *           *     * 
//			* * * * * * * * * * * * * 
//			      *           *       
//			      *           *       
//			      *           *       
//			      *           *       
//			      *           *       
//			* * * * * * * * * * * * * 
//			*     *           *     * 
//			*     *           *     * 
//			* * * *           * * * * 
		
//		for(int i=0; i<n; i++)
//			{
//				for(int j= 0 ; j<n; j++)
//				{
//					if(i==n/4 || j==n/4 || i==n/2+n/4 || j==n/2+n/4 || (j==0 && i<n/4) || (i==0 && j<n/4) || (i==0 && j>n/2+n/4)
//							|| (i<n/4 && j==n-1) || (i>n/2+n/4 && j==0) || (i==n-1 && j<n/4) || (i==n-1 && j>n/2+n/4) || (j==n-1 && i>n/2+n/4))
//					{
//						System.out.print("*"+" ");
//					}
//					else
//					{
//						System.out.print(" "+ " ");
//					}
//				}
//				System.out.println();
//			}
	
		
		
		
//		for(int i=0; i<n; i++)
//		{
//			for(int space = 0; space<i; space++)
//			{
//				System.out.print("_"+" ");
//			}
//			
//			
//			for(int j=n; j>2*i-1 ; j--)
//			{
//				
//					System.out.print("*" +" ");
//					
//			}
//			
//			System.out.println();
//		}
		
		
		
//		Enter the Number : 
//			9
//			                * 
//			              * * * 
//			            * * * * * 
//			          * * * * * * * 
//			        * * * * * * * * * 
//			      * * * * * * * * * * * 
//			    * * * * * * * * * * * * * 
//			  * * * * * * * * * * * * * * * 
//			* * * * * * * * * * * * * * * * * 
//		
//		for(int i=0; i<n; i++)
//		{
//			for(int space = 0; space <n-i-1; space++)
//			{
//				System.out.print(" "+" ");
//			}
//			
//			
//			for(int j=0; j< 2*i+1 ; j++)
//			{
//				
//					System.out.print("*" +" ");
//					
//			}
//			
//			System.out.println();
//		}
//		
		
		
//		Enter the Number : 
//			9
//			                  * 
//			                * * 
//			              * * * 
//			            * * * * 
//			          * * * * * 
//			        * * * * * * 
//			      * * * * * * * 
//			    * * * * * * * * 
//			  * * * * * * * * * 
//		
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<=n ; j++)
//			{
//				if(j>n-i-1)
//				{
//					System.out.print("*" +" ");
//				}
//				else
//				{
//					System.out.print(" "+" ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		
//		Enter the Number : 
//			9
//			                * 
//			              * * 
//			            * * * 
//			          * * * * 
//			        * * * * * 
//			      * * * * * * 
//			    * * * * * * * 
//			  * * * * * * * * 
//			* * * * * * * * * 

		
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<n ; j++)
//			{
//				//if(i==n-1 || i+j>=n-1 || j==n-1)
//				if( i+j>=n-1 )
//				{
//					System.out.print("*" +" ");
//				}
//				else
//				{
//					System.out.print(" "+" ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		
		
//		Enter the Number : 
//			9
//			* * * * * * * * * 
//			  * * * * * * * * 
//			    * * * * * * * 
//			      * * * * * * 
//			        * * * * * 
//			          * * * * 
//			            * * * 
//			              * * 
//			                * 
//
//		
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<n ; j++)
//			{
//				if(j>=i)
//				{
//					System.out.print("*" +" ");
//				}
//				else
//				{
//					System.out.print(" "+" ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		
		
		
//		Enter the Number : 
//			9
//			* * * * * * * * * 
//			* * * * * * * * 
//			* * * * * * * 
//			* * * * * * 
//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			* 
//		
//		for(int i=0; i<n; i++)
//			{
//				for(int j= n-1 ; j>= i; j--)
//				{
//					System.out.print("*"+ " ");
//				}
//				System.out.println();
//			}
		
		
		
//		Enter the Number : 
//			5
//			* 
//			* * 
//			* * * 
//			* * * * 
//			* * * * * 
//		
//		for(int i=0; i<n; i++)
//		{
//			for(int j= 0 ; j<=i; j++)
//			{
//				System.out.print("*"+ " ");
//			}
//			System.out.println();
//		}
		
		
		
//		Enter the Number : 
//			9
//			*       * * * * * 
//			*       *         
//			*       *         
//			*       *         
//			* * * * * * * * * 
//			        *       * 
//			        *       * 
//			        *       * 
//			* * * * *       * 
//			
//		for(int i=0; i<n; i++ )
//		{
//			for(int j=0; j<n; j++)
//			{
//				if( i==n/2 || j==n/2 || (i==0 && j>n/2) || (i==n-1 && j<n/2) || (j==0 && i<n/2) || (i>n/2 && j==n-1))
//				{
//					System.out.print("*"+" ");
//				}
//				else
//				{
//					System.out.print(" "+ " ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		
		
		
		
		
		
//		Enter the Number : 
//			9
//			* * * * * * * * * 
//			* *     *     * * 
//			*   *   *   *   * 
//			*     * * *     * 
//			* * * * * * * * * 
//			*     * * *     * 
//			*   *   *   *   * 
//			* *     *     * * 
//			* * * * * * * * * 
//
//		
//		for(int i=0; i<n; i++)
//		{
//			for(int j =0; j<n; j++)
//			{
//				if(i==0 || j==0 || j==n-1 || i==n-1 || i==j || i+j == n-1 || i==n/2 || j==n/2)
//				{
//					System.out.print("*"+ " ");
//					
//				}
//				else
//				{
//					System.out.print(" "+ " ");
//				}
//			}
//			
//			System.out.println();
//		}
		
	}
}
