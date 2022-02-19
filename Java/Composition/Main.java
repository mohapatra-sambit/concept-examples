package composition;

public class Main {
	
	public static void main(String[] args) {
		LicensePlate lp = new LicensePlate();
		lp.setStateCode("MH");
		lp.setIndex("12");
		lp.setPrefix("NO");
		lp.setNumber(8301);
		Car c = new Car("Maruti", "800", lp);
		System.out.println(c);
		c = null;
		System.out.println("\n" + lp);
		
	}

}
