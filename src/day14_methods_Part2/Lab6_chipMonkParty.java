package day14_methods_Part2;

public class Lab6_chipMonkParty {

	public static void main(String[] args) {

		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);

	}

	public static void cigarParty(int numCigar, boolean weekend) {
		if (weekend == false) {
			if (numCigar < 40 || numCigar > 60) {
				System.out.println(false);
			} else if (numCigar >= 40 && numCigar <= 60) {
				System.out.println(true);
			}
		} else {
			if (numCigar < 40) {
				System.out.println(false);
			} else {
				System.out.println(true);
			}
		}

	}

}
