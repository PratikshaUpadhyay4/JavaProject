package Collection;
	import java.util.ArrayList;
	import java.util.List;

	public class CopyList {
		public static void main(String[] args) {
			List<String> name=new ArrayList<String>();
			name.add("Arpita");
			name.add("pratiksha");
			name.add("niharika");
			name.add("divist");
			
			System.out.println(name);
			
			List<String> copy=new ArrayList<String>();
			copy.addAll(name);
			System.out.println(name);
		}

	}
