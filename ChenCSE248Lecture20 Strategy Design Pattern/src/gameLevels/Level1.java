package gameLevels;

public class Level1 implements IAbility {

	@Override
	public void travel() {
		System.out.println("Travel on foot.");
	}

	@Override
	public void handleWeapons() {
		System.out.println("No weapons, fist fight only.");
		
	}

	@Override
	public void protect() {
		System.out.println("Wear no protection.");
		
	}
	
	public void justDoIt() {
		travel();
		handleWeapons();
		protect();
	}

}