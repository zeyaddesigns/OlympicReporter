
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
	
	// Checks if skateboarder is Beginner/Intermediate/Expert and calculates
	// an overall score accordingly based on their total number of tricks
	public String getOverallScore() 
	{
		int output = 0;
		if (getLevel()=="Beginner")
		{
			for (int i = 0; i < getScoresArray().length; i++) {output += getScoresArray()[i];}
			double result = ((output * 1.0)/getScoresArray().length) * numOfTricks;
			return String.format("%.2f", result);
		}
		else if (getLevel()=="Intermediate")
		{
			for (int i = 0; i < getScoresArray().length; i++) {output += getScoresArray()[i];}
			double result = ((output * 1.25)/getScoresArray().length) * numOfTricks;
			return String.format("%.2f", result);
		}
		else
		{
			for (int i = 0; i < getScoresArray().length; i++) {output += getScoresArray()[i];}
			double result = ((output * 1.50)/getScoresArray().length) * numOfTricks;
			return String.format("%.2f", result);
		}
	}
	
	//Overrides the original method to provide useful information for when the object is called
	public String toString()
	{
		return super.toString() + " Number of tricks: " + numOfTricks + ", Overall Score: " + getOverallScore() + ". \n";
	}
}
