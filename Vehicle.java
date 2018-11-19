/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Vehicle file for vehicle program (holds all variables, etc. to make 
 * 		program work, parent class of bike and truck classes)
 *
 ****************************************************************************/

public abstract class Vehicle {
	private String _license;
	private String _colour;
	private int _numWheels;
	private double _speed = 0;
	private double _maxSpeed = 160;
	
	//constructor
	public Vehicle (String license,
					String colour) {
		
		this._license = license;
		this._colour = colour;
	}
	public Vehicle (String license,
					String colour,
					int numWheels) {

		this._license = license;
		this._colour = colour;
		this._numWheels = numWheels;
	}
	
	// getters and setters
	public String getLicense() {
		return _license;
	}
	public void setLicense(String input) {
		this._license = input;
	}
	
	public String getColour() {
		return _colour;
	}
	
	public int getWheels() {
		return _numWheels;
	}
	
	public void setWheels(int input) {
		if(input > 0) {
			if(input == 2) {
				this._numWheels = 2;
			}
			else if(input == 3 || input % 2 == 0 && input > 2) {
				this._numWheels = input;
			}
			else {
				this._numWheels = -1;
			}
		}
		else {
			this._numWheels = -1;
		}
	}
	
	public double getSpeed() {
		return _speed;
	}
	
	public double getMax() {
		return _maxSpeed;
	}
	
	// methods
	protected void accelerate(int increment) {
		// increases speed
		
		if(increment <= _maxSpeed) {
			_speed += increment;
		}
		else {
			_speed = _maxSpeed;
		}
	}
	
	protected void brake(int decrement) {
		// apply brakes
		if(decrement <= _speed) {
			_speed -= decrement;
		}
		else {
			_speed = 0;
		}
	}
}
