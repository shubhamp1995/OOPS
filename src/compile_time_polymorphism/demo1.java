package compile_time_polymorphism;

public class demo1 {
	public void addition(int num1, int num2) // declaration
	{
		System.out.println(num1+num2); //defination
	}
	public void addition(int num1, int num2, int num3) 
	{
		System.out.println(num1+num2+num3);
	}
	public void addition(int num1, int num2, String sname) 
	{
		System.out.println("addition of two number:"+(num1+num2)+"name:"+sname);
	}

}
