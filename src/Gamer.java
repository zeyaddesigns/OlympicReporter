
public class Gamer extends Competitor
{
	//Instance variables
	private String teamName;
	
	//Constructor
	public Gamer (int id, Name name, String nation, String teamName, int prizeMoney)
	{
		super(id,name,nation);
		this.teamName = teamName;
	}
	
	//Methods
	public String getTeamName() { return teamName; }
	public void setTeamName(String teamName) { this.teamName = teamName; }	
	
	public String toString()
	{
		return super.toString() + ", Team Name: " + teamName + ". \n";
	}
	
	public boolean equals(Object other)
	{
    	if (!(other instanceof Gamer) )
    		return false;
    	Gamer g = (Gamer) other;
    	return (this.getId() == (g.getId()));
    }
	
	public double getOverallScore()
	{
		//code
		return 0;
	}
}
