
public class Paraglider extends Competitor
{
	//Instance variables
	private double flyingSpeed;
	private double altitude;
	
	//Constructor
	public Paraglider(int id, Name name, String nation, String level, double flyingSpeed, double altitude) 
	{
		super(id, name, nation, level);
		this.flyingSpeed = flyingSpeed;
		this.altitude = altitude;
	}
	
	//Methods
	public double getFlyingSpeed() {return flyingSpeed;}
	public double getAltitude() {return altitude;}
	public void setAltitude(double altitude) {this.altitude = altitude;}
	public void setFlyingSpeed(double flyingSpeed) {this.flyingSpeed = flyingSpeed;}
	
	public double getOverallScore() 
	{
		// calculation that takes into account
		// near misses and run time to generate
		// an overall score.
		return 0;
	}
	
}
