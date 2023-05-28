package String_class;

public class sample2 {
public static void main(String[] args) {
	//without using new keyword --->constant pool area 
	String s1="velocity";
	String s2="abc";
	String s3="abc";
	String s4="abc1";
	// using new keyword-----> non-constant pool area
	String s5=new String("abc");
	String s6=new String("abc");
	String s7=new String("abc1");
	String s8=new String("xyz");
	
	System.out.println(s1==s2);//false
    System.out.println(s2==s3);//true
    System.out.println(s3==s2);//true
    System.out.println(s3==s4);//false
    System.out.println(s2==s5);//false
    System.out.println(s6==s5);//false
    System.out.println(s7==s8);//false
			
}
}
