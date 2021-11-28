
public class Hacker extends Competitor
{
	//Instance variables
	private String qualification;
	private int age;
	private int score;
	
	//Constructor
	public Hacker (int id, Name name, String nation, String q, int age, int score)
	{
		super(id,name,nation);
		qualification = q;
		this.age = age;
		this.score = score;
	}
	
	//methods
	public String getQualification() { return qualification; }
	public int getAge() { return age; }
	public int getScore() { return score; }
	public void setQualification(String qualification) { this.qualification = qualification; }
	public void setAge(int age) { this.age = age; }
	public void setScore(int score) { this.score = score; }
	
}