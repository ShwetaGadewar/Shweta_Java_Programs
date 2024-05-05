package assignments;

public class Assignment2 {
	Assignment2(int i,int j,int c,long d,double e,char f,boolean g ){
		System.out.println("contructor using 7 arguments");
	}
	Assignment2(char a){
		System.out.println('S');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Assignment2(100,300000,55,5678999,56.77,'a',true);
     new Assignment2('A');
	}

}
