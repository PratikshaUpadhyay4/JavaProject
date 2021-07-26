package String;

public class MaximumString {

	public static void main(String[] args) {
		String s1="my name is pratiksha upadhyay";
		char [] ch=s1.toCharArray();
		String out="";
		int count =0;

		for(int i=0; i<ch.length; i++)
		{
			String word="";
			while(i<ch.length && ch[i] !=' ')
			{
				word=word+ch[i];
				i++;
			}
			if(count<word.length())
			{
				out=word;
				count=word.length();
			}
		}
		System.out.println(out);



	}

}
