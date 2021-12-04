import java.awt.Dimension;

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
	}
	
	//show Competitor GUIs
    public void showCompetitorGUI() 
    {
    	//create main GUI with competitorList object
    	CompetitorGUI g = new CompetitorGUI(list);
    	
    	g.setTitle("Competitor GUI");
		g.setDefaultCloseOperation(g.DO_NOTHING_ON_CLOSE);
		g.setPreferredSize(new Dimension(600,300));
		g.setLocationRelativeTo(null);
		//g.setResizable(false);
		
		//Setups for North, South and Centre
		g.setupNorthPanel();
		g.setupSouthPanel();
		g.setupCenterPanel();  
		
		g.setVisible(true);
	    g.pack();
		
    }
}
