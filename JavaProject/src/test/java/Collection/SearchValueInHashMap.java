package Collection;

import java.util.HashMap;
public class SearchValueInHashMap {

	public static void main(String a[]){
		HashMap<String, String> hm = new HashMap<String, String>();
		//add key-value pair to hashmap
		hm.put("first", "PRATIKSHA");
		hm.put("second", "BINA");
		hm.put("third","DEEKSHA");
		System.out.println(hm);
		if(hm.containsValue("BINA")){
			System.out.println("The hashmap contains value BINA");
		} else {
			System.out.println("The hashmap does not contains value BINA");
		}
		if(hm.containsValue("first")){
			System.out.println("The hashmap contains value first");
		} else {
			System.out.println("The hashmap does not contains value first");
		}

	}
}