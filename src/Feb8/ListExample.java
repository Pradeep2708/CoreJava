package Feb8;

import java.util.ArrayList;
import java.util.*;

public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<>();
		
		obj.add("pradeep");
		obj.add("pihu");
		obj.add("priya");
		obj.add("sandeep");
		obj.add("amardeep");
		
		System.out.println(obj);
		System.out.println(obj.size());
		
		System.out.println(obj.contains("pradeep"));
		System.out.println(obj.indexOf("pihu"));
		System.out.println(obj.isEmpty());
		List<String> newList=obj.subList(0, 3);
		newList.add("maddy");
		System.out.println(newList);
		
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
		
		for(int i=0; i<obj.size(); i++){
			System.out.println(obj.get(i)+" ");
		}
		for(String value:obj){
			System.out.println(value);
		}

	}

}
