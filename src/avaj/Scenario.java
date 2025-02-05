package avaj;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Scenario {
	


	public int cycles;
	private File file;

	public Scenario(String fileName) throws Exception {
		
		file = new File("./" + fileName);
		if (!file.exists() || !file.isFile())
			throw new Exception("File doesnt exist!");
		if (!file.getName().endsWith(".txt"))
			throw new Exception("wrong file format!");
	}

	public void parse(AircraftFactory aircraftFactory, WeatherTower weatherTower) throws Exception {

		Scanner scanner = new Scanner(file);
		if (scanner.hasNextInt()) {
			cycles = scanner.nextInt();
			scanner.nextLine();
		} else {
			throw new Exception("Invalid cycles content");
		}
		if (cycles <= 0)
			throw new Exception("Invalid cycles : " + cycles);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] parts = line.split(" ");
			int a, b, c;
			if (parts.length != 5)
				throw new Exception("Invalid aircraft param number");
			try {
				a = Integer.parseInt(parts[2]);
				b = Integer.parseInt(parts[3]);
				c = Integer.parseInt(parts[4]);
			} catch (Exception e) {
				throw new Exception("Invalid aircraft coordinates");
			}
			if (!(parts[0].equals("Baloon") || parts[0].equals("JetPlane") || parts[0].equals("Helicopter")))
				throw new Exception("Invalid aircraft type : " + parts[0]);
			Flyable flyable = aircraftFactory.newAircraft(parts[0], parts[1], new Coordinates(a, b, c));
			flyable.registerTower(weatherTower);
		}
	}
}