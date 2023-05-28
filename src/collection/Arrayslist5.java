package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;



public class Arrayslist5 
{
	public static void main(String[] args) 
	{
		ArrayList List=new ArrayList();
		List.add(101);
		List.add("shubham");
		List.add('a');
		List.add(98.3f+"%");
		List.add(101);
		List.add(null);
		List.add(null);
		List.add("petkar");
		List.add("pune");
		
		HashSet hs=new HashSet(List);
		System.out.println(hs);
		System.out.println("-------------------");
		LinkedHashSet lhs=new LinkedHashSet(List);
		System.out.println(lhs);
		
		
	}

}