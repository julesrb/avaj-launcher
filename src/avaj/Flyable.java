package avaj;

abstract class Flyable {

	protected static WeatherTower weatherTower;

	public abstract void updateConditions();

	public abstract String getRef();

	public void registerTower(WeatherTower p_tower) {
		this.weatherTower = p_tower;
		this.weatherTower.register(this);
	}
}