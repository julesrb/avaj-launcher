public class Aircaft {
	protected long id;
	protected string name;
	protected Coordinate coordinates;

	protected Aircraft(long p_id, string p_name, Coordinates p_coordinate) {
		this.id = p_id;
		this.name = p_name;
		this.Coordinates = p_coordinate;
	}
}