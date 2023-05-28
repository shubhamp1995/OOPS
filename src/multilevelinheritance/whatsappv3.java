package multilevelinheritance;
// super/sub class

public class whatsappv3 extends whatsappv2
{
public void f4() {
	System.out.println("f4:"+"video calling");
}
//public void f3() {
//	System.out.println("f3:"+"audio calling");
//}
////public void f1() {
////	System.out.println("f1:"+"sms");
////	
////}
////public void f2() {
////	System.out.println("f2:"+"emoji");
////}
public static void main(String[] args) {
	

whatsappv3 b2=new whatsappv3();
 b2.f1();
 b2.f2();
 b2.f3();
 b2.f4();
 
}
}
