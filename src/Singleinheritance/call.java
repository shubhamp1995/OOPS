package Singleinheritance;

public class call 
{
public static void main(String[] args) {
	Son s1=new Son();
	s1.bike();
	s1.gold();
	s1.realestate();
	s1.vehicles();
	s1.add();
	
	System.out.println("-------------------------------------");
	
	student s2=new student();
	s2.teaching1();
	s2.teaching2();
	s2.stu();
	
	System.out.println("-------------------------------------");
	
	cust c2=new cust();
	c2.c1();
	c2.b1();
	c2.m2();
	c2.m3();
}


}

