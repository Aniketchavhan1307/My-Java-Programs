package coding_ninjas;

import java.util.Arrays;

public class ZerosToLeft {
        public static int[] moveZeros(int n, int []arr) {
        
        for(int index = arr.length-1, nonZero = n-1 ; index>=0 ; index-- ){

            if(arr[index]!=0)
            {

                int temp = arr[index] ;
                arr[index] = arr[nonZero];
                arr[nonZero]= temp ;
                nonZero--;
            }
        }

        return arr;
    }
        
        public static void main(String[] args) {
			int arr[] = {1, 2, 0, 0, 2,0, 3};
			int arrr[]= moveZeros(arr.length, arr);
			System.out.println(Arrays.toString(arrr));
		}
}