package equals_ignorecase;

public class class7 {

	public static void main(String[] args) {
		class7 old = new class7();
		old.bina();
		old.hina();
			
	}
public void bina() {
String a = "store closed";
String b = "StoRe Closed";
boolean k = a.equalsIgnoreCase(b);
System.out.println(k);	
	
	
}
public void hina() {
String a = "I live in New York.";
String b = "i live in new york.";
boolean r = a.equalsIgnoreCase(b);
System.out.println(r);
		
}	
	
	
	
	
}
