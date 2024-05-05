package BasicConcept;

public class ReverseStringProgram {

	public static void main(String[] args) {
String name="Shweta Gadewar";
String reverse="";

for(int i=name.length()-1;i>=0;i--) {
char op=name.charAt(i);
System.out.println(op);
reverse=reverse+op;	
	};
	System.out.println(reverse);
}

	
}
