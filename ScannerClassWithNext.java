package BasicConcept;
import java.util.Scanner;
public class ScannerClassWithNext {
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		byte a1=	s1.nextByte();
		System.out.println(a1);
		short a2=	s1.nextShort();
		System.out.println(a2);
		int a3=	s1.nextInt();
		System.out.println(a3);

		long a4=			s1.nextLong();
		System.out.println(a4);

		String a5=		s1.next();
		System.out.println(a5);
		float f1=		s1.nextFloat();		
		System.out.println(f1);
		double f2=		s1.nextDouble();
		System.out.println(f2);
		boolean f3=				s1.nextBoolean();
		System.out.println(f3);
		s1.close();
		
	}

}
