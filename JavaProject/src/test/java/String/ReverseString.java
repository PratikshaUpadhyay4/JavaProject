package String;

public class ReverseString {

	public static void main(String[] args) {
		String s="my name is pratiksha upadhyay";
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
		System.out.print(str[i]+" ");

	}

}
}