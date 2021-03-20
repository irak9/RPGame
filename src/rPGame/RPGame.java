package rPGame;

public class RPGame {	
	
	public static void main(String[] args) {
		
		GameMechanics mechanics = new GameMechanics();
		mechanics.setDifficulty();
		mechanics.createCharacter();
	}
}
