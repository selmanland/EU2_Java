package day35_encapsulation;

public class RoulettePocket {

	private int pocketNumber; 						// 1st we make PRIVATE to cut the access

	public RoulettePocket(int pocketNumber) { 		// for first initialization need this
		this.pocketNumber = pocketNumber; 			// constructor only invokes one time
	}

													// 2nd create public setter method to set the value
	public void setPocketNumber(int pocketNumber) { // to change and if enters wrong number to initialize again
		if (pocketNumber < 0 || pocketNumber > 36) { // we need this to change
			this.pocketNumber = 999;
		} else {
			this.pocketNumber = pocketNumber;
		}
	}

	public int getPocketNumber() { 					// 3rd to create getter method to retrieve the value
		return pocketNumber;
	}

	public String getPocketColor() {
		if (pocketNumber == 0) {
			return "green";
		} else if (pocketNumber > 0 && pocketNumber < 11) {
			if (pocketNumber % 2 == 0) {
				return "black";
			} else {
				return "red";
			}
		} else if (pocketNumber > 10 && pocketNumber < 19) {
			if (pocketNumber % 2 == 0) {
				return "red";
			} else {
				return "black";
			}
		} else if (pocketNumber > 18 && pocketNumber < 29) {
			if (pocketNumber % 2 == 0) {
				return "red";
			} else {
				return "black";
			}
		} else if (pocketNumber > 28 && pocketNumber < 37) {
			if (pocketNumber % 2 == 0) {
				return "red";
			} else {
				return "black";
			}
		} else {
			return "invalid";
		}
	}

}
