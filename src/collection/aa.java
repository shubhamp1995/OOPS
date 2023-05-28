package collection;

import java.util.ArrayList;
import java.util.TreeSet;



public class aa {
	public static void main(String[] args) {
		
	
	TreeSet <Integer>ts =new TreeSet<Integer>();
	ts.add(11);
	ts.add(12);
	ts.add(13);
	ts.add(14);
	ts.add(14);
	ts.add(15);
System.out.println(ts);
System.out.println(ts.size());

ts.remove(12);
System.out.println(ts);

for(Integer s1:ts)
{
	System.out.println(s1);
}
ts.clear();
System.out.println(ts.isEmpty());

}
}