package avaj;

class AircraftFactory {


	private static AircraftFactory instance = new AircraftFactory();

	private static int id = 0;

	private AircraftFactory() {}


	public static AircraftFactory getInstance() {
			return instance;
	}


	public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
		
		
		id++;
		switch (p_type) {
			case "Baloon":
				return new Baloon(id, p_name, p_coordinates);

			case "JetPlane":
				return new JetPlane(id, p_name, p_coordinates);

			case "Helicopter":
				return new Helicopter(id, p_name, p_coordinates);

			default:
				return null;
		}
	}
}