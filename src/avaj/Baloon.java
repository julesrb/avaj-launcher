package avaj;

class Baloon extends Aircraft{

	public Baloon(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	public void updateConditions() {
		String weather = weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
				coordinates.addLongitude(2);
				coordinates.addHeight(4);
				// needs to land ?
				System.out.println(this.getRef() + ": praise the sun!");
				break;
			case "RAIN":
				coordinates.addHeight(-5);
				// needs to land ?
				System.out.println(this.getRef() + ": :'( !");
				break;
			case "FOG":
				coordinates.addHeight(-3);
				// needs to land ?
				System.out.println(this.getRef() + ": we're lost!");
				break;
			case "SNOW":
				coordinates.addHeight(-15);
				// needs to land ?
				System.out.println(this.getRef() + ": im freezing!");
				break;
		}
	}

	public String getRef() {
		return "Baloon#" + name + "("  + id + ")";
	}
}