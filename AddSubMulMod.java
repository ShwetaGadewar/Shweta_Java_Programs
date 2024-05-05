package BasicConcept;

public class AddSubMulMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		div();
		mod();
	}

	public static void add() {
		int a = 300;
		int b = 100;
		int add = b + a;

		System.out.println(add);

	}

	public static void sub() {
		int a = 300;
		int b = 100;
		int sub = a - b;
		System.out.println(sub);
	}

	public static void div() {

		int a = 4;
		int b = 2;
		int c = a / b;
		System.out.println(c);

	}

	public static void mod() {
		int a = 200;
		int b = 50;
		int Mod = a % b;

		System.out.println(Mod);

	}

}
