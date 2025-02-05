package avaj;

import java.util.List;
import java.util.ArrayList;
import avaj.Flyable;

class Tower
{
	private List<Flyable> observers = new ArrayList<>();

	public Tower() {
	}


	public void register(Flyable p_flyable) {
		System.out.println("Tower says: " + p_flyable.getRef() + " registered to weather tower.");
		observers.add(p_flyable);
	}

	public void unregister(Flyable p_flyable) {
	}

	protected void conditionChanged() {
	}
}