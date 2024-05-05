package assignments;

import java.util.Scanner;

public class Assignment11 {
		
		
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the first number: ");
			double num1=scanner.nextDouble();
			
			System.out.println("Enter the Second number: ");
			double num2=scanner.nextDouble();
			
			
			double add=num1+num2;
			
			double sub=num1-num2;
			
			double mul=num1*num2;
			
			double div=num1/num2;
			
			double mod=num1%num2;
			
			System.out.println("addition of two num:"+add);
			System.out.println("Subtraction of two num:"+sub);
			System.out.println("Multiplication of two num:"+mul);
			System.out.println("Divition of two num:"+div);
			System.out.println("Modulus of two num:"+mod);
			
			scanner.close();
			
		}
		

	

}
