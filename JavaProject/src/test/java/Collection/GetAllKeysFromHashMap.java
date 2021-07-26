package Collection;


	import java.util.HashMap;
	import java.util.Set;
	 
	public class GetAllKeysFromHashMap {
		
		public static void main(String a[]){
	        HashMap<String, String> hm= new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("first", "DEEKSHA");
	        hm.put("second", "PRATIKSHA");
	        hm.put("third","NIHARIKA");
	        System.out.println(hm);
	        Set<String> keys = hm.keySet();
	        for(String key: keys){
	            System.out.println(key);
	        }

	}
	

}
