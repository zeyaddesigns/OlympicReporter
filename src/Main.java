
public class Main {

	public static void main(String[] args) 
	{	
		CompetitorList comp = new CompetitorList();
		comp.populate();
		System.out.println(comp.listAllGamers());
		System.out.println(comp.listAllHackers());
		System.out.println(comp.listAllNames());
	}

}
