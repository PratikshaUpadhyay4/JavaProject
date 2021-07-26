package String;

import java.util.HashSet;

public class OnlyDuplicateChar {

	public static void main(String[] args) {
		String s="WELCOME";
		HashSet<Character> Set=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
		{
			Set.add(s.charAt(i));
			
		}
		for(Character ch:Set) {
			int count=0;
			for(int i=0;i<s.length();i++)
			if(ch==s.charAt(i)){
				{
					count++;
				}
				}
		
		if(count>1) {
			System.out.println(ch+"="+count);
			
		}
			
		}
		
		}
	}
}
		


