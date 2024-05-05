package BasicConcept;
public class Program1
{
	public static void main(String[] args) 
	{
	System.out.println("main method");	
	Program1 p1=new Program1();
	Program1 p2=new Program1();
	}
	Program1()
	{
		System.out.println("Constructor");	
	}
	static
	{
		System.out.println("SIB");	
	}
	static
	{
		System.out.println("SIB 1");	
	}
	{
		System.out.println("IIB");	

	}
	{
		System.out.println("IIB 1");	

	}
}
