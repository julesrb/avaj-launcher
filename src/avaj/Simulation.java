package avaj;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Simulation {
	private static AircraftFactory aircraftFactory;
	private static WeatherTower weatherTower;
	private static Simulation instance;
	private static Scenario scenario;

	public static FileWriter writer;


	public static Simulation getInstance() {
		if (instance == null)
			instance = new Simulation();
		return instance;
	}


	private Simulation() {
		this.aircraftFactory = AircraftFactory.getInstance();
		this.weatherTower = new WeatherTower();
		File file = new File("simulation.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
			writer = new FileWriter(file);
		} catch(Exception e) {
			System.out.println("File creation failed: " + e.getMessage());
		}
	}


	public void run(String arg) {
		try {
			this.scenario = new Scenario(arg);
			this.scenario.parse(this.weatherTower);
		} catch (Exception e) {
			System.out.println("Scenario failed: " + e.getMessage());
			return;
		}
		for (int i = 0; i < scenario.cycles; i++)
			weatherTower.changeWeather();
		try {
			writer.close();
		} catch(Exception e) {
			System.out.println("Closing file failed: " + e.getMessage());
		}
		System.out.println("Simulation finished, check the file Simulation.txt");
	}


	public void write(String s) {
		try {
			writer.write(s);
		} catch(Exception e) {
			System.out.println("error writting to the file!");
		}
	}
}