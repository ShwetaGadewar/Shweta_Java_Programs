package assignments;

import java.util.Arrays;

public class Assignment74Find41INArray {
static int value;
	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=11;
		num[1]=41;
		num[2]=98;
		num[3]=78;
		int givenno=41;
		System.out.println(Arrays.toString(num));
		
		for(int i=0;i<num.length;i++) {
			
			if(givenno==num[i])
			{ value++;
				System.out.println("The no is present in the array");
				
			}
			else	
			{
				System.out.println("The no is Not present in the array");

			}
		}System.out.println(value);
		
		
	}

}
