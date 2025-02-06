package avaj;

// import avaj.Scenario;

public class Main {



	public static void main (String[] args) {

		if (args.length != 1){
			System.out.println("Argument missing");
			return;
		}

		AircraftFactory aircraftFactory = AircraftFactory.getInstance();
		WeatherTower weatherTower = new WeatherTower();
		Scenario scenario;

		try {
			scenario = new Scenario(args[0]);
			scenario.parse(aircraftFactory, weatherTower);
		} catch (Exception e) {
			System.out.println("Scenario failed: " + e.getMessage());
			return;
		}

		for (int i = 0; i < scenario.cycles; i++)
			weatherTower.changeWeather();
		return;
	}
}