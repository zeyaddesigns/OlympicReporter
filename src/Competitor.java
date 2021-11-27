//SUPERCLASS

public class Competitor 
{
	//Instance variables
	private int id;
	private Name name;
	private String nation;
	
	//Constructor
	public Competitor (int id, Name name, String nation)
	{
		this.id = id;
		this.name = name;
		this.nation = nation;
	}
	
	//Methods
	public int getId() { return id; }
	public Name getName() { return name; }
	public String getNation() { return nation; }
	
	public void setId(int id) { this.id = id; }
	public void setName(Name name) { this.name = name; }
	public void setNation(String nation) { this.nation = nation; }
}