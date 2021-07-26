package String;

import java.util.HashSet;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
	
				String s="pratiksha";
				 char[] ch = s.toCharArray();
				 HashSet<Character> set=new HashSet<Character>();
				 for(int i=0;i<ch.length-1;i++) {
					 set.add(ch[i]);
				 }
				 
				 System.out.println(set);
				 for(Character chr:set) {
					 int count=0;
					 for(int i=0;i<ch.length;i++) {
						 if(ch[i]==chr) {
							 count++;
						 }
						 
					 }
					 
					 System.out.println(chr+" ="+count);
				 }
				 
			

	}

}
