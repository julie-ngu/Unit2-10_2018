/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Bike (motorcycle) subclass (child class) of Vehicle class for vehicle program
 *
 ****************************************************************************/

public class Bike extends Vehicle {
	
	public Bike(String license,
				String colour) {
		
		super(license, colour); //inherits properties from superclass constructor
	}
	
	// second constructor
	public Bike(String license,
				String colour,
				int numWheels) {
		
		super(license, colour, 2);
	}
}
