package rPGame;

public class randomNameGen {

	public static String weaponName() {
		int rnd = (int) (Math.random() * 7) + 1;
		String weaponName = "noName";
		String weaponName1 = "Broadsword";
		String weaponName2 = "Short sword";
		String weaponName3 = "Long sword";
		String weaponName4 = "Battle hammer";
		String weaponName5 = "Flail";
		String weaponName6 = "Spear";
		String weaponName7 = "Mace";
		String weaponName8 = "Battle axe";
		
		switch(rnd){
		case 1:{	
			weaponName = weaponName1;
			break;
		}
		case 2:{
			weaponName = weaponName2;
			break;
		}
		case 3:{
			weaponName = weaponName3;
			break;
		}
		case 4:{
			weaponName = weaponName4;
			break;
		}
		case 5:{
			weaponName = weaponName5;
			break;
		}
		case 6:{
			weaponName = weaponName6;
			break;
		}
		case 7:{
			weaponName = weaponName7;
			break;
		}
		case 8:{
			weaponName = weaponName8;
			break;
		}		
		}
		return weaponName;
	}
	
	public static String armourName() {
		int rnd = (int) (Math.random() * 5) + 1;
		String armourName = "noName";
		String armourName1 = "Full Plate";
		String armourName2 = "Chain mail";
		String armourName3 = "Leather armour";
		String armourName4 = "Breast plate";
		String armourName5 = "Brigandine";
		String armourName6 = "Studded armour";
		
		switch(rnd){
		case 1:{
			armourName = armourName1;
			break;
		}
		case 2:{
			armourName = armourName2;
			break;
		}
		case 3:{
			armourName = armourName3;
			break;
		}
		case 4:{
			armourName = armourName4;
			break;
		}
		case 5:{
			armourName = armourName5;
			break;
		}
		case 6:{
			armourName = armourName6;
			break;
		}	
		}
		return armourName;
	
}
}
