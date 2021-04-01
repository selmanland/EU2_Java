package day44_oop_practice.callcenter;

public class WhatsApp extends MessagingApp implements VideoCallable, VoiceCallable {

	@Override
	public void call(String contact) {		
		System.out.println("whatsapp - calling " + contact + "...");
	}

	@Override
	public void videoCall() {		
		System.out.println("Whatsapp - doing a video call Mr Mike...");
	}

	@Override
	public void sendMessage(String msg) {		
		System.out.println("whatsapp - sending a message - " + msg + "...");
	}	
	/*
	@Override
	public void accept() {
		
	}
	*/

}
