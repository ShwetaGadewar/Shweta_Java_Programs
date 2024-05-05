package BasicConcept;

class parent1 {
    void add() {
	System.out.println("add");	
	}
     void sub() {
    		System.out.println("sub");	

	}
	
}
public class InheritaingNonstaticMethods extends parent1{
	 void mul() {
			System.out.println("mul");	

		}
	  void sub() {
  		System.out.println("sub1");	

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritaingNonstaticMethods c1=new InheritaingNonstaticMethods();
		c1.add();
		c1.mul();
		c1.sub();
		
	}

}
