package assignments;

public class Assignment73PalindromeEx {

	public static void main(String[] args) {

String s1="MOM";
String reverse="";
for(int i=s1.length()-1;i>=0;i--) {
char op=s1.charAt(i);
reverse=reverse+op;	
	}
System.out.println(reverse);
if(s1.equals(reverse)) {
	System.out.println("The String is Palindrome");
}
else {
	System.out.println("The String is Not Palindrome");
}
}
}