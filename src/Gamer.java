

public class Gamer extends Competitor
{
	//Instance variables
	private String teamName;
	private int prizeMoney;
	
	//Constructor
	public Gamer (int id, Name name, String nation, String teamName, int prizeMoney)
	{
		super(id,name,nation);
		this.teamName = teamName;
		this.prizeMoney = prizeMoney;
	}
	
	//Methods
	public String getTeamName() { return teamName; }
	public int getPrizeMoney() { return prizeMoney; }
	public void setPrizeMoney(int prizeMoney) {this.prizeMoney = prizeMoney; }
	public void setTeamName(String teamName) { this.teamName = teamName; }	
}
