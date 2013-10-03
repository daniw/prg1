package balloon;

import balloon.Balloon;

public class Main
{
	public static void main(String[] args)
	{
		Balloon b1 = new Balloon("red");
		System.out.println("Position: " + b1.getPosition());
		System.out.println("Volume: " + b1.getVolume());
		b1.blowup();
		System.out.println("Volume: " + b1.getVolume());
		System.out.println("Location: " + b1.getPosition() + " Altitude: " + b1.getAltitude());
		b1.moveLocation();
		System.out.println("Location: " + b1.getPosition() + " Altitude: " + b1.getAltitude());
		b1.moveLocation(10);
		System.out.println("Location: " + b1.getPosition() + " Altitude: " + b1.getAltitude());
		b1.moveLocation(10, 5);
		System.out.println("Location: " + b1.getPosition() + " Altitude: " + b1.getAltitude());
		b1.explode();
		System.out.println("Volume: " + b1.getVolume());
	}
}
