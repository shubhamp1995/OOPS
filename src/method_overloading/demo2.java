package method_overloading;

public class demo2 {

	public static void add(int a, int b ) {
		System.out.println("addtion of number:"+(a+b));
	}
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void add(int a, int b, String str) {
		System.out.println((a+b)+" "+"str:"+str);
	}
}
