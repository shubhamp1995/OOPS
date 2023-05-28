package methodswithreturntype;

public class method_returntype {
	public static void main(String[] args) {
		int s1=add(10,20);
		System.out.println(s1);
		
		System.out.println("------------");
		System.out.println(add(20,30));
		
		System.out.println("------------");
		
		method_returntype m1=new method_returntype();
		int s2=m1.add(2, 3,6);
		System.out.println(s2);
		
		System.out.println("------------");
		
		System.out.println(m1.add(4, 5, 6));
		
		System.out.println("------------");
		
		String s3=exa2.uppercase("shubham");
		System.out.println(s3);
		
		System.out.println("------------");
		
		System.out.println(exa2.uppercase("gaurav"));
	}
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	public int add(int c,int d, int e) 
	{ int h=c*d*e;
	return h;
		
	}
}
