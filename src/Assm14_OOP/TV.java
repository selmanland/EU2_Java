package Assm14_OOP;

public class TV {

	/*
	 * Write a custom class TV that has 4 instance variables: int channel=1, int
	 * volumeLevel=1, boolean on = false, String brand = "undefined". Create one
	 * "no arguments" constructor that prints message:
	 * "Creating TV object using no Args- constructor". Also, create one more
	 * constructor that defines the instance variable brand, and displays the
	 * message: "Creating TV object using 1 arg - constructor". Generate
	 * getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel
	 * (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
	 * Declare methods channelUp() to increase variable channel by one, and
	 * channelDown() to decrease variable channel by one. Declare methods volumeUp()
	 * to increase variable volume by one, and volumeDown() to decrease variable
	 * volume by one. Create isOn(), turnOn() and turnOff() methods for "on"
	 * instance variable. If the tv is already on, no need to turn it on again,
	 * display the message: "TV is already ON". If the tv is already off, then no
	 * need to turn it off again, display the message: "TV is already OFF". The
	 * value of a variable channel cannot be negative or zero, and cannot be higher
	 * than 120. If the user will try to set an invalid channel, display the
	 * message: "ERROR: TV is either OFF or invalid Channel". Volume can be only in
	 * the range between 1 and 7. You may change volume only if TV is on. Otherwise,
	 * display the message: "ERROR: TV is either OFF or invalid Volume level".
	 * Create isOn() method that will check tv status.
	 */

	private int channel = 1;
	private int volumeLevel = 1;
	boolean on = false;
	private String brand = "undefined";

	public TV() {
		System.out.println("Creating TV object using no Args-constructor");
	}

	public TV(String brand) {
//		super();
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg-constructor");
	}

	public int getChannel() {
		return channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public String getBrand() {
		return brand;
	}

	public void setChannel(int channel) {
		if (channel < 1 || channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else {
			this.channel = channel;
			System.out.println("Channel " + getChannel());
		}
	}

	public void setVolumeLevel(int volumeLevel) {
		if (on == true && volumeLevel >= 1 && volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
			System.out.println("Volume is " + volumeLevel);
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void channelUp() {
		setChannel(channel + 1); // check me
		System.out.println("Channel " + getChannel());
	}

	public void channelDown() {
		setChannel(channel - 1);
//		channel--;	//check me
		System.out.println("Channel " + getChannel());
	}

	public void volumeUp() {
		if (on == true) {
			setVolumeLevel(this.volumeLevel + 1);
			System.out.println("Volume is " + (this.volumeLevel + 1));
		}
	}

	public void volumeDown() {
		if (on == true) {

			setVolumeLevel(volumeLevel - 1);
			System.out.println("Volume is " + (volumeLevel));

		} else {
			System.out.println("TV is already OFF");
		}
	}

	public void isOn() {
		if (on == true) {
			System.out.println("TV is already ON");
		} else {
			System.out.println("TV is already OFF");
		}
	}

	public boolean turnOn() { // check later void
		if (on == false) {
			on = true;
			System.out.println("TV is ON");
		} else {
			System.out.println("TV is already ON");

		}
		return on;
	}

	public boolean turnOff() {

		if (on == false) {
			System.out.println("TV is already OFF");
		} else {
			System.out.println("TV is OFF");
			System.out.println("Good Bye :)");
			setChannel(1);
			setVolumeLevel(1);
			on = false;

		}
		return on;

	}

	public static void main(String[] args) {

		TV lgLed = new TV("LG");

		lgLed.isOn();
		lgLed.turnOn();
		lgLed.isOn();
		lgLed.setChannel(120);
		System.out.println(lgLed.getChannel());
		lgLed.channelUp();
		lgLed.setVolumeLevel(3);
		lgLed.volumeDown();
		lgLed.turnOff();
		lgLed.isOn();
		lgLed.setVolumeLevel(5);
		lgLed.turnOn();
		System.out.println(lgLed.getVolumeLevel());

	}

}
