package unit5;

public class GamerRunner {

	public static void main(String[] args) {
		Gamer rich = new Gamer("Richard");
		Gamer rock = new Gamer("Rishab");
		
		Gamer.setGoal(100);
		
		boolean running = true;
		
		while (running) {
			rich.addPts();
			rock.addPts();
			
			if (rich.won())
				running = false;
			else if (rock.won())
				running = false;
		}
		
		System.out.println(rich);
		System.out.println(rock);
	}
}
