package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhasHSet2 
{
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add(101);
	lhs.add("shubham");
	lhs.add('a');
	lhs.add(98.3f+"%");
	lhs.add(101);
	lhs.add(null);
	lhs.add(null);
	lhs.add("petkar");
	lhs.add("pune");
	
	System.out.println(lhs);
//	boolean s1 = lhs.isEmpty();
//	System.out.println(s1);
	System.out.println(lhs.isEmpty());
	System.out.println("=======print data using iterator");
	Iterator itr = lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("=======print data for each");
	for(Object s1:lhs)
	{
		System.out.println(s1);
	}
	lhs.clear();
	System.out.println(lhs.size());
	
	
}
}
