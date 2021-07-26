package Array;

import java.util.HashSet;

public class ShowDuplicateArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80};
		int[] b= {10,80,40,50,61,45,21,52};

		HashSet<Integer> set=new HashSet<Integer>();
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++){

				if(a[i]==b[j]){
					set.add(a[i]);
					break;
				}
			}

		}
		for(Integer no:set) {
			System.out.println(no+" ");
		}
	}
}
