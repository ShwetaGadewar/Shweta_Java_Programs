package BasicConcept;

public class NonStaticMethodEx 
{
	void add()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=100;
		int b=200;
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		NonStaticMethodEx n1=new NonStaticMethodEx();//syntax to create an Object
		n1.add();
		n1.sub();
		
	}

}
