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
		
		showCompetitorGUI();
		showEditorGUI();
	}
	
	//show Competitor GUIs
    public void showCompetitorGUI() 
    {
    	//create main GUI with competitorList object
    	CompetitorGUI g = new CompetitorGUI(list);
    	
    	g.setTitle("Competitor GUI");
		g.setDefaultCloseOperation(g.DO_NOTHING_ON_CLOSE);
		g.setPreferredSize(new Dimension(600,300));
		g.setLocation(200,200);
		
		//Setups for North, South and Centre
		g.setupNorthPanel();
		g.setupSouthPanel();
		g.setupCenterPanel(); 
		
		g.setVisible(true);
	    g.pack();
		
    }
    
    public void showEditorGUI()
    {
    	EditorGUI e = new EditorGUI(list);
    	e.setTitle("Editor GUI");
		e.setDefaultCloseOperation(e.DO_NOTHING_ON_CLOSE);
		
		e.setupNorthPanel();
		e.setupCenterPanel(); 
		e.setupSouthPanel();
		e.setLocation(800,200);
		e.setVisible(true);
	    e.pack();
    	
    }
}
