class AircraftFactory {

	private static AircraftFactory instance;

	private AircraftFactory() {}

	public static AircraftFactory getInstance() {
		if (instance == null)
			instance = new AircraftFactory;
		else
			return instance;
	}


	public Flyable* newAircraft(string p_type, string p_name, Coordinates p_coordinates) {
		
		private static int id = 1000;
		id++;
		switch (p_type) {
			case "Baloon":
				return new Baloon(id, p_name, p_coordinates);

			case "JetPlane":
				return new JetPLane(id, p_name, p_coordinates);

			case "Helicopter":
				return new Helicopter(id, p_name, p_coordinates);

			case default:
				return null;
		}
	}
}