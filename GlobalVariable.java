package BasicConcept;

public class GlobalVariable {
       int age=28;
      String name="Shweta";
      double weight=70.21;
      void add(String name,int age,int weight )
      {
    	 System.out.println("My Bio is:"+name+age+weight); 
      }
      	  
	public static void main(String[] args) {
		GlobalVariable g1=new GlobalVariable();
				
		System.out.println(g1.name);
		System.out.println(g1.age);
		System.out.println(g1.weight);
		g1.add("Prasad",30,75);
		
	}

}
