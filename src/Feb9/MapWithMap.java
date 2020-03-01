package Feb9;
import java.util.*;
import java.util.HashMap;

public class MapWithMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, HashMap<Integer, ArrayList<String>>> map=new HashMap<>();
		
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		ArrayList<String> list3=new ArrayList<>();
		
		HashMap<Integer,ArrayList<String>> details=new HashMap<>();
		HashMap<Integer,ArrayList<String>> details1=new HashMap<>();
		HashMap<Integer,ArrayList<String>> details2=new HashMap<>();
		
		list1.add("Pradeep");
		list1.add("Senior Analyst");
		list1.add("EvolentHealth");
		
		list2.add("Ajinkya");
		list2.add("Analyst");
		list2.add("EvolentHealth");
		
		list3.add("Vijay");
		list3.add("Adjudicator");
		list3.add("EvolentHealth");
		
		details.put(1001, list1);
		details1.put(1002, list2);
		details2.put(1003, list3);
		
		map.put("Finance", details);
		map.put("Investment", details1);
		map.put("Asset Management", details2);
		
		System.out.println(map);
		
		for (String val : list3) {
			System.out.println(map.get(details2));
		}
		
		

	}

}
