package setterinjection.setterinjectionApp;

import java.util.List;

public class Bmw implements ICar{
	private String color;
	private String model;
	private Engine engine;
	private List<String> wheels;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<String> getWheels() {
		return wheels;
	}
	public void setWheels(List<String> wheels) {
		this.wheels = wheels;
	}
	@Override
	public void drive() {
		System.out.println("car color: "+getColor());
		System.out.println("car model: "+getModel());
		System.out.println("car engine info "+getEngine());
		System.out.println("car wheels info "+getWheels());
		System.out.println("Driver can drive the car bmw");
	}
}
