package day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		AppleDevice mac = new Mac();
		mac.use();
		//mac.code();
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code();
		
		AppleDevice watch = new AppleWatch();
		watch.use();

	}

}
