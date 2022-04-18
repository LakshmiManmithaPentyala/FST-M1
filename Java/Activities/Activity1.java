package activities;

public class Activity1 {
	public static void main(String args[]) {
	
	Car c = new Car();
	c.color = "Black";
	c.make=2014;
	c.transmission= "Manual";
	
    c.displayCharacteristics();
    c.accelrate();
    c.brake();
	

}

}