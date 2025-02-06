package avaj;

class WeatherProvider {

	private static WeatherProvider instance = new WeatherProvider();

	private WeatherProvider() {}

	public static WeatherProvider getInstance() {
		return instance;
	}

	private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};


	public String getCurrentWeather(Coordinates p_coordinates) {
		
		int turbulances = (p_coordinates.getLongitude() *
							p_coordinates.getLatitude() +
							p_coordinates.getHeight());
		turbulances = turbulances < 0 ? turbulances * -1 : turbulances;
		turbulances = turbulances % 4;
		return (weather[turbulances]);
	}
}