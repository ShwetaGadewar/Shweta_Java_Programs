package BasicConcept;
class StudentConstructor
{
	 StudentConstructor(int a)
	 {
			System.out.println("Student contructor");

	 }
}
public class InvokingConstructor {
	InvokingConstructor()
	{
		System.out.println("Invoking contructor");
	}
	public static void main(String[] args) {
         new InvokingConstructor();
         new StudentConstructor(99);
         
	}

}
