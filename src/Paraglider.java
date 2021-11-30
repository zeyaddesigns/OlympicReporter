
public class Paraglider extends Competitor
{
	//Instance variables
	private double maxSpeed;
	private double altitude;
	
	//Constructor
	public Paraglider(int id, Name name, String nation, String level, double maxSpeed, double altitude) 
	{
		super(id, name, nation, level);
		this.maxSpeed = maxSpeed;
		this.altitude = altitude;
	}
	
	//Methods
	public double getMaxSpeed() {return maxSpeed;}
	public double getAltitude() {return altitude;}
	public void setAltitude(double altitude) {this.altitude = altitude;}
	public void setFlyingSpeed(double maxSpeed) {this.maxSpeed = maxSpeed;}
	
	public double getOverallScore() 
	{
		int output = 0;
		if (maxSpeed >= 12 && maxSpeed <= 47)
		{
			for (int i = 0; i < getScoresArray().length; i++) {output += getScoresArray()[i];}
			return (double) output/getScoresArray().length * maxSpeed;
		}
		
		else
		{
			for (int i = 0; i < getScoresArray().length; i++) {output += getScoresArray()[i];}
			return (double) output/getScoresArray().length;
		}
	}
	
	//Overrides the original method to provide useful information for when the object is called
	public String toString()
	{
		return super.toString() + " Maximum Speed: " + maxSpeed + ", Altitude: " + altitude + ", Overall Score: " + getOverallScore() + ". \n";
	}
}
