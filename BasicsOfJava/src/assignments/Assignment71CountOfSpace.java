package assignments;

import java.util.Arrays;

public class Assignment71CountOfSpace {

	
		static int CountOfSpace=0;
		public static void main(String[] args) {
			String name="Shweta gadewar 1234";
			
			char[] C1=name.toCharArray();
			System.out.println(Arrays.toString(C1));
			
			for(int i=0;i<C1.length;i++) {
				boolean answer=Character.isSpaceChar(C1[i]);
				if(answer==true) {
					CountOfSpace++;
				}
			}System.out.println("The Total no of Numeric:"+CountOfSpace);

		

	}

}
