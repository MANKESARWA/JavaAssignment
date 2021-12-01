package utils;

import custom_exception.SpeedOutOfRangeException;

public class ValidationRules {
	
	//adding the constants for speed boundaries
	public static final int MINSPEED;
	public static final int MAXSPEED;
	static
	{
		MINSPEED = 40;
		MAXSPEED = 80;
	}
	//adding a static method to make speed validation
	
	public static void validationSpeed(int Speed) throws SpeedOutOfRangeException {
		
		if(Speed<MINSPEED) {
			throw new SpeedOutOfRangeException("Your driving to slow can block the road.");
		}
		if(Speed>MAXSPEED) {
			throw new SpeedOutOfRangeException("Your driving to fast can have an fatal accedient.");	
		}
		
	}
	
}
