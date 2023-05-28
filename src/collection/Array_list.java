package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Array_list {
public static void main(String[] args) {
	ArrayList<String> s1=new ArrayList<String>();
	s1.add("shubham");
	s1.add(0, "suraj");
	
	s1.add(2, "ramesh");
	s1.add(3, "rahul");
	s1.add("pune");
	s1.add(4, "mumbai");
	System.out.println(s1);
	System.out.println(s1);
	s1.add(1, "gaurav");
	s1.remove(1);
	System.out.println(s1.contains("mumbai"));//true
	System.out.println(s1);
	System.out.println(s1.size());
	//use to modify information
	System.out.println(s1.set(2, "suresh"));
	System.out.println(s1);
	
	
	
	ArrayList<Integer> s2=new ArrayList<Integer>();
	s2.add(11);
	s2.add(0, 10);
	s2.add(13);
	s2.add(2, 12);
	s2.add(14);
	s2.add(1, 15);
	System.out.println(s2);
	System.out.println("-------------------------");
	TreeSet ts=new TreeSet(s2);
	System.out.println(ts);
	System.out.println("-------------------------");
	System.out.println(s2);
	int sum=0;
	Integer temp;
	for(int i=0; i<s2.size();i++)
	{
		temp=s2.get(i);
		sum+=temp.intValue();
	}
	System.out.println("sum of int arraylist:"+sum);
	
	
	
}
}
