package String;

public class StringAnagramsOrNot {

	public static void main(String[] args) {
		
		String str1="listen";
		String str2="silent";
		
		System.out.println("Both string are anagrams"+anagramscheck(str1,str2));

	}
public static boolean anagramscheck(String str1,String str2) {
}
char[] ch1= str1.toCharArray();
char[] ch2= str2.toCharArray();

Arrays.sort(ch1);
Arrays.sort(ch2);
return Arrays.equals(ch1,ch2);
}

}
