package avaj;

import java.util.Random;

class WeatherProvider {
	private static WeatherProvider instance = new WeatherProvider();
	private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};


	private WeatherProvider() {}


	public static WeatherProvider getInstance() {
		return instance;
	}

	public String getCurrentWeather(Coordinates p_coordinates) {
		
		int turbulances = (p_coordinates.getLongitude() *
							p_coordinates.getLatitude() +
							p_coordinates.getHeight()) * new Random().nextInt(10);
		turbulances = turbulances < 0 ? turbulances * -1 : turbulances;
		turbulances = turbulances % 4;
		return (weather[turbulances]);
	}
}