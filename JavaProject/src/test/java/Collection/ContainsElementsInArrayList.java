package Collection;


		
		import java.util.ArrayList;
		import java.util.List;

		public class ContainsElementsInArrayList {

			public static void main(String[] args) {
				
				List<String> city=new ArrayList<String>();
				city.add("guwahati");
				city.add("delhi");
				city.add("noida");
				city.add("chennai");
				
				//to check city (delhi) is in list or not
				if(city.contains("guwahati")) {
					System.out.println("noida is available in list");
				}else {
					System.out.println("not available");
				}
				

		}
		
	}


