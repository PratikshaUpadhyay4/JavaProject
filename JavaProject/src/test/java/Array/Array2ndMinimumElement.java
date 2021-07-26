package Array;

public class Array2ndMinimumElement {

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
		System.out.println(a[1]);
	}
}
