package BasicConcept;

public class AccessSeEx {
public void add() {
	System.out.println("1");
}
private void sub() {
	System.out.println("2");
}
protected void mul() {
	System.out.println("3");
}
void div() {
	System.out.println("4");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSeEx A1=new AccessSeEx();
		A1.add();
		A1.mul();
		A1.sub();
		A1.div();
       
	}

}
