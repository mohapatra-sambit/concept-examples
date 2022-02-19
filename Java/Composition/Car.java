package composition;

public class Car {
	
	private String brand;
	
	private String model;
	
	private Engine engine;  //Aggregation -> has-a
	
	private LicensePlate licensePlate; //Association -> part-of

	public Car(String brand, String model, LicensePlate licensePlate) {
		super();
		this.brand = brand;
		this.model = model;
		this.licensePlate = licensePlate;
		engine = new Engine();
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public LicensePlate getLicensePlate() {
		return licensePlate;
	}

	@Override
	public String toString() {
		return brand + " " + model + "\n" + licensePlate;
	}
	
}
