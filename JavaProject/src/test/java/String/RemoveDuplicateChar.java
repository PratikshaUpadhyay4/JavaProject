package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="pratiksha";
		 LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		 for(int i=0;i<s.length();i++) {
			 set.add(s.charAt(i));
		 }
		 for(Character ch: set) {
			 System.out.println(ch);
			 
		 }
		 

	}
}


