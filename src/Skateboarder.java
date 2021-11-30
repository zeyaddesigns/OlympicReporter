
public class Skateboarder extends Competitor
{
	//Instance variables
	private int numOfTricks;
	
	
	//Constructor
	public Skateboarder(int id, Name name, String nation, String level, int tricks)
	{
		super(id, name, nation, level);
		numOfTricks = tricks;
	}
	
	//Methods
	public int getNumOfTricks() {return numOfTricks;}
	public void setNumOfTricks(int numOfTricks) {this.numOfTricks = numOfTricks;}
	
	public double getOverallScore() 
	{
		// calculation that takes into account
		// near misses and run time to generate
		// an overall score.
		return 0;
	}
}
