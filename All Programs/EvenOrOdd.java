package BasicConcept;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no:");
        //int num=scanner.nextInt();
        int num=6;
        if(num%2==0)
        {
        	System.out.println("Num is Even");
        }
        else
        {
        	System.out.println("Num is Odd");
        }
	}

}
