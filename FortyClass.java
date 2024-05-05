package BasicConcept;

public class FortyClass {
   int age12;
   String name12;
   double weight12;
   
   void School(int age,String name,double weight) {
	   System.out.println("Student name is"+ name +"Student age is:"+age+"Student weight"+weight);
   }
	public static void main(String[] args) {
		GlobalVariable g1=new GlobalVariable();
		
		System.out.println(g1.name);
		System.out.println(g1.age);
		System.out.println(g1.weight);
		g1.add("Prasad",30,75);
	}

}


