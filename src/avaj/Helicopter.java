package avaj;

class Helicopter extends Aircraft {
	
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	public void updateConditions() {

	}

	public String getRef() {
		return "Helicopter#" + name + "("  + id + ")";
	}
}