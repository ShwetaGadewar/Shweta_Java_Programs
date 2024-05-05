package JavaPracticeMay;
class parent1{
	protected static int i=25;
	void add() {
		int j=i+50;
		System.out.println(j);
	}}
	
public class AccessModifireExProtected extends parent1{

	public static void main(String[] args) {
     System.out.println(i);
     AccessModifireExProtected b1=new AccessModifireExProtected();
     b1.add();
    		 
	}
	
	


}
