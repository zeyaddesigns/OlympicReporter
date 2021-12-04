import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompetitorList
{
	// Instance variables
	private ArrayList<Competitor> competitorList;
		
	// Constructor
	public CompetitorList()
	{
		competitorList = new ArrayList<Competitor> ();
	}
	
	//Methods
	
	//Adds a single competitor to the array list after checking if the id already exists
	public boolean addCompetitor(Competitor c)
	{
		// Checks if the id exists
		int id = c.getId();
		Competitor inList = this.findById(id);
		
		// Adds competitor if id found no match
		if (inList == null)
		{
			competitorList.add(c);
			return true;
		}
		return false;
	}
	
	//Goes through the competitor list and checks if the id exists
	public Competitor findById(int id)
    {
    	for (Competitor c : competitorList)
    	{
    		// Checks if ids match
    		if (c.getId() == id)
    		{ return c; }
    	}
    	return null;
    }
	
	//Lists all the data relevant to each competitor in table format
	public String getTableofCompetitors()
	{
		String report = "ID     Name                Nation          Level            Scores          Overall\n";
		// Loops through the competitor list and adds each variable to the output
		for (Competitor c : competitorList)
		{
			report += String.format("%-7d", c.getId());
			report += String.format("%-20s", c.getName().getFullName());
			report += String.format("%-16s", c.getNation());
			report += String.format("%-16s", c.getLevel());
			report += String.format("%-17s", c.getScores());
			report += c.getOverallScore();
			report += "\n";
		}
		//Add below once getHighestScorer() is created
		//report += "\n\n\n";
		//report += "The competitor with the highest overall score is \n";
		return report;
	}
	
	public String getCompetitors()
	{
		String report = "";
		for (Competitor c : competitorList)
		{
			report += c;
		}
		return report;
	}
	
	public String getClimbers()
	{
		String report = "";
		for (Competitor c : competitorList)
		{
			if (c instanceof Climber) 
			{
				report += c;	
			}
		}
		return report;
	}
	
	public String getParagliders()
	{
		String report = "";
		for (Competitor c : competitorList)
		{
			if (c instanceof Paraglider) 
			{
				report += c;	
			}
		}
		return report;
	}
	
	public String getSkateboarders()
	{
		String report = "";
		for (Competitor c : competitorList)
		{
			if (c instanceof Skateboarder) 
			{
				report += c;	
			}
		}
		return report;
	}
	
	//Produces a file containing specified data
	public void writeToFile(String filename, String report)
	{
		FileWriter fw;
		try 
		{ 
			fw = new FileWriter(filename); 
			// Header text to appear before the report
			fw.write("List of all competitors: \n");
			fw.write(report);
			fw.close();
		} 
		catch (FileNotFoundException fnf)
		{
			System.out.println("ERROR: File not found.");
			System.exit(0);
		}
		catch (IOException e) 
		{	
			e.printStackTrace(); 
			System.exit(1);
		}
	}
	
	//Reads each line from an input file within the project directory
	public void readFromFile(String filename) 
	{
		try {
			if (filename.equals("ClimberInput.csv"))
			{
				File f = new File(filename);
				Scanner scanner = new Scanner(f);
				while (scanner.hasNextLine()) 
				{
					// Reads first line and process it
					String inputLine = scanner.nextLine(); 
					if (inputLine.length() != 0) 
					{ processLineA(inputLine); }
				}
			}
			else if (filename.equals("ParagliderInput.csv"))
			{
				File f = new File(filename);
				Scanner scanner = new Scanner(f);
				while (scanner.hasNextLine()) 
				{
					// Reads first line and process it
					String inputLine = scanner.nextLine(); 
					if (inputLine.length() != 0) 
					{ processLineB(inputLine); }
				}
			}
			else if (filename.equals("SkateboarderInput.csv"))
			{
				File f = new File(filename);
				Scanner scanner = new Scanner(f);
				while (scanner.hasNextLine()) 
				{
					// Reads first line and process it
					String inputLine = scanner.nextLine(); 
					if (inputLine.length() != 0) 
					{ processLineC(inputLine); }
				}
			}
		} 
		catch (FileNotFoundException fnf)
		{
			 System.out.println( filename + " not found ");
			 System.exit(0);       
		 }
		catch (IOException e) 
		{	
			e.printStackTrace(); 
			System.exit(1);
		}
	}
	
	//Line processor for ClimberInput.csv
	//Goes through each line, separates data and allocates variables in order to construct objects
	public void processLineA(String line)
	{
		
		String idNum, nearMis = "";
		
		// Separates strings between every comma
		String parts [] = line.split(",");
		
		// Removes spaces from the String and convert it to int
		idNum = parts[0];
		idNum = idNum.trim();
		int id = Integer.parseInt(idNum);
		
		String name = parts[1];
		String nation = parts[2];
		String level = parts[3];
		
		nearMis = parts[4];
		nearMis = nearMis.trim();
		int nearMisses = Integer.parseInt(nearMis);
		
		String runTime = parts[5];
		
		// Creates a new Climber object
		Climber c = new Climber (id, new Name (name), nation, level, nearMisses, runTime);
		
		// Adds newly created object to the array list
		this.addCompetitor(c);
		// Sets scores for the object
		c.addScore(Integer.valueOf(parts[6]), 1);
		c.addScore(Integer.valueOf(parts[7]), 2);
		c.addScore(Integer.valueOf(parts[8]), 3);
	}
	
	//Line processor for ParagliderInput.csv
	//Goes through each line, separates data and allocates variables in order to construct objects
	public void processLineB(String line)
	{
		String idNum, maxSp, alt = "";
		
		// Separates strings between every comma
		String parts [] = line.split(",");
		
		// Removes spaces from the String and convert it to int
		idNum = parts[0];
		idNum = idNum.trim();
		int id = Integer.parseInt(idNum);
		
		String name = parts[1];
		String nation = parts[2];
		String level = parts[3];
		
		maxSp = parts[4];
		maxSp = maxSp.trim();
		int maxSpeed = Integer.parseInt(maxSp);
		
		alt = parts[5];
		alt = alt.trim();
		int altitude = Integer.parseInt(alt);
		
		// Creates a new Paraglider object
		Paraglider c = new Paraglider (id, new Name (name), nation, level, maxSpeed, altitude);
		
		// Adds newly created object to the array list
		this.addCompetitor(c);
		// Sets scores for the object
		c.addScore(Integer.valueOf(parts[6]), 1);
		c.addScore(Integer.valueOf(parts[7]), 2);
		c.addScore(Integer.valueOf(parts[8]), 3);
	}

	//Line processor for SkateboarderInput.csv
	//Goes through each line, separates data and allocates variables in order to construct objects
	public void processLineC(String line)
	{
		String idNum, numTricks = "";
		
		// Separates strings between every comma
		String parts [] = line.split(",");
		
		// Removes spaces from the String and convert it to int
		idNum = parts[0];
		idNum = idNum.trim();
		int id = Integer.parseInt(idNum);
		
		String name = parts[1];
		String nation = parts[2];
		String level = parts[3];
		
		numTricks = parts[4];
		numTricks = numTricks.trim();
		int numOfTricks = Integer.parseInt(numTricks);
		
		// Creates a new Skateboarder object
		Skateboarder c = new Skateboarder (id, new Name (name), nation, level, numOfTricks);
		
		// Adds newly created object to the array list
		this.addCompetitor(c);
		// Sets scores for the object
		c.addScore(Integer.valueOf(parts[5]), 1);
		c.addScore(Integer.valueOf(parts[6]), 2);
		c.addScore(Integer.valueOf(parts[7]), 3);
	}
}