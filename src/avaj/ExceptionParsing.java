package avaj;

public class ExceptionParsing extends Exception {
	public ExceptionParsing(String s) {
		super(s + " params are wrong or empty, parsing failed");
	}
}