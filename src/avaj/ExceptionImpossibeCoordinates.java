package avaj;

public class ExceptionImpossibeCoordinates extends Exception {
	public ExceptionImpossibeCoordinates(String s) {
		super(s + " is off grid and wont be added.");
	}
}