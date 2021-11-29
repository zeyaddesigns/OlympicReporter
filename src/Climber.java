
public class Climber extends Competitor
{
	//Instance variables
	private int nearMisses;
	private String runTime;
	
	//Constructor
	public Climber (int id, Name name, String nation, String level, int misses, String time)
	{
		super(id, name, nation, level);
		nearMisses = misses;
		runTime = time;
	}
	
	//Methods
	public int getNearMisses() {return nearMisses;}
	public String getRunTime() {return runTime;}
	public void setNearMisses(int nearMisses) {this.nearMisses = nearMisses;}
	public void setRunTime(String runTime) {this.runTime = runTime;}
	
	public double getOverallScore() 
	{
		// calculation that takes into account
		// near misses and run time to generate
		// an overall score.
		return 0;
	}
	
	
}
