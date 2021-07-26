package Collection;


	import java.util.Iterator;
	import java.util.LinkedList;

	public class IterateThroghLinkedListInReverseOrder {
		public static void main(String[] args) {

			LinkedList<String> ar=new LinkedList<String>();

			ar.add("deeksha");
			ar.add("Pratiksha");
			ar.add("Neha");
			ar.add("kushagra");

			Iterator<String> itr=ar.descendingIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}



		}

	}