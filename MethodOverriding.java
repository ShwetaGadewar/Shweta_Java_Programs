package BasicConcept;
class name{

	void login() {
		System.out.println("Login with mobile no");
	}
}
public class MethodOverriding extends name{
	void login() {
		System.out.println("Login with email id");
	}
	

	public static void main(String[] args) {
		MethodOverriding m1=new MethodOverriding();
		m1.login(); 
		m1.login();
		
	}
}
