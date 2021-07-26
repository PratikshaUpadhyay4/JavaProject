package String;

public class RemoveSpacefromString {

	public static void main(String[] args) {
		
		String str="   my name is pratiksha";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
	}

}
