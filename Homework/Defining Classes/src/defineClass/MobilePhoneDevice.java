package defineClass;
import defineClass.MobilePhoneDevice;

public class MobilePhoneDevice {
  //Problem 1. Define class
    //Define a class that holds information about a mobile phone device: model, manufacturer, price, owner, battery characteristics (model, hours idle and hours talk) and display characteristics (size and number of colors).
    //Define 3 separate classes (class GSM holding instances of the classes Battery and Display).

	private String model;
	private String manufacturer;
	private String price;
	private String owner;
	private String battery;
	private String characteristics;
	private String display;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	
	public MobilePhoneDevice(String manufacturer,String model,String price,String owner,String battery,String characteristics, String display){
		setManufacturer(manufacturer);
		setModel(model);
		setPrice(price);
		setOwner(owner);
		setBattery(battery);
		setCharacteristics(characteristics);
		setDisplay(display);
	};
	
	public MobilePhoneDevice(String manufacturer,String model) {
		setManufacturer(manufacturer);
		setModel(model);
	};
	
	@Override
	public String toString(){
		String result =getManufacturer() +" "+ getModel();
		return result;
	}
}
