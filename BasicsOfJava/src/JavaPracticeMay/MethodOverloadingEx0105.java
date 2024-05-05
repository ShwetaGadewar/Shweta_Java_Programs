package JavaPracticeMay;

public class MethodOverloadingEx0105 {

	void sum(String a, String b) {
		System.out.println("int arg method invoked");
	}
	void sum(Object o1, Object o2) {
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		MethodOverloadingEx0105 obj = new MethodOverloadingEx0105();
		
		obj.sum("a","b");// 

	}

}
