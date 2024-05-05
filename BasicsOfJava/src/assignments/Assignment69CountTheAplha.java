package assignments;

import java.util.Arrays;

public class Assignment69CountTheAplha {
static int 				CountOfAlpha=0;
	public static void main(String[] args) {
		String name="Shweta";
		
		char[] C1=name.toCharArray();
		System.out.println(Arrays.toString(C1));
		
		for(int i=0;i<C1.length;i++) {
			boolean answer=Character.isAlphabetic(C1[i]);
			if(answer==true) {
				CountOfAlpha++;
			}
		}System.out.println(CountOfAlpha);

	}

}
