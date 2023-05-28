package method_overriding;

public class demo2 extends demo1
{
public static void m3() {
	System.out.println("demo2 static method m3");
}
public static void m1() {
	System.out.println(" override this method demo1 static method m1");
}
//public static void m2() {
//	System.out.println(" demo1 static method m2  ");


public void y1() {
System.out.println("non static method of demo2");
}
}
