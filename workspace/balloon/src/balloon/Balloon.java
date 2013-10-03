package balloon;

public class Balloon
{
	//The distance from the destination in meters
	private int position;
	//The altitude in meters
	private int altitude;
	//The radius in centimeters
	private int radius;
	//Color
	private String color;
	//balloon intact
	private boolean intact;
	
	/*
	 * Create a white balloon
	 */
	public Balloon()
	{
		position = 0;
		altitude = 0;
		radius = 0;
		color = "white";
		intact = true;
	}
	
	/*
	 * Create a balloon with a given color
	 */
	public Balloon(String balloonColor)
	{
		position = 0;
		altitude = 0;
		radius = 0;
		color = balloonColor;
		intact = true;
	}
	
	/*
	 * Sets the location
	 */
	public void setLocation(int pos, int alt)
	{
		position = pos;
		altitude = alt;
	}
	
	/*
	 * Move location
	 */
	public void moveLocation()
	{
		moveLocation(0, 0);
	}
	
	/*
	 * Move location
	 */
	public void moveLocation(int dist)
	{
		moveLocation(dist, 0);
	}
	
	/*
	 * Move location
	 */
	public void moveLocation(int dist, int climb)
	{
		position += dist;
		altitude += climb;
	}
	
	/*
	 * Returns the position
	 */
	public int getPosition()
	{
		return position;
	}
	
	/*
	 * Returns the altitude
	 */
	public int getAltitude()
	{
		return altitude;
	}
	
	/*
	 * Returns the diameter
	 */
	public int getDiameter()
	{
		return 2 * radius;
	}
	
	/*
	 * Returns the volume
	 */
	public double getVolume()
	{
		return 4.0 / 3.0  * Math.PI * radius * radius * radius;
	}
	
	/*
	 * Returns the color
	 */
	public String getColor()
	{
		return color;
	}
	
	/*
	 * Blows up the balloon by 5 centimeters
	 */
	public void blowup()
	{
		blowup(5);
	}
	
	/*
	 * Blows up the balloon by a given amount of centimeters
	 */
	public void blowup(int inc)
	{
		if(intact == true)
		{
			radius += inc;
		}
	}
	
	/*
	 * Explodes the balloon
	 */
	public void explode()
	{
		radius = 0;
		altitude = 0;
		intact = false;
	}
}