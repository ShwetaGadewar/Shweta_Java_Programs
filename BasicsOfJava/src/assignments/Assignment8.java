package assignments;

public class Assignment8 {
        static int a=40;
        static int b=20;
        
        void add() {
        	int c=a+b;
        	System.out.println(c);
        }
        void sub() {
        	int d=a-b;
        	System.out.println(d);
        }
        void mul() {
        	int e=a*b;
        	System.out.println(e);
        }
        void mod() {
        	int f=a%b;
        	System.out.println(f);
        }
	public static void main(String[] args) {
		
		Assignment8 A=new Assignment8();
		A.add();
		A.sub();
		A.mul();
		A.mod();
				
	}

}
