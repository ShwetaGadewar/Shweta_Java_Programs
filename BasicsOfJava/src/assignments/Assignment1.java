package assignments;

public class Assignment1 {
    
	static void method1() {
		System.out.println("its Static method");
		
	}
	
	void method2() {
		
		System.out.println("its Non Static method");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      method1();
      Assignment1 m2=new Assignment1();
      m2.method2();
      
	}

}
