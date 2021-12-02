//import all the GUI classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CompetitorGUI extends JFrame  implements ActionListener
{
	// The competitor list to be searched.
    private CompetitorList competitorList;
    
    //GUI components
    JButton close, listAll, findByID, edit;
    JTextArea textArea;
    
    
    //Create the frame with its panels.
    public CompetitorGUI(CompetitorList list)
    {
        this.competitorList = list;

		//for background colour getContentPane().setBackground(Color.LIGHT_GRAY);
		//to disable resizing setResizable(false);
		
		//setupNorthPanel();
		
		//setupSouthPanel();
		//setupCenterPanel();
  
    }
    
    
    
    public void setupNorthPanel()
    {
    	JPanel p = new  JPanel();
    	
    	findByID = new JButton("Search");
        findByID.addActionListener(this);
        p.add(findByID);
    	
    	listAll = new JButton("List All");
        listAll.addActionListener(this);
        p.add(listAll);
    	
        edit = new JButton("Edit");
        edit.addActionListener(this);
        p.add(edit);
        
        close = new JButton("Close");
        close.addActionListener(this);
        p.add(close);
        
        this.add(p, BorderLayout.NORTH);
    }
    
    public void setupSouthPanel()
    {
    	//TODO
    }
    
    public void setupCenterPanel()
    {
    	 textArea = new JTextArea("Hello world!");
    	 this.add(textArea, BorderLayout.CENTER);
    	 textArea.setVisible(true);
    	 textArea.setSize(300, 300);
    }
    
    //come here when button is clicked
    //find which button and act accordingly
    public void actionPerformed(ActionEvent e) 
    { 
    	if (e.getSource() == close) 
    	{
    		
    		System.exit(0);
    	}
    	else if (e.getSource() == listAll) 
    	{
    		//TODO
    	}
    	else if (e.getSource() == findByID) 
    	{
    		//Prompt user input via external window
    		String input = JOptionPane.showInputDialog("Enter the ID number");
    		System.exit(0);
    	}
    }  
}
