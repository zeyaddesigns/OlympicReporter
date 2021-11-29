
public class Main {

	public static void main(String[] args) 
	{	
		Climber c = new Climber(101, new Name ("Zeyad Alsultan"), "Scotland", "Expert", 4, "2.5");
		c.addScore(52, 1);
		c.addScore(96, 2);
		c.addScore(21, 3);
		System.out.println(c);
	}

}
