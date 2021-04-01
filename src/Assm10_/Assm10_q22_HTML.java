package Assm10_;

public class Assm10_q22_HTML {

	public static void main(String[] args) {
//		Write a program, that will read HTML variable and output attribute value of id attribute (tag)
//		into the console. Input will be provided in a single line as outlined below. If HTML variable doesn't 
//		contain <html> attribute, print out into the console message: "Invalid input!".d method stub

		String str = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

		String id = "";
		int k = 0;
		int z = 0;

		if (str.contains("\"")) {

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '"') {
					k = i + 1;
					break;

				}
			}
			for (int i = k + 1; i < str.length(); i++) {
				if (str.charAt(i) == '"') {
					z = i;
					break;
				}
			}

			id = id + str.substring(k, z);
			System.out.println(id);
		} else {
			System.out.println("Invalid input");
		}
	}

}
