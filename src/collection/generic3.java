package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class generic3 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(101);
	al.add(101);
	al.add(102);
	al.add(101);
	al.add(103);
	al.add(106);
	al.add(110);
	al.add(134);
	al.add(123);
	al.add(145);
	al.add(150);
	System.out.println(al);
	System.out.println("-------------------"+"\n");
	TreeSet ts=new TreeSet(al);
	System.out.println(ts);
	System.out.println("----------------------"+"\n");
	
}
}
