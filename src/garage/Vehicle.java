package garage;

public abstract class Vehicle {
	
	private int wheels;
	private boolean insurance;
	private int maxPassenger;
	private String colour;
	
	//constructor
	public Vehicle(int wheels, boolean insurance, int maxPassenger, String colour) {
		super();
		this.wheels = wheels;
		this.insurance = insurance;
		this.maxPassenger = maxPassenger;
		this.colour = colour;
	}
	
	
	//methods for testing - configure when used
	public abstract String wheelCount();
	
	public abstract String passengerCount();

	//getters and setters
	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public boolean isInsurance() {
		return insurance;
	}


	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}


	public int getMaxPassenger() {
		return maxPassenger;
	}


	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	

}
