package assignments;

public class Assignment23NestedIf {

	public static void main(String[] args) {
		int x = 30;
        int y = 10;
        int z = 20;

        if (x > y) {
            System.out.println("x is greater than y");
            
            if (x > z) {
                System.out.println("x is the greatest");
            } else {
                System.out.println("z is the greatest");
            }
        } else {
            System.out.println("y is greater than x");
            
            if (y > z) {
                System.out.println("y is the greatest");
            } else {
                System.out.println("z is the greatest");
            }

	}
	}
}
