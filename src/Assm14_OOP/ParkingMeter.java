package Assm14_OOP;

public class ParkingMeter {
	
	int timeLeft = 0;
	int maxTime;
	
	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	public boolean add(int parameter) {
		if(parameter==25 && timeLeft+30 <= maxTime) {
			timeLeft+=30;		// Furthermore, the increase occurs only if the value of timeLeft...
			System.out.println("Time left is " + timeLeft);
			return true;		// ...will not exceed the value of maxTime ???

		} return false;
	}
	public void tick() {
		if(timeLeft>0) {
			timeLeft--;
			System.out.println("TimeLeft is " + timeLeft);
		}
	}
	public boolean isExpired() {
		if(timeLeft==0) {
			return true;
		}else {
			System.out.println("Your time is " + timeLeft);
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		ParkingMeter pm = new ParkingMeter(100);
		pm.add(25);
		pm.tick();
		pm.add(25);
		pm.tick();
		pm.isExpired();
		pm.tick();
		pm.tick();
		pm.tick();
		pm.tick();
		pm.tick();		
		System.out.println(pm.timeLeft);
		
		
	}

}
