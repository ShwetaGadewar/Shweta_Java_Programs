package BasicConcept;

public class ConstructorEx {
	ConstructorEx() {

		System.out.println("consturctor");
	}
	ConstructorEx(int a){
		System.out.println("consturctor with parametrize");
	}
	void add() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ConstructorEx();
		new ConstructorEx(23344);
	}

}
