package BasicConcept;



class Amazon_Appliction{
	private String un="shweta@gmail.com";

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}	
	
}
public class EncapsulationEx2504 {

	public static void main(String[] args) {
		Amazon_Appliction A1=new Amazon_Appliction();
		A1.setUn("Prasad@gmail.com");
		System.out.println(A1.getUn());

		
		
		
	}

}

	