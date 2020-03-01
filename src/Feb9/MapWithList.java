package Feb9;
import java.util.*;
import java.util.HashMap;

public class MapWithList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, ArrayList<String>> map=new HashMap<>();
		
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("Pradeep");
		list1.add("pihu");
		list1.add("priya");
		list1.add("sandeep");
		list1.add("Ajinkya");
		
		map.put(11111, list1);
		
		System.out.println(map);
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Ajinkya");
		list2.add("Vilas");
		list2.add("Sagar");
		list2.add("Disha");
		map.put(22222, list2);
		System.out.println(map);
		
		System.out.println(map.get(11111).get(2));
		

	}

}
