package assignments;

import java.util.Arrays;

public class Assignment70CountOfNumeric {

	
		static int CountOfNumeric=0;
		public static void main(String[] args) {
			String name="Shweta1234";
			
			char[] C1=name.toCharArray();
			System.out.println(Arrays.toString(C1));
			
			for(int i=0;i<C1.length;i++) {
				boolean answer=Character.isDigit(C1[i]);
				if(answer==true) {
					CountOfNumeric++;
				}
			}System.out.println("The Total no of Numeric:"+CountOfNumeric);

		
	}

}
