package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
public static void main(String[] args) {
	ArrayList<Comparable> Arr =new ArrayList<Comparable>();
	Arr.add("shubham");
	Arr.add("gaurav");
	Arr.add(0, 101);
	Arr.add('a');
	Arr.add(98.5f+"%");
	Arr.add(null);
	Arr.add("pune");
    System.out.println(Arr.get(3));
	//Arr.get(2);//not work anymore it should be in print statement
    System.out.println(Arr.size());
    System.out.println(Arr.contains(101));//true
    System.out.println(Arr.isEmpty());//false
    System.out.println(Arr.indexOf(101));//0
    System.out.println(Arr.indexOf("shubham"));//1
    System.out.println(Arr.lastIndexOf("pune"));//6
	System.out.println(Arr);
	//remove info in between arraylist--->left shift
	Arr.remove(5);
	System.out.println(Arr);
	Arr.add(6, null);
	System.out.println(Arr);
	//System.out.println(Arr.set(2, "petkar"));
	Arr.set(2, "petkar");
	System.out.println(Arr);
	System.out.println();
	Iterator itr = Arr.iterator();
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
	
	
	
	
}
}
