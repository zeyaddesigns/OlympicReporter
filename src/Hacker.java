
public class Hacker extends Competitor
{
	//Instance variables
	private String qualification;
	private int age;

	
	//Constructor
	public Hacker (int id, Name name, String nation, String q, int age, int score)
	{
		super(id,name,nation);
		qualification = q;
		this.age = age;
	}
	
	//methods
	public String getQualification() { return qualification; }
	public int getAge() { return age; }
	public void setQualification(String qualification) { this.qualification = qualification; }
	public void setAge(int age) { this.age = age; }
	
	public String toString()
	{
		return super.toString() + ", " + age + ", Qualifications: " + qualification + ". \n";
	}
	
	public double getOverallScore()
	{
		//code
		return 0;
	}

}