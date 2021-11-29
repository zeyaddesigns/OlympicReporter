//SUPERCLASS

abstract public class Competitor 
{
	//Instance variables
	private int id;
	private Name name;
	private String nation;
	private static final int ROUNDS = 3;
	private int [] scores;
	
	//Constructor
	public Competitor (int id, Name name, String nation)
	{
		this.id = id;
		this.name = name;
		this.nation = nation;
		// An array is created with every object in order to store scores
		scores = new int[ROUNDS];
	}
	
	//Methods
	public int getId() { return id; }
	public Name getName() { return name; }
	public String getNation() { return nation; }
	public abstract double getOverallScore();
	// Returns the competitors scores separated by space
	public String getScoresArray()
	{
		String results = "";
		for (int i = 0; i < scores.length; i++) { results += scores[i] + " "; }
		return results;
	} 
	public void addScore(int value, int run) { scores[run-1] = value; }
	public void setId(int id) { this.id = id; }
	public void setName(Name name) { this.name = name; }
	public void setNation(String nation) { this.nation = nation; }
	
	public String toString()
	{
		return id + ", " + name.getFullName() + ", " + nation;
	}
	
	// Returns the highest value in the scores array
		public int getMaxScore()
		{
			int max = scores[0];
			for (int i=1; i < scores.length; i++)
			{
				if (scores[i] > max) { max = scores[i]; }
			}
			return max;
		}
		
		// Returns the total average value of the three scores
		public double getAverageScore()
		{
			int total = 0;
			for (int i = 0; i < scores.length; i++) { total += scores[i]; }
			return (double) total/scores.length;
		}


}
