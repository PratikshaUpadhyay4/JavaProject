package Collection;


import java.util.ArrayList;
import java.util.List;

public class GetSubsettoLinkedList {
	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Arpita");
		name.add("pratiksha");
		name.add("niharika");
		name.add("divist");

		System.out.println("LinkedList: "+name);

		List<String> sublist=name.subList(0, 2);

		System.out.println("sublist "+ sublist);

	
}
}
