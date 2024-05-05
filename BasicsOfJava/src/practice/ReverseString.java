package practice;

public class ReverseString {

	public static void main(String[] args) {
          String name="Shweta";
          String  ReverseStr="";
          for(int i=name.length()-1;i>=0;i--) {
        	 char a=name.charAt(i) ;
        	 ReverseStr=ReverseStr+a;
          }System.out.println(ReverseStr);
	}

}
