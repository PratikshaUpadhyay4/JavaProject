package Array;

public class AverageValueOfArrayElements {

	public static void main(String[] args) {
		int[] numbers = new int[]{10,20,30,40,50,60,70,80,90};
		//calculate sum of all array elements
		int sum = 0;
		for(int i=0; i < numbers.length ; i++)
			sum = sum + numbers[i];
		//calculate average value
		double average = sum / numbers.length;
		System.out.println("Average value of the array elements is : " + average); 
	}



}
