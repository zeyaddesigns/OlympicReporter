
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
		int output = 0;
		for (int i = 0; i < getScoresArray().length; i++) {output += getScoresArray()[i];}
		return (double) (output/getScoresArray().length) - nearMisses;
	}
	
	//Overrides the original method to provide useful information for when the object is called
	public String toString()
	{
		return super.toString() + " Near Misses: " + nearMisses + ", Climb time: " + runTime + ", Overall Score: " + getOverallScore() + ". \n";
	}
}
