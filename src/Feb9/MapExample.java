package Feb9;

import java.util.HashMap;

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Pune", 411001);
		map.put("gulbarga", 585103);
		map.put("mumbai", 600103);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.size());
		
		System.out.println(map.remove("mumbai"));
		System.out.println(map.size());
		
		System.out.println(map.containsKey("Pune"));
		
		System.out.println(map.containsValue(411002));
		System.out.println(map.get("Pune"));
		
		System.out.println(map.put("Pune", 400100));
		System.out.println(map);
		
		for (String key : map.keySet()) {
			System.out.println("Key: "+key+" "+ "Value:" +map.get(key));
		}

	}

}
