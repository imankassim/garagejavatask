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

	@Override
	public String toString() {
		return "Motorbike [model=" + model + ", tanksize=" + tanksize + ", additionalfeature=" + additionalfeature
				+ ", getWheels()=" + getWheels() + ", isInsurance()=" + isInsurance() + ", getMaxPassenger()="
				+ getMaxPassenger() + ", getColour()=" + getColour() + "]";
	}

	
	//getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTanksize() {
		return tanksize;
	}

	public void setTanksize(int tanksize) {
		this.tanksize = tanksize;
	}

	public String getAdditionalfeature() {
		return additionalfeature;
	}

	public void setAdditionalfeature(String additionalfeature) {
		this.additionalfeature = additionalfeature;
	};

	@Override
	public float fixVehicle() {
		float repaircost = 40;
		repaircost = repaircost + (30 * getWheels()) + (5 * getMaxPassenger()) + (30 * getTanksize());
		return repaircost;
	}
	
	
	
	
	
	
	
	
	

}
