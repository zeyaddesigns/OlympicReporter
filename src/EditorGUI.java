//import all the GUI classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EditorGUI extends JFrame  implements ActionListener
{
	// The competitor list to be searched.
    private CompetitorList competitorList;
    
    //GUI components
    JButton find, save;
    JTextField textField, getId, getName, getNation, getLevel, getScores;
    JLabel findByID, id, name, nation, level, scores;
    
    //Constructor
    public EditorGUI(CompetitorList list)
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
        
    }
    
    public void setupSouthPanel()
    {
    	JPanel p = new  JPanel();
    	this.add(p, BorderLayout.SOUTH);
    	
    	save = new JButton("Save");
        save.addActionListener(this);
        p.add(save);
    }
    
    public void setupCenterPanel()
    {
    	JPanel p = new  JPanel();
    	p.setLayout(new GridLayout(5,2));
    	this.add(p, BorderLayout.CENTER);
    	
    	id = new JLabel("ID: ");
    	p.add(id);
    	
    	getId = new JTextField(20);
    	getId.addActionListener(this);
    	p.add(getId);
    	
    	name = new JLabel("Name: ");
    	p.add(name);
    	
    	getName = new JTextField(20);
    	getName.addActionListener(this);
    	p.add(getName);
    	
    	nation = new JLabel("Nation: ");
    	p.add(nation);
    	
    	getNation = new JTextField(20);
    	getNation.addActionListener(this);
    	p.add(getNation);
    	
    	level = new JLabel("Level: ");
    	p.add(level);
    	
    	getLevel = new JTextField(20);
    	getLevel.addActionListener(this);
    	p.add(getLevel);
    	
    	scores = new JLabel("Scores: ");
    	p.add(scores);
    	
    	getScores = new JTextField(20);
    	getScores.addActionListener(this);
    	p.add(getScores);
    }
    
    public void actionPerformed(ActionEvent e) 
    { 
    	if (e.getSource() == find) 
    	{
    		find();
    	}
    	else if (e.getSource() == save) 
    	{
    		save();
    	}
    }
    
    public void find()
    {
    	String searchId = textField.getText();
    	
    	if(searchId.length() > 0)
    	{
    		//Convert id string to int
    		int id = Integer.parseInt(searchId);
    		Competitor c = competitorList.findById(id);
    		
    		if (c != null)
    		{ 
    			getId.setText(String.valueOf(c.getId()));
    			getName.setText(c.getName().getFullName());
    			getNation.setText(c.getNation());
    			getLevel.setText(c.getLevel());
    			getScores.setText(c.getScores());
    		}
    		else
    		{JOptionPane.showMessageDialog(this, "ID cannot be found");}
    	}
    	else
    	{JOptionPane.showMessageDialog(this, "no valid entry");}
    }
    
    public void save()
    {
    	String id = getId.getText();
    	
    	//Convert id string to int
		int intId = Integer.parseInt(id);
		Competitor c = competitorList.findById(intId);
		
		c.setId(intId);
		JOptionPane.showMessageDialog(this, "New data saved sucessfully");
    }
}
