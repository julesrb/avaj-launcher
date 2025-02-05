package avaj;

class Baloon extends Aircraft{

	public Baloon(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	public void updateConditions() {

	}

	public String getRef() {
		return "Baloon#" + name + "("  + id + ")";
	}
}