package assignments;

public class Assignment78RemoveAllAlphabet {

	public static void main(String[] args) {
      String s1="School12345";
      
      String out=s1.replaceAll("[a-z]"," ");
      System.out.println(out);
	}

}