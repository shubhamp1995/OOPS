package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class generic {
public static void main(String[] args) {
	TreeSet <Integer>ts=new TreeSet<Integer>();
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
	System.out.println("===============");
	for(Integer s1:ts)
	{
		System.out.println(s1);
	}
	System.out.println("========================");
	ArrayList list=new ArrayList();
	list.add(101);
	list.add("shubham");
	list.add('a');
	list.add(98.3f+"%");
	list.add(null);
	list.add("petkar");
	list.add("pune");
	list.add(null);
	System.out.println(list);
	System.out.println("-------------");
	HashSet hs=new HashSet(list);
	System.out.println(hs);
	System.out.println("------------------");
	for(Object s2:hs)
	{
		System.out.println(s2);
	}
}

}
