
public class Rocky extends Player {

	public Rocky(String name) {
		
		super(name);
		
		
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	
	

}
