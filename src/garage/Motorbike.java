package garage;

public class Motorbike extends Vehicle{
	private String model;
	private int tanksize;
	private String additionalfeature;
	
	//constructor
	public Motorbike(int wheels, boolean insurance, int maxPassenger, String colour, String model, int tanksize,
			String additionalfeature) {
		super(wheels, insurance, maxPassenger, colour);
		this.model = model;
		this.tanksize = tanksize;
		this.additionalfeature = additionalfeature;
	}

	//abstract methods
	@Override
	public String wheelCount() {
		return "Your motorbike has " + getWheels() + " wheels";
	}

	@Override
	public String passengerCount() {
		return "Your motorbike can have a maximum of " + getMaxPassenger() + " passengers";
	}
	
	
	
	
	
	
	
	

}
