package avaj;

class WeatherTower extends Tower {

	WeatherTower() {}
	

	public String getWeather(Coordinates p_coordinates){
		WeatherProvider weatherProvider = WeatherProvider.getInstance();
		return weatherProvider.getCurrentWeather(p_coordinates);
	}

	public void changeWeather() {
		this.conditionChanged();
	}
}