//import all the GUI classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CompetitorGUI extends JFrame  implements ActionListener
{
	// The competitor list to be searched.
    private CompetitorList competitorList;
    
    //GUI components
    JButton close, find;
    JTextArea textArea;
    JTextField textField;
    JLabel findByID;
    JScrollPane scrollList;
    JRadioButton all, climbers, paragliders, skateboarders;
     
    //Create the frame with its panels.
    public CompetitorGUI(CompetitorList list)
    {
        this.competitorList = list;
    }

    public void setupNorthPanel()
    {
    	JPanel p = new  JPanel();
    	this.add(p, BorderLayout.NORTH);
    	
    	findByID = new JLabel("Find by ID: ");
    	p.add(findByID);
    	
    	textField = new JTextField(16);
    	textField.addActionListener(this);
    	p.add(textField);
    	
        find = new JButton("Find");
        find.addActionListener(this);
        p.add(find);
        
        close = new JButton("Close");
        close.addActionListener(this);
        p.add(close);
    }
    public void setupSouthPanel()
    {
    	JPanel p = new  JPanel();
    	ButtonGroup buttonGroup = new ButtonGroup();
    	
    	all = new JRadioButton("All");
    	p.add(all);
    	buttonGroup.add(all);
    	all.addActionListener(this);
    	
    	climbers = new JRadioButton("Climbers");
    	p.add(climbers);
    	buttonGroup.add(climbers);
    	climbers.addActionListener(this);
    	
    	paragliders = new JRadioButton("Paragliders");
    	p.add(paragliders);
    	buttonGroup.add(paragliders);
    	paragliders.addActionListener(this);
    	
    	skateboarders = new JRadioButton("Skateboarders");
    	p.add(skateboarders);
    	buttonGroup.add(skateboarders);
    	skateboarders.addActionListener(this);
    	
    	this.add(p, BorderLayout.SOUTH);
    }
    
    public void setupCenterPanel()
    {
    	 textArea = new JTextArea(15,20);
    	 scrollList = new JScrollPane(textArea);
    	 this.add(scrollList,BorderLayout.CENTER);
    	 textArea.setVisible(true);
    }
    
    //come here when button is clicked
    //find which button and act accordingly
    public void actionPerformed(ActionEvent e) 
    { 
    	if (e.getSource() == find) 
    	{
    		find();
    	}
    	else if (e.getSource() == close) 
    	{
    		System.exit(0);
    	}
    	else if (e.getSource() == all) 
    	{
    		textArea.setText(competitorList.getCompetitors());
    	}
    	else if (e.getSource() == climbers) 
    	{
    		textArea.setText(competitorList.getClimbers());
    	}
    	else if (e.getSource() == paragliders) 
    	{
    		textArea.setText(competitorList.getParagliders());
    	}
    	else if (e.getSource() == skateboarders) 
    	{
    		textArea.setText(competitorList.getSkateboarders());
    	}
    } 
    
    public void find()
    {
    	String searchId = textField.getText();
    	
    	if(searchId.length() > 0)
    	{
    		//Convert id string to int
    		int intId = Integer.parseInt(searchId);
    		Competitor c = competitorList.findById(intId);
    		
    		if (c != null)
    		{textArea.setText(c.getShortDetails());}
    		else
    		{textArea.setText("ID not found");}
    	}
    	else
    	{textArea.setText("no valid entry");}
    }
}
