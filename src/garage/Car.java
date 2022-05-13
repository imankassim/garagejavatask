package garage;

public class Car extends Vehicle{
	private int doors;
	private boolean electric;
	private String model;
	
	
	//constructor
	public Car(int wheels, boolean insurance, int maxPassenger, String colour, int doors, boolean electric,
			String model) {
		super(wheels, insurance, maxPassenger, colour);
		this.doors = doors;
		this.electric = electric;
		this.model = model;
	}

	//abstract methods
	@Override
	public String wheelCount() {
		return "Your car has " + getWheels() + " wheels";
	}


	@Override
	public String passengerCount() {
		return "Your car can have a maximum of " + getMaxPassenger() + " passengers";
	}
	

	
	

}
