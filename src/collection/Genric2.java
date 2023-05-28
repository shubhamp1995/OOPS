package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Genric2 {
public static void main(String[] args) {
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
	LinkedHashSet lhs =new LinkedHashSet(list);
	System.out.println(lhs);
	System.out.println("------------------");
	for(Object s2:lhs)
	{
		System.out.println(s2);
	}
}
}
