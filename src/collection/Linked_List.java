package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List 
{
	
public static void main(String[] args)
{
	LinkedList List=new LinkedList();
	List.add("shubham");
	List.add(101);
	List.add(1, "petkar");
	List.add(98.3f+"%");
	List.add(null);
	List.add(null);
	
	System.out.println(List);
	Iterator itr = List.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 System.out.println("-----print data using list-iterator-----");
	 ListIterator litr = List.listIterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
//	 System.out.println("-----print data using enumaration-----");
//	 Enumeration enu = List.elements();
//	 while(enu.hasMoreElements())
//	 {
//		 System.out.println(enu.nextElement());
//	 }
	 System.out.println("-----print data using for loop-----");
	 for(int i=0;i<=List.size()-1;i++)
	 {
		 System.out.println(List.get(i));
	 }
	 System.out.println("-----print data using for loop(reverse)-----");
	 for(int i=List.size()-1;i>=0;i--)
	 {
		 System.out.println(List.get(i));
	 }
	 System.out.println("-----print data using for each-----");
	 for(Object s1:List)
	 {
		 System.out.println(s1);
	 }
	 List.clear();
	 System.out.println(List.isEmpty());//true
	 System.out.println(List);
	 System.out.println(List.size());

}
}
