
public class Main {

	public static void main (String[] args) {
		if (args.lenght != 1)
			System.out.println("Argument needs to be a file");

		try {
			Scenario scenario = new Scenario(args[0]);

		} catch {
			System.out.println("Argument needs to be a file");
			return;
		}

		System.out.print("cycles = ");
		System.out.print(cycles);

		// get i;

		// register the aircrafts 
		// Baloon B1 2 3 20

	}
}