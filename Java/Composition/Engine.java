package composition;

public class Engine {
	
	private int numOfCylinders;
	
	private int numOfValves;
	
	private String valveType;
	
	private int displacement;
	
	private int maxTorque;
	
	private int maxPower;
	
	private String transmissionType;

	public int getNumOfCylinders() {
		return numOfCylinders;
	}

	public void setNumOfCylinders(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}

	public int getNumOfValves() {
		return numOfValves;
	}

	public void setNumOfValves(int numOfValves) {
		this.numOfValves = numOfValves;
	}

	public String getValveType() {
		return valveType;
	}

	public void setValveType(String valveType) {
		this.valveType = valveType;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getMaxTorque() {
		return maxTorque;
	}

	public void setMaxTorque(int maxTorque) {
		this.maxTorque = maxTorque;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
}
