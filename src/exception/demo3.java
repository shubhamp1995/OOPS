package exception;

public class demo3 {
public static void main(String []args) {
	int num1=10;
	int num2=0;
	int div=0;
	
	try
	{
		div=num1/num2;     //10/0=
		System.out.println(div);
	}
	catch(ArithmeticException s2)
	{
		div=num1/2;    //10/2=5
		System.out.println(div);
		System.out.println("ArithmeticException handled");
	}
	System.out.println(div);
	System.out.println("hii");
}
}
