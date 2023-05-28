package Exception_handling;

public class exa3 {
public static void main(String []args) {
	int num1=10;
	int num2=0;
	int div=0;
	try
	{
		div=num1/num2;  //10/0=
	}
	catch(ArithmeticException n) {
		System.out.println("arithmeticException handled");
		div=num1/2;   //10/2=5
	}
	System.out.println(div);
	System.out.println("hello");
}
}
