package assignments;

public class Assignment79RemoveAllNumeric {

	public static void main(String[] args) {
      String s1="School12345";
      
      String out=s1.replaceAll("[0-9]"," ");
      System.out.println(out);
	}

}