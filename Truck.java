/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Truck subclass (child class) of Vehicle class for vehicle program
 *
 ****************************************************************************/

public class Truck extends Vehicle {
	private int _numDoors; //adds property
	
	public Truck (String license,
				  String colour,
				  int numWheels) {
		
		super(license, colour, numWheels); //inherits properties from superclass constructor
	}
	
	// second constructor
	public Truck (String license,
				  String colour,
				  int numWheels,
				  int numDoors) {
		
		super(license, colour, numWheels);
		this._numDoors = numDoors;
	}
	
	public int getDoors() {
		return _numDoors;
	}
}
