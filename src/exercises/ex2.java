package exercises;

public class ex2 {

	public static void main(String[] args) {
		
		int inputSeconds, hours, minutes, seconds;
        inputSeconds = 13695;
        hours = inputSeconds / (60 * 60);
        minutes = hours % 60;
        seconds = inputSeconds % 60;
        System.out.println("inputSecond is " + inputSeconds);
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	}
	

}
