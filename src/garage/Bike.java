package garage;

public class Bike extends Vehicle{
	private String model;
	private boolean electric;
	private int gearcount;
	
	
	//constructors
	public Bike(int wheels, boolean insurance, int maxPassenger, String colour, String model, boolean electric,
			int gearcount) {
		super(wheels, insurance, maxPassenger, colour);
		this.model = model;
		this.electric = electric;
		this.gearcount = gearcount;
	}


	//abstract methods
	@Override
	public String wheelCount() {
		return "Your bike has " + getWheels() + " wheels";
	}


	@Override
	public String passengerCount() {
		return "Your bike can have a maximum of " + getMaxPassenger() + " passengers";
	}


	@Override
	public String toString() {
		return "Bike [model=" + model + ", electric=" + electric + ", gearcount=" + gearcount + ", getWheels()="
				+ getWheels() + ", isInsurance()=" + isInsurance() + ", getMaxPassenger()=" + getMaxPassenger()
				+ ", getColour()=" + getColour() + "]";
	}
	
	
	
	
	
	

}
