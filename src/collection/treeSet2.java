package collection;

import java.util.Iterator;
import java.util.TreeSet;



public class treeSet2
{
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(101);
	ts.add(101);
	ts.add(102);
	ts.add(101);
	ts.add(103);
	ts.add(106);
	ts.add(110);
	ts.add(134);
	ts.add(123);
	ts.add(145);
	ts.add(150);
	
	System.out.println(ts);
	System.out.println(ts.size());
	System.out.println(ts.isEmpty());
	ts.remove(103);
	System.out.println(ts);
	//print 1st element from ts object
	System.out.println(ts.first());//101
	//print last element from ts object
	System.out.println(ts.last());//150
	System.out.println("-----------------");
	//remove 1st element from 1st position
	System.out.println(ts.pollFirst());
	//remove 1st element from 1st position
	System.out.println(ts.pollLast());
	System.out.println(ts);
	System.out.println("-----------------------"+"\n");
	System.out.println("====print data using iterator===");
	Iterator itr = ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("====print data using for each===");
	for(Object s1:ts)
	{
		System.out.println(s1);
		
	}
	System.out.println("-----------------");
	ts.clear();
	System.out.println(ts.isEmpty());
	System.out.println(ts.size());
}
}
