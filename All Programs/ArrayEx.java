package BasicConcept;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		String names[]= {"shweta","prasad","sachin"};
		String Surnames[]= {"Gadewar","Chakkarwar","sane"};
		String names1[]= {"shweta","prasad","sachin"};
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(Surnames));
		
		System.out.println(Arrays.equals(names, Surnames));
		
		if(Arrays.equals(names, names1)==true) {
			System.out.println("Array is same");
		}else {
			System.out.println("Array is Different");
		}
	}

}
