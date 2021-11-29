// F21SF Assignment 2
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CompetitorList 
{
	// Instance variables
	private ArrayList<Competitor> competitorList;
	
	// Constructor
	public CompetitorList()
	{
		competitorList = new ArrayList<Competitor> ();
	}
	
	public void populate() 
	{
		Gamer g1 = new Gamer (201, new Name ("Tony Jonson"), "Austrailia", "The Nintendo Dreamers", 25000);
		competitorList.add(g1);
		Gamer g2 = new Gamer (202, new Name ("Katy Stewart"), "Austrailia", "The Nintendo Dreamers", 5600);
		competitorList.add(g2);
		Gamer g3 = new Gamer (203, new Name ("Marshall Timple"), "United States", "The Loan Gamer", 50000);
		competitorList.add(g3);
		Hacker h1 = new Hacker (301, new Name ("Matrin Arthur"), "South Africa", "BEng, MSc", 32, 2894);
		competitorList.add(h1);
		Hacker h2 = new Hacker (302, new Name ("Robert Hutchkins"), "Germany", "BEng, PGCert", 25, 7451);
		competitorList.add(h2);
	}
	
	public String listAllNames()
	{
		String list = "ALL COMPETITORS\n";
		for (Competitor c : competitorList)
		{
			String fullName = c.getName().getFullName();
			list += fullName + "\n";
		}
		list += "\n";
		return list;
	}
	
	public String listAllGamers()
	{
		String list = "ALL GAMERS\n";
		for (Competitor c : competitorList)
		{
			if (c instanceof Gamer)
			{
				String fullName = c.getName().getFullName();
				list += fullName + "\n";
			}
		}
		list += "\n";
		return list;
	}
	
	public String listAllHackers()
	{
		String list = "ALL HACKERS\n";
		for (Competitor c : competitorList)
		{
			if (c instanceof Hacker)
			{
				String fullName = c.getName().getFullName();
				list += fullName + "\n";
			}
		}
		list += "\n";
		return list;
	}
	
	public String listDetails()
	{
		String list = "ALL COMPETITOR DETAILS\n\n";
		for (Competitor c : competitorList)
		{	
			list += c.toString() + "\n";	
		}
		return list;
	}
	
	
	
}
