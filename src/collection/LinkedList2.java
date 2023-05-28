package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 
{
public static void main(String[] args) {
	LinkedList LL=new LinkedList();
	LL.add(101);
	LL.add(0, "shubham");
	LL.add('a');
	LL.add(98.4f+"%");
	LL.add(null);
	LL.add("pune");
	System.out.println(LL);
	LL.add(1, "petkar");
	LL.set(5, "nagpur");
	System.out.println(LL);
	LL.remove(6);
	System.out.println(LL);
	System.out.println("--------print data using iterator------");
	Iterator itr = LL.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("--------print data using list-iterator------");
	ListIterator litr = LL.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("--------print data using list-iterator in backword direction------");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	System.out.println("--------print data using for loop------");
	for(int i=0; i<=LL.size()-1;i++)
	{
		System.out.println(LL.get(i));
	}
	System.out.println("--------print data using for each------");
	for(Object s1:LL)
	{
		System.out.println(s1);
	}
	System.out.println("==================================");
	LL.clear();
	System.out.println(LL.isEmpty());
	System.out.println(LL.size());
}
}
