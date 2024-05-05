package assignments;

import java.util.Arrays;

public class Assignment72CountSpecialChar {
	static int CountOfNumeric;
	static int CountOfSpace;
	static int CountOfSpecialChar = 0;
	static int CountOfAplha = 0;

	public static void main(String[] args) {
		String name = "Shweta gadewar 1234%$^";

		char[] C1 = name.toCharArray();
		System.out.println(Arrays.toString(C1));
		int LenghOfString = name.length();
		System.out.println("The total no of string:" + LenghOfString);
        System.out.println("=====================================================");
		for (int i = 0; i < C1.length; i++) {
			boolean answer = Character.isAlphabetic(C1[i]);
			if (answer == true) {
				CountOfAplha++;
			}
			boolean answer1 = Character.isDigit(C1[i]);
			if (answer1 == true) {

				CountOfNumeric++;

			}
			boolean answer2 = Character.isSpaceChar(C1[i]);
			if (answer2 == true) {
				CountOfSpace++;

			}
		}
		System.out.println("The total no of Alphabet:" + CountOfAplha);
		System.out.println("The total no of Numeric:" + CountOfNumeric);
		System.out.println("The total no of spaces:" + CountOfSpace);

		int TotalCount = CountOfAplha + CountOfNumeric + CountOfSpace;
		System.out.println("The Count of Alphabet,spaces,Numeric:" + TotalCount);
		
		CountOfSpecialChar = name.length() - TotalCount;

		System.out.println("The total no of SpecialChar:" + CountOfSpecialChar);
	}

}
