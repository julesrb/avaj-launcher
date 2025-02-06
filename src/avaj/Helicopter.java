package avaj;

class Helicopter extends Aircraft {
	
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	public void updateConditions() {
		String weather = weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
				coordinates.addLongitude(10);
				coordinates.addHeight(2);
				// needs to land ?
				System.out.println(this.getRef() + ": i'm burning!");
				break;
			case "RAIN":
				coordinates.addLongitude(5);
				// needs to land ?
				System.out.println(this.getRef() + ": i'm wet!");
				break;
			case "FOG":
				coordinates.addLongitude(1);
				// needs to land ?
				System.out.println(this.getRef() + ": i have brain fog.");
				break;
			case "SNOW":
				coordinates.addHeight(-12);
				// needs to land ?
				System.out.println(this.getRef() + ": i'm santa clauss!");
				break;
		}
	}

	public String getRef() {
		return "Helicopter#" + name + "("  + id + ")";
	}
}