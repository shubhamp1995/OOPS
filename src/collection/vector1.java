package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 {
public static void main(String[] args) {
 Vector v=new Vector();
 v.add("shubham");
 v.add(101);
 v.add('a');
 v.add("nagpur");
 v.add(0, 98.4f+"%");
 v.add(null);
 
 System.out.println(v.get(1));
 System.out.println(v.isEmpty());
 System.out.println(v);
 System.out.println("-----print data using iterator-----");
 
 Iterator itr = v.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
 System.out.println("-----print data using list-iterator-----");
 ListIterator litr = v.listIterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
 System.out.println("-----print data using enumaration-----");
 Enumeration enu = v.elements();
 while(enu.hasMoreElements())
 {
	 System.out.println(enu.nextElement());
 }
 System.out.println("-----print data using for loop-----");
 for(int i=0;i<=v.size()-1;i++)
 {
	 System.out.println(v.get(i));
 }
 System.out.println("-----print data using for loop(reverse)-----");
 for(int i=v.size()-1;i>=0;i--)
 {
	 System.out.println(v.get(i));
 }
 System.out.println("-----print data using for each-----");
 for(Object s1:v)
 {
	 System.out.println(s1);
 }
 v.clear();
 System.out.println(v.isEmpty());//true
 System.out.println(v);
 System.out.println(v.size());
}
}
