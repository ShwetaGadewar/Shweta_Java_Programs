package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment63CreatearraySizefromScannerClass {

	public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Enter the size of Array:");
String[] name=new String[s1.nextInt()];
for(int i=0;i<name.length;i++) {
	System.out.println("Enter the array:"+i);
	name[i]=s1.next();
	System.out.println(name[i]);
	
	
	
}System.out.println(Arrays.toString(name));

	}

}
