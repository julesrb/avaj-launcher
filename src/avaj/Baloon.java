package avaj;

class Baloon extends Aircraft{
	public Baloon(long p_id, String p_name, Coordinates p_coordinates) throws ExceptionImpossibeCoordinates {
		super(p_id, p_name, p_coordinates);
	}


	public void updateConditions() {
		String weather = weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
				coordinates.addLongitude(2);
				coordinates.addHeight(4);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().getInstance().write(this.getRef() + ": praise the sun!\n");
				break;
			case "RAIN":
				coordinates.addHeight(-5);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().getInstance().write(this.getRef() + ": :'( !\n");
				break;
			case "FOG":
				coordinates.addHeight(-3);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().getInstance().write(this.getRef() + ": we're lost!\n");
				break;
			case "SNOW":
				coordinates.addHeight(-15);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().getInstance().write(this.getRef() + ": im freezing!\n");
				break;
		}
	}


	public String getRef() {
		return "Baloon#" + name + "("  + id + ")";
	}
}