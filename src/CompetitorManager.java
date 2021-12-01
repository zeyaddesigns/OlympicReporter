
public class CompetitorManager 
{
	// Instance variables
	private CompetitorList list;
		
	// Constructor
	public CompetitorManager()
	{
		list = new CompetitorList();
	}
	
	// Method to carry out all the intended operations of this programme
	public void run()
	{
		// Reads data from a specified input file
		list.readFromFile("ClimberInput.csv");
		list.readFromFile("ParagliderInput.csv");
		list.readFromFile("SkateboarderInput.csv"); 
				
		// Outputs the data into a specified file
		list.writeToFile("output.txt", list.getTableofCompetitors());
				
		// Prints out the data in table form via console
		System.out.println(list.getTableofCompetitors());
		System.out.println();
	}
}
