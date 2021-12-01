//import all the GUI classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CompetitorGUI extends JFrame  implements ActionListener
{
	// The competitor list to be searched.
    private CompetitorList competitorList;
    
    //GUI components
    JButton search;
    
    
    //Create the frame with its panels.
    public CompetitorGUI(CompetitorList list)
    {
        this.competitorList = list;
        
        //set up window title
        setTitle("CompetitorList");
        //disable standard close button
		setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
 
		setupNorthPanel();
		//setupSouthPanel();
		//setupCenterPanel();

        //pack and set visible
        pack();
        setVisible(true);
    }
    
    private void setupNorthPanel()
    {
    	//add north panel containing some buttons   
        search = new JButton("Search");
        search.addActionListener(this);
        this.add(search, BorderLayout.NORTH);
    }
    
    //come here when button is clicked
    //find which button and act accordingly
    public void actionPerformed(ActionEvent e) 
    { 
    	if (e.getSource() == search) 
    	{
    		JOptionPane.showMessageDialog(this, "You clicked me!! HOW DARE YOU, BYE!");
    		System.exit(0);
    	}
    	
    }  
}
