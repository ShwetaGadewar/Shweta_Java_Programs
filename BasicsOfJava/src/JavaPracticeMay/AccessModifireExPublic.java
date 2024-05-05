package JavaPracticeMay;

public class AccessModifireExPublic {
	public static int a=25;
	public static void main(String[] args) {
System.out.println(a);
add();
	}
    static void add() {
    	 int b=a+5;
    	System.out.println(b);
     }
}
