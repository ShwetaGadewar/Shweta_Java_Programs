package JavaPracticeMay;
class parent{
	void add() {
		System.out.println("1");
	}
}
public class MethodOverridingEx0105 extends parent{
	void add() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverridingEx0105 a1=new MethodOverridingEx0105();
		a1.add();
		
	}

}
