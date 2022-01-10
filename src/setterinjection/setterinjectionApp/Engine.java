package setterinjection.setterinjectionApp;
public class Engine {
	private int engineNumber;
	private int horsePower;
	private String type;
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", horsePower=" + horsePower + ", type=" + type + "]";
	}
	
}
