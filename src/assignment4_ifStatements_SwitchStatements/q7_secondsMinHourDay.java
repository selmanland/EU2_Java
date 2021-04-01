package assignment4_ifStatements_SwitchStatements;

public class q7_secondsMinHourDay {

	public static void main(String[] args) {
		// minute=60 seconds	hour=3600 seconds	day=86400 seconds

		int inputSeconds, days, hours, minutes, seconds, remain;
		inputSeconds=128969;
		
		if(inputSeconds<60) {
			System.out.println(inputSeconds + " seconds equals " + inputSeconds + " seconds");
		}else if(inputSeconds<3600) {
			minutes=inputSeconds/60;
			remain=inputSeconds%60;
			System.out.println(inputSeconds + " seconds equals " + minutes + " minutes and " + remain + " seconds");
		}else if(inputSeconds<86400) {
			hours=inputSeconds / (60*60);
			remain=inputSeconds % (60*60);
			minutes=remain / 60;
			remain=remain % (60);
			System.out.println(inputSeconds + " seconds equals " + hours + " hours and " + minutes + " minutes and " + remain + " seconds");
		}else if(inputSeconds>=86400) {
			days=inputSeconds / (24*60*60);
			remain=inputSeconds % (24*60*60);
			hours=remain / (60*60);
			remain=remain % (60*60);
			minutes=remain / 60;
			remain=remain % 60;
			System.out.println(inputSeconds + " seconds equals " + days + " days and " + hours + " hours and " + minutes + " minutes and " + remain + " seconds");
		}
				
	}

}
