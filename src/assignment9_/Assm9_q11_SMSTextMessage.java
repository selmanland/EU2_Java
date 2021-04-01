package assignment9_;

public class Assm9_q11_SMSTextMessage {

	public static void main(String[] args) {
//		By using String methods: retrieve related information from SMS message string
//		and assign it to those 3 variables and print each variable in a separate line
		
		String messageBody = "Sender:<Mike Smith>.From Number:[202-123-3456].Message:{I love programming and problem solving}";
		
		String sender;
		String phoneNo;
		String message;
		
		sender = messageBody.substring(messageBody.indexOf("<")+1, messageBody.indexOf(">"));
		//System.out.println(sender);
		phoneNo = messageBody.substring(messageBody.indexOf("[")+1, messageBody.indexOf("]"));
		//System.out.println(phoneNo);
		message = messageBody.substring(messageBody.indexOf("{")+1, messageBody.indexOf("}"));
		
		System.out.println("Sender: " + sender);
		System.out.println("Phone Number: " + phoneNo);
		System.out.println("Message body: " + message);

	}

}
