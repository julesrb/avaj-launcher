package avaj;

class Coordinates {
	private int longitude;
	private int latitude;
	private int height;

	public Coordinates(int p_longitude, int p_latitude, int p_height) {
		longitude = p_longitude;
		latitude = p_latitude;
		height = p_height;
	}


	public int getLongitude() {
		return longitude;
	}


	public int getLatitude() {
		return latitude;
	}

	
	public int getHeight() {
		return height;
	}


	public void addLongitude(int p_longitude) {
		this.longitude += p_longitude;
	}


	public void addLatitude(int p_latitude) {
		this.latitude += p_latitude;
	}


	public void addHeight(int p_height) {
		this.height += p_height;
		if (this.height > 100)
			this.height = 100;
	}
}