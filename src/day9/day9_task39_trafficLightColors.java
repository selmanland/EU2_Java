package day9;

public class day9_task39_trafficLightColors {

	public static void main(String[] args) {
		
		String color="g"; // Might be char 'g' as well...Actually char 'g' is better...
		
		switch (color) {
		
		case "R":
		case "r":
			System.out.println("Red Light");
			break;
			
		case "O": case "o":
			System.out.println("Orange Light");
			break;
			
		case "G": case "g":
			System.out.println("Green Light");
			break;
		
			default:
				System.out.println("Invalid Entry");
		}
		
		/*if (color=="R" | color=="r") {
			System.out.println("Red Light");
			
		}else if(color=="O" | color=="o") {
			System.out.println("Orange Light");
		}else if(color=="G" | color=="g") {
			System.out.println("Green Light");
		}else {
			System.out.println("invalid entry");*/
		}

	}


