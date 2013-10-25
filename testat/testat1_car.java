public class Slotcar {
	
	/* 
	 * Instanzvarianbelen
	 */
	private int maxSpeed;
	private int speed;
	
	/* 
	 * Konstruktor
	 */
	public Slotcar(int nexMaxSpeed) {
		speed = 0;
		maxSpeed = newMaxSpeed;
	}
	
	/* 
	 * Methoden
	 */
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newSpeed) {
		if (newSpeed <= maxSpeed) {
			if (newspeed >= 0) {
				speed = newSpeed;
			}
			else {
				speed = 0;
			}
		}
		else {
			speed = maxSpeed;
		}
	}
	
	public void increaseSpeed(int increment) {
		setSpeed(speed + increment);
	}
	
	public void increaseSpeed() {
		increaseSpeed(1);
	}
	
	public void decreaseSpeed(int decrement) {
		setSpeed(speed - decrement);
	}
	
	public void decreaseSpeed() {
		decreaseSpeed(1);
	}
	
	public void stop() {
		setSpeed(0);
	}
}