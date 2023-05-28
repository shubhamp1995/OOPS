package multilevelinheritance;
// sub/child class
public class whatsaapv4 extends whatsappv3
{
public void f5() {
	System.out.println("f5:"+"payment");
}
//public void f4() {
//	System.out.println("f4:"+"video calling");
//}
////public void f3() {
////	System.out.println("f3:"+"audio calling");
////}
//////public void f1() {
//////	System.out.println("f1:"+"sms");
//////	
//////}
//////public void f2() {
//////	System.out.println("f2:"+"emoji");
//////}

public static void main(String[] args) {
	whatsaapv4 v4=new whatsaapv4();
	v4.f1();
	v4.f2();
	v4.f3();
	v4.f4();
	v4.f5();
	
}










}
