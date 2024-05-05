package BasicConcept;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		System.out.print("Enter your gender (M/F): ");
		char gender = scanner.next().charAt(0);
		if (age > 18 && gender == 'F') {
			System.out.print("person is allowed to vote ");
		} else {
			System.out.print("person is Not allowed to vote ");
		}
	}
}