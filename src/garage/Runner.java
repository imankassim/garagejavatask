package garage;

public class Runner {

	public static void main(String[] args) {
		
		//make new objects - datatype of vehicletype
		
		//car var = (int wheels, boolean insurance, int maxPassenger, String colour, int doors, boolean electric, String model)
		Car toyota1 = new Car(4, true, 5, "Blue", 3, true, "Yaris");
		Car mercedes1 = new Car(6, false, 7, "Red", 5, false, "A-Class");
		
		//bike var  = int wheels, boolean insurance, int maxPassenger, String colour, String model, boolean electric, int gearcount
		Bike raleigh1 = new Bike(2, false, 1, "Black", "X637", true, 7);
		Bike trek1 = new Bike(2, true, 1, "Green", "Z6280", false, 4);
		
		
		//motorbike var = int wheels, boolean insurance, int maxPassenger, String colour, String model, int tanksize, String additionalfeature
		Motorbike yamaha1 = new Motorbike(2, true, 2, "Silver", "X2 Sport", 2, "Storage box");
		Motorbike harleyd2 = new Motorbike(3, true, 3, "Black", "Sportster Iron 883", 4, "Sidecar");
		
		
		System.out.println(toyota1.wheelCount());
		System.out.println(mercedes1.wheelCount());
		
		System.out.println(raleigh1.passengerCount());
		System.out.println(harleyd2.passengerCount());
		

	}

}
