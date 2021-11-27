/**
* F21SF Assignment 1
* This class holds all the data specific to each competitor and provides
* methods for calculating statistics and displaying necessary information
* @author zeyad
*/

public class Skateboarder 
{
	// Instance variables
	private int Id;
	private String name;
	private String [] experience;
	private String nation;
	// Defines a run (a turn/round of play) and initialises it to a constant
	private static final int RUNS = 3;
	private int [] scores;
	
	 
	// Constructor
	public Skateboarder(int Id, String name, String nation, String [] experience)
	{
		this.Id = Id;
		this.name = name;
		this.experience = experience;
		this.nation = nation ;
		// An array is created with every object in order to store scores
		scores = new int[RUNS];
	}	 
	
	//Methods to get values for instance variables within this class
	public int getId()         { return Id;     }
	public String getName()    { return name;   }
	public String getNation()  { return nation; }
	
	//Methods to set values for instance variables within this class
	public void setId(int competitorNumber)               { this.Id = competitorNumber;   }
	public void setName(String name)                      { this.name = name;             }
	public void setExperience(String [] experience)       { this.experience = experience; }
	public void setNation(String nation)                  { this.nation = nation;         }
	public void setScores(int[] scores)                   { this.scores = scores;         }
	
	// Sets a score at any given run
	public void addScore(int value, int run) { scores[run-1] = value; }
	
	// Returns the competitors credentials separated by a comma
	public String getExperience() { return experience[0] + ", " + experience[1]; }
	
	// Gets the overall score depending on the competitors credentials
	public double getOverallScore()
	{
		int result = 0;
		// Calculates more points if the competitor is Expert/Competent and Finalist
		if (experience[0]=="Competent" && experience[1]=="Finalist")
		{
			for (int i = 0; i < scores.length; i++) { result += scores[i];}
			return (double) (result*1.5)/scores.length;
		}
		else if (experience[0]=="Expert" && experience[1]=="Finalist")
		{
			for (int i = 0; i < scores.length; i++) { result += scores[i];}
			return (double) (result*2)/scores.length;
		}
		else
		{
			for (int i = 0; i < scores.length; i++) { result += scores[i];}
			return (double) result/scores.length;
		}
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

	// Returns whether or not a qualification is found within an array
	public boolean hasExperience(String exp) 
	{
		int i = 0;
		boolean found = false;
		while (i < experience.length && !found) 
		{
			if (experience[i].equals(exp) ) { found = true; }
    		i++;
    	}
    	return found;
	}		
	
	// Returns the competitors scores separated by space
	public String getScoresArray()
	{
		String results = "";
		for (int i = 0; i < scores.length; i++) { results += scores[i] + " "; }
		return results;
	} 
	
	// Returns all the information held for the competitor in a string
	public String getFullDetails()
	{
		String s = "";
		for (int i = 0; i < scores.length; i++) { s += scores[i] + " "; }
		String result = "Competitor number " + Id + " is " + name + ". He is from " + nation + ".\nHis experience credentials are: " + getExperience() + " and he scored " + s +"\nHis overall score is " + getOverallScore() + ".";
		return result;
	}
	
	// Gets the initials of the competitor's full name, including whether or not there is a middle name
	public String getFullInitials()
	{
		// Finds the first name and sets its initial
		int spacePos1 = name.indexOf(" ");
		String firstName = name.substring(0, spacePos1);
		String firstInitial = String.valueOf(firstName.charAt(0));
		
		// Finds the last name and sets its initial
		int spacePos2 = name.lastIndexOf(" ");
		String lastName = name.substring(spacePos2 + 1);
		String lastInitial = String.valueOf(lastName.charAt(0));
		
		// Initialises the output variable
		String result = firstInitial;
		
		// Checks if middle name exists, if so gets its initial and adds it to output
		String middleName;
		if (spacePos1==spacePos2)
		{
			middleName = "";
			result += lastInitial;
		}
		else
		{
			middleName = name.substring(spacePos1+1, spacePos2);
			String middleInitial = String.valueOf(middleName.charAt(0));
			result += middleInitial;
			result += lastInitial;
		}
		
		return result;
	}
	
	// Gets quick information for the competitor, uses the full initials and the overall score
	public String getShortDetails()
	{
		return "CN " + Id + " (" + getFullInitials() + ") has overall score " + getOverallScore() + ".";
	}
}
