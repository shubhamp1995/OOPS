package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class legacyclass 
{
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(101);
	v.add(0, "shubham");
	v.add('a');
	v.add(98.4f+"%");
	v.add(null);
	v.add("pune");
	System.out.println(v);
	System.out.println(v.get(3));
	v.add(2, "petkar");
	v.set(5, "nagpur");
	System.out.println(v);
	v.remove(6);
	System.out.println(v);
	System.out.println("======print data using iterator========");
	Iterator it = v.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("======print data using list-iterator========");
	ListIterator lit = v.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
	System.out.println("======print data using Enumarator========");
	Enumeration enu = v.elements();
	while(enu.hasMoreElements())
	{
		System.out.println(enu.nextElement());
	}
	System.out.println("======print data for loop========");
	for(int i=0;i<=v.size()-1;i++)
	{
		System.out.println(v.get(i));
	}
	System.out.println("======print data using for each========");
	for(Object o:v)
	{
		System.out.println(o);
	}
	
	
}
}
