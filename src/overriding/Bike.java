package overriding;

public class Bike extends Vehicle{

	
	public void run(){
		System.out.println("I am i Bike Class");
	}
	public static void main(String[] args) {

		Bike b =new Bike();
		b.run();
		
		
	}

}
