package assignments;

class Animal1 {
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Assignment29MethodOverridingEx {
	
	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.makeSound();
		
	}

}

