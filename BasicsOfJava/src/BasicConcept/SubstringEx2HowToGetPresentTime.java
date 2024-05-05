package BasicConcept;

import java.util.Date;

public class SubstringEx2HowToGetPresentTime {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		String input= d.toString();
		System.out.println(input);
		
		String month=input.substring(4, 7);
		System.out.println(month);
		String date=input.substring(8, 10);
		System.out.println(date);
		String year=input.substring(24);
		System.out.println(year);
		
		
		System.out.println("===============================");
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));

	}

}
