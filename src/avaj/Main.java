package avaj;

public class Main {
	public static void main (String[] args) {
		if (args.length != 1){
			System.out.println("Argument missing");
			return;
		}

		Simulation simulation = Simulation.getInstance();
		simulation.run(args[0]);
	}
}