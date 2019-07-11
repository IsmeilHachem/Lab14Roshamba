import java.util.Random;

public class Randrago extends Player {
	
	
	public Randrago(String name) {
		super(name);
	}
	
	public Randrago() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
		
		Random rand = new Random();
		int random = (int) (Math.random() * 3 + 1);
		System.out.println(random);
		
		if (random == 1) {
			return Roshambo.ROCK;
		} else if (random == 2) {
			return Roshambo.SCISSORS;
		} else {
			return Roshambo.PAPER;
		}
		
		
	}
	
	

}
