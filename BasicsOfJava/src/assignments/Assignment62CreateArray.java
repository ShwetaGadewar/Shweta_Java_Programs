package assignments;

public class Assignment62CreateArray {

	public static void main(String[] args) {
		System.out.println("Student name    rollno        gender");

		String name[] = new String[4];
		name[0] = "shweta";
		name[1] = "shreya";
		name[2] = "satyam";
		name[3] = "shivam";

		int[] rollno = new int[4];
		rollno[0] = 1;
		rollno[1] = 2;
		rollno[2] = 3;
		rollno[3] = 4;

		char gender[] = new char[4];
		gender[0] = 'F';
		gender[1] = 'F';
		gender[2] = 'M';
		gender[3] = 'M';

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "          " + rollno[i] + "              " + gender[i]);
		}

	}

}
