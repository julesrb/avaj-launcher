package avaj;

class Helicopter extends Aircraft {
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates) throws ExceptionImpossibeCoordinates {
		super(p_id, p_name, p_coordinates);
	}


	public void updateConditions() {
		String weather = weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
				coordinates.addLongitude(10);
				coordinates.addHeight(2);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": i'm burning!\n");
				break;
			case "RAIN":
				coordinates.addLongitude(5);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": i'm wet!\n");
				break;
			case "FOG":
				coordinates.addLongitude(1);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": i have brain fog.\n");
				break;
			case "SNOW":
				coordinates.addHeight(-12);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": i'm santa clauss!\n");
				break;
		}
	}


	public String getRef() {
		return "Helicopter#" + name + "("  + id + ")";
	}
}