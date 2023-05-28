package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hashset1 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(101);
		hs.add("shubham");
		hs.add('a');
		hs.add(98.3f+"%");
		hs.add(101);
		hs.add(null);
		hs.add(null);
		hs.add("petkar");
		hs.add("pune");
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		System.out.println("--------using iterator-------");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------using for each-------");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		System.out.println("--------------");
		LinkedHashSet lhs=new LinkedHashSet(hs);
		System.out.println(lhs);
		System.out.println("--------------");
		hs.clear();
		System.out.println(hs.size());
	}

}
