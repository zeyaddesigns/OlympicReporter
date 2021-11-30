//SUPERCLASS

abstract public class Competitor 
{
	//Instance variables
	private int id;
	private Name name;
	private String nation;
	private String level;
	private int [] scores;
	private static int RUNS = 3;
	
	//Constructor
	public Competitor (int id, Name name, String nation, String level)
	{
		this.id = id;
		this.name = name;
		this.nation = nation;
		this.level = level;
		scores = new int[RUNS];
	}
	
	//Methods
	public int getId() { return id; }
	public Name getName() { return name; }
	public String getNation() { return nation; }
	public String getLevel() { return level; }
	public void setId(int id) { this.id = id; }
	public void setName(Name name) { this.name = name; }
	public void setNation(String nation) { this.nation = nation; }
	
	//Adds a score for a particular run into the scores array
	public void addScore(int value, int run) { scores[run-1] = value; }
	
	// Returns the competitors scores separated by space
	public String getScores()
	{
		String results = "";
		for (int i = 0; i < scores.length; i++) { results += scores[i] + " "; }
		return results;
	} 
	
	public int [] getScoresArray()
	{
		return scores;
	} 
	
	//Declares a method shared by all subclasses 
	public abstract double getOverallScore();
	
	//Overrides the original method to provide useful information for when the object is called
	public String toString()
	{
		return id + ", " + name.getFullName() + ", " + nation + ", Level: " + level + ", Scores: " + getScores() + ",";
	}
}