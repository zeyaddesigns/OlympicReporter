

public class Skateboarder extends Competitor
{
	// Instance variables
	private String [] experience;
	
	// Constructor
	public Skateboarder(int id, Name name, String nation, String [] experience)
	{
		super(id,name,nation);
		this.experience = experience;
	}	 
	
	//Methods to set values for instance variables within this class
	public void setExperience(String [] experience) { this.experience = experience; }
	
	// Returns the competitors credentials separated by a comma
	public String getExperience() { return experience[0] + ", " + experience[1]; }
	
	public double getOverallScore()
	{
		//code
		return 0;
	}
}
