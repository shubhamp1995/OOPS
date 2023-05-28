package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist6 
{
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(101);
		list.add(0, "shubham");
		list.add('a');
		list.add(98.4f+"%");
		list.add(null);
		list.add("pune");
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println("=====================");
		list.remove(4);
		System.out.println(list);
		list.add(1, "petkar");
		System.out.println(list);
		System.out.println("====print data using iterator=================");
	Iterator itr = list.iterator();
	//itr.next();
	//itr.remove();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("====print data using list-iterator=================");
	ListIterator litr = list.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("====print data (reverse)using list-iterator=================");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	System.out.println("====print data using for loop=================");
	for(int i=0; i<=list.size()-1;i++)
	{
		System.out.println(list.get(i));
	}
	System.out.println("====print data using for each=================");
	for(Object s1:list)
	{
		System.out.println(s1);
	}
	
	}

}
