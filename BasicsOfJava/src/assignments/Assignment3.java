package assignments;

public class Assignment3 {

	
		public static void main(String[] args) {
			
			Assignment3 add1=new Assignment3();
			add1.add();
			Assignment3 sub1=new Assignment3();
			sub1.sub();
			Assignment3 div1=new Assignment3();
			div1.div();
			Assignment3 mod1=new Assignment3();
			mod1.mod();
			
		}

		void add() {
			int a = 300;
			int b = 100;
			int add = b + a;

			System.out.println(add);

		}

		 void sub() {
			int a = 300;
			int b = 100;
			int sub = a - b;
			System.out.println(sub);
		}

		 void div() {

			int a = 4;
			int b = 2;
			int c = a / b;
			System.out.println(c);

		}

		 void mod() {
			int a = 200;
			int b = 50;
			int Mod = a % b;

			System.out.println(Mod);

		}

	

}
