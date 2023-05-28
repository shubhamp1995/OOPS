package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 
{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("shubham");
		hs.add("petkar");
		hs.add(87.4f+"%");
		hs.add(101);
		hs.add('a');
		hs.add("nagpur");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println("===================");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("===================");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		hs.clear();
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
	}

}
