package avaj;

abstract class Aircraft extends Flyable {
	protected long id;
	protected String name;
	protected Coordinates coordinates;

	public abstract void updateConditions();

	public abstract String getRef();

	protected boolean checkNeedsLanding() {
		if (coordinates.getHeight() <= 0) {
			this.weatherTower.unregister(this);
			return true;
		}
		return false;
	}

	protected Aircraft(long p_id, String p_name, Coordinates p_coordinates) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinates;
		if (p_coordinates.getLongitude() < 0 || p_coordinates.getLatitude() < 0
			|| (p_coordinates.getHeight() < 0 || p_coordinates.getHeight() > 100)) {
				System.out.println(this.getRef() + ": is off grid and wont be added");
			}
	}
}