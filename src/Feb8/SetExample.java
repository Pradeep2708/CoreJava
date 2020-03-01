package Feb8;
import java.util.*;

public class SetExample {

	/**
	 * @param args
	 */
	
	/*foreach can be used only with List and Set*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>(); 
		
		set.add("Maharastra");
		set.add("karnataka");
		set.add("kerala");
		set.add("Telangana");
		set.add("null");
		set.add("null");
		set.add("kerala");
		
		System.out.println(set);
		
		System.out.println(set.clone());
		
		for (String s : set) {
			System.out.println(s);
		}

	}

}
