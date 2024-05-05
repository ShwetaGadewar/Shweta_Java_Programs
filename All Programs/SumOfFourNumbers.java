package BasicConcept;

import java.util.Scanner;

public class SumOfFourNumbers {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		int num2 = s1.nextInt();
		int num3 = s1.nextInt();
		int num4 = s1.nextInt();

		int sum = num1 + num2 + num3 + num4;
		System.out.println("Sum of all 4 num is:" + sum);
	}

}
