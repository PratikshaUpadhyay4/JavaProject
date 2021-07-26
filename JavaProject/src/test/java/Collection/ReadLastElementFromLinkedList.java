package Collection;



import java.util.LinkedList;
public class ReadLastElementFromLinkedList {


	public static void main(String[] args) {

		LinkedList<String> ar=new LinkedList<String>();

		ar.add("deeksha");
		ar.add("Pratiksha");
		ar.add("Neha");
		ar.add("kushagra");
		System.out.println("Last Element: "+ar.getLast());
		System.out.println("Last Element: "+ar.peekLast());


	}

}