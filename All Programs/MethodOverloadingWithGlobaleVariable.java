package BasicConcept;

public class MethodOverloadingWithGlobaleVariable {
     int a=50;
     int b=10;
     
	
	void add()
  {
	  int c=a+b;
	  System.out.println(c);
  }
  void add(int a)
  {
	  int d=a+b;
	  System.out.println(d);
  }
	public static void main(String[] args) {
		MethodOverloadingWithGlobaleVariable M1=new MethodOverloadingWithGlobaleVariable();
		M1.add();
		M1.add(60);
  
	}

}
