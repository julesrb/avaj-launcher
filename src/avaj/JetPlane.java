package avaj;

class JetPlane extends Aircraft {
	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) throws ExceptionImpossibeCoordinates {
		super(p_id, p_name, p_coordinate);
	}


	public void updateConditions() {
		String weather = weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
				coordinates.addLatitude(10);
				coordinates.addHeight(2);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": my sunglasses!\n");
				break;
			case "RAIN":
				coordinates.addLatitude(5);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": it's leaking in here\n");
				break;
			case "FOG":
				coordinates.addLatitude(1);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": im blind!\n");
				break;
			case "SNOW":
				coordinates.addHeight(-7);
				if (this.checkNeedsLanding())
					return;
				Simulation.getInstance().write(this.getRef() + ": glaglagla.\n");
				break;
		}
	}


	public String getRef() {
		return "JetPlane#" + name + "("  + id + ")";
	}
}