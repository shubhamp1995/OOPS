package String_class;

public class demo2 {
public static void main(String[] args) {
	// object creation String wihtout new keyword---->constant pool area
	String s1="abc";
	String s2="abc";
	String s3="xyz";
	
	// object creation of string using new keyword--> non-constant pool area
	String s4=new String("abc");
	String s5=new String("abc");
	String s6=new String("abc1");
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	System.out.println(s4==s5);
}
}
