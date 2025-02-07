package avaj;

import java.util.List;
import java.util.ArrayList;
import avaj.Flyable;

class Tower {
	private List<Flyable> observers = new ArrayList<>();
	private List<Flyable> toLand = new ArrayList<>();


	public Tower() {}


	public void register(Flyable p_flyable) {
		Simulation.getInstance().write("Tower says: " + p_flyable.getRef() + " registered to weather tower.\n");
		observers.add(p_flyable);
	}


	public void unregister(Flyable p_flyable) {
		toLand.add(p_flyable);
		Simulation.getInstance().write("Tower says: " + p_flyable.getRef() + " deregistered from weather tower.\n");
	}


	protected void conditionChanged() {
		for (Flyable flyable : observers) {
			flyable.updateConditions();
		}
		for (Flyable flyable : toLand) {
			observers.remove(flyable);
		}
		toLand.clear();
	}
}