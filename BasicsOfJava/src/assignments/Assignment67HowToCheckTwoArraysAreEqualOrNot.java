package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment67HowToCheckTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of 1st Array:");
		String name[] = new String[s1.nextInt()];

		for (int i = 0; i < name.length; i++) {
			System.out.print("enter the value of array " + i);
			name[i] = s1.next();
			System.out.println((name[i]));

		}
		System.out.println(Arrays.toString(name));
		System.out.println("Enter the size of 2nd Array:");
		String name1[] = new String[s1.nextInt()];

		for (int i = 0; i < name1.length; i++) {
			System.out.print("enter the value of array " + i);
			name1[i] = s1.next();
			System.out.println((name1[i]));
		}
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.equals(name, name1));
		if (Arrays.equals(name, name1) == true) {
			System.out.println("The array is same array");

		} else {
			System.out.println("The  Array is diffrent array");
		}

	}

}
