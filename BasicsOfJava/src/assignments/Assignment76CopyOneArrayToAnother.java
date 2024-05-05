package assignments;

import java.util.Arrays;

public class Assignment76CopyOneArrayToAnother {

	public static void main(String[] args) {
String name[]=new String[4];
name[0]="shweta";
name[1]="shreya";
name[2]="satyam";
name[3]="shivam";
String name2[]=new String[4];

System.out.println(Arrays.toString(name));

System.out.println("======================");
for(int i=0;i<name.length;i++) {
	
	
	name2[i]=name[i];
}
System.out.println(Arrays.toString(name2));
		
		
		
	}

}
