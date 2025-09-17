package Heirarchicalinhertance;

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		        Car car = new Car();
		        Motorcycle motorcycle = new Motorcycle();

		        car.display();             // From parent class
		        motorcycle.display();      // From parent class
		        car.displaycar();          // Specific to Car
		        motorcycle.displayMotorcycle(); // Specific to Motorcycle
	}

}
