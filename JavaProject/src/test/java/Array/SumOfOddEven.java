package Array;

public class SumOfOddEven {

		public static void main(String args[])
	    {
	        int arr[] = {10,20,30,40,50,60,70};
	        int even = 0, odd = 0;

	        // Loop to find even, odd sum
	        for (int i = 0; i < arr.length; i++) {
	            if (i % 2 == 0)
	                even += arr[i];
	            else
	                odd += arr[i];
	        }

	        System.out.println("Even index positions sum: " + even);
	        System.out.println("Odd index positions sum: " + odd);
	    }
	
}
