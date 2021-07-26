package Array;

public class ArraySumOfFirstThreeMin {

	public static void main(String[] args) {
		int a []= new int[]{10,20,30,40,50,60,70,80,90};

		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {

				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
				}
			}

			int sum=0;
			for(int i=0;i<3;i++) {
				sum=sum+a[i];
			}
			System.out.println("sum of first three min: "+sum);

		}

	}
