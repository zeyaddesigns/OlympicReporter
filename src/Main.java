
public class Main {

	public static void main(String[] args) 
	{	
		Climber c = new Climber (101, new Name("Zeyad Alsultan"), "UK", "Intermediate", 3, "45 seconds");
		c.addScore(54, 1);
		c.addScore(32, 2);
		c.addScore(17, 3);
		System.out.println(c);
	}

}
