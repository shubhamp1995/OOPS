package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(101);
	list.add("shubham");
	list.add('a');
	list.add(98.3f+"%");
	list.add(null);
	list.add("petkar");
	list.add("pune");
	
	System.out.println(list);
	System.out.println(list.isEmpty());//it will return boolean value false/true
	System.out.println(list.get(3));//for printing specific index info
	System.out.println("-------------------------");
	//use to add info on whichever index you want
	list.add(2, "petkar");
	//use to remove info from existing array   list
	list.remove(6);
	//use to modify info present in array  list
	list.set(6, "nagpur");
	list.remove(5);
	list.add(6, "null");
	//to print all the data from array list(array elements)
	System.out.println(list);
	System.out.println("----------printing arraylist data using iterator cursor ---------------");
	 
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("----------printing arraylist data using list-iterator cursor ---------------");
	ListIterator liter = list.listIterator();
	while(liter.hasNext())
	{
		System.out.println(liter.next());
	}
	System.out.println("----------printing arraylist data using for loop ---------------");
	for(int i=0; i<=list.size()-1;i++) {
		System.out.println(list.get(i));
	}
	System.out.println("----------printing arraylist data using for loop (reverse order ---------------");
	for(int i=list.size()-1;i>=0;i--)
	{
		System.out.println(list.get(i));
	}
	System.out.println("----------printing arraylist data using for each---------------");
	
	for(Object s1:list)
	{
		System.out.println(s1);
	}
}
}
