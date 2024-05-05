package BasicConcept;

public class ArithmaticOperations 
{    static int a=50;
     static int b=30;
     
	static void add()
	{
		int c=a+b;
		
		System.out.println(c);
	}
	static void sub()
	{
		int d=a-b;
		System.out.println(d);
		
	}static void mul()
	{
		int e=a*b;
		System.out.println(e);
		
	}static void div()
	{
		int f=a/b;
		System.out.println(f);
		
	}static void mod()
	{
		int g=a%b;
		System.out.println(g);
		
	}
	
	
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}
	
	
}
