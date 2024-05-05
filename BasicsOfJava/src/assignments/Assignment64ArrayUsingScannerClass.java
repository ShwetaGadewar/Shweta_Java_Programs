package assignments;
import java.util.Scanner;

public class Assignment64ArrayUsingScannerClass {

	public static void main(String[] args) {
       Scanner s1=new Scanner(System.in);
       
       String name[]=new String[4];
       for (int i = 0; i < name.length; i++) {
			System.out.print("enter the value of array "+i);
			name[i] = s1.next();
			System.out.println((name[i]));
	}
	}
}
