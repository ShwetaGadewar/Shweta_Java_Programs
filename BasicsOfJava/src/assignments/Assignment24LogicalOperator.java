package assignments;

public class Assignment24LogicalOperator {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		
		System.out.println("Logical AND (&&) operator:");
        System.out.println("a && b = " + (a && b)); 
        System.out.println("a && a = " + (a && a)); 
        System.out.println();
        
        System.out.println("Logical OR (||) operator:");
        System.out.println("a || b = " + (a || b)); 
        System.out.println("b || b = " + (b || b)); 
        System.out.println();
        
        System.out.println("Logical NOT (!) operator:");
        System.out.println("!a = " + (!a)); 
        System.out.println("!b = " + (!b)); 
        System.out.println();
        
        System.out.println("Combining logical operators:");
        System.out.println("!(a && b) = " + !(a && b)); 
        System.out.println("!(a || b) = " + !(a || b)); // 

	}

}
