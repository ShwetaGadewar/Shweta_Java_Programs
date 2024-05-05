package assignments;

import java.util.Arrays;

public class Assignment80CopyOneArrayToAnotherInReverseOrder {

	public static void main(String[] args) {
		String name[] = new String[4];
		name[0] = "shweta";
		name[1] = "shreya";
		name[2] = "satyam";
		name[3] = "shivam";

		String name2[] = new String[name.length];
		System.out.println(Arrays.toString(name));

		System.out.println("Array in reverse order: ");


		for (int i = name.length - 1, j = 0; (i >= 0 && j <= name.length-1); i--, j++) {
			name2[j] = name[i];
		}
		System.out.println(Arrays.toString(name2));
	}

}














//for (int i = name.length-1, j = 0; i >= 0; i--, j++) {  
//name2[j]=name[i];
//} 
//System.out.println(Arrays.toString(name2));

//int j = 0;
//for (int i = name.length - 1; i >= 0; i--) {
//name2[j] = name[i];
//j++;
//}
//System.out.println(Arrays.toString(name2));
