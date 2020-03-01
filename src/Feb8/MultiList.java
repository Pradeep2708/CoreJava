package Feb8;
import java.util.*;

public class MultiList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		list3.add(7);
		list3.add(8);
		list3.add(9);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		
		System.out.println(lists);
		
		ArrayList<Integer> temp=lists.get(2);
		System.out.println(temp);
		System.out.println(temp.get(2));
		System.out.println(temp.get(0));

	}

}
