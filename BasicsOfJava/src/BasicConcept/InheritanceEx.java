package BasicConcept;
class parent{
  static void add() {
    	  System.out.println("addition");
      }
}
public class InheritanceEx extends parent{
	static void sub() {
  	  System.out.println("Subtraction");
    }
	public static void main(String[] args) {
		
      sub();
      add();
      
      
    
	}

}
