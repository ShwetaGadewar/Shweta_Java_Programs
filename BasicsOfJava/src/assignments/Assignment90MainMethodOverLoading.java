package assignments;

public class Assignment90MainMethodOverLoading {

	public static void main(String[] args) {
System.out.println("1");
main(2);
main(2.2);
main();
	}
	public static void main(int a) {
		System.out.println("2");
			}
	public static void main(double b) {
		System.out.println("3");
			}
	public static void main() {
		System.out.println("4");
			}

}
