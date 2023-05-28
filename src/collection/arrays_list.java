package collection;

import java.util.ArrayList;

public class arrays_list {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList(); //initial/default/capacity=10
		list.add("shubham");
		list.add(101);
		list.add(65.2f);
		list.add('a');
		list.add("petkar");
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(3));
		//add information in between arayslist--->right shift
		list.add(3, "suraj");
		System.out.println(list);
		//remove info in between arraylist --->  left shift
		list.remove(2);
		System.out.println(list);
		System.out.println(list.contains('a'));//true
		System.out.println(list.set(4, "gaurav"));
		System.out.println(list);
		
		
	}
}
