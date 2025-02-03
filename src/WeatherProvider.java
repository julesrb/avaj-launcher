class WeatherProvider {

	private static WeatherProvider instance;

	pirvate WeatherProvider() {}

	public static WeatherProvider getInstance() {
		if (instance == null)
			istance = new WeatherProvider;
		else
			return instance;
	}

	private string[] weather;

	

	private WeatherProvider() {

	}

	public string getCurrentWeather(Coordinates p_coordinates) {

	}
}