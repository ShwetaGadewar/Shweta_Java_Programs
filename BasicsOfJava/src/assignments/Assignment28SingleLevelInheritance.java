package assignments;
class animal{
	void eat() {
		System.out.println("animal is eating");
	}
}
class dog extends animal{
	void bark() {
		System.out.println("dog is barking");
	}
}
public class Assignment28SingleLevelInheritance {

	public static void main(String[] args) {
		
dog dog=new dog();
dog.bark();
dog.eat();

	}

}
