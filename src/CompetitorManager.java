
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
		//System.out.println(list.getTableofCompetitors());
		//System.out.println();
	}
	
	//show GUIs
    public void showGUI() 
    {
    	//create main GUI with competitorList object
    	CompetitorGUI g = new CompetitorGUI(list);
    	
    	g.setTitle("CompetitorList");
		g.setDefaultCloseOperation(g.DO_NOTHING_ON_CLOSE);
		g.setSize(500, 800);
		
		
		//Setups for North, South and Centre
		g.setupNorthPanel();
		g.setupSouthPanel();
		g.setupCenterPanel();
		
		
        g.setVisible(true);
        g.pack();
    }
}
