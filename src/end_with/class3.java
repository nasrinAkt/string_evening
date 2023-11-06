package end_with;

public class class3 {

	public static void main(String[] args) {
		class3 baby = new class3();
		baby.mom();
		baby.dad();
		

	}
public void mom() {
String a = "Ready for test";
boolean t = a.endsWith("test");
System.out.println(t);	
	
}
public void dad() {
String a = "this is true";
String b = "that was false";

boolean n = a.endsWith("true");	
boolean m = b.endsWith("false");	
System.out.println(n);
System.out.println(m);
}
	
	
	
	
}
