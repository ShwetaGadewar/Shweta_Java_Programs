package BasicConcept;

import java.util.Scanner;

public class PalimedromOrNot {
	static int reverse;

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the input:");
		int input = s1.nextInt();

		int lowerLim = lowerLim(input);
		int upperLim = upperLim(input);
		printPalindromNumber(lowerLim, upperLim);
	}

	static void printPalindromNumber(int lowerLim, int upperLim) {
		System.out.println("palindrome nos:-");
		int count = 0;
		for (int i = lowerLim; i <= upperLim; i++) {
			if (palindromNumber(i)) {
				System.out.print(i);
				System.out.print(", ");
				count++;
			}
		}
		System.out.print("\nThe total no of palindrome no between: " + lowerLim + " to " + upperLim + " is: " + count);
	}

	static int upperLim(int input) {
		int upperLim = (int) (Math.pow(10, input)) - 1;
		return upperLim;
	}
	static int lowerLim(int input) {
		int lowerLim = (int) (Math.pow(10, input-1));
		return lowerLim;
	}
	static boolean palindromNumber(int number) {
		int originalNumber = number;
		int reversedNumber = 0;

		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		return originalNumber == reversedNumber;
	}
}

//find with for loop