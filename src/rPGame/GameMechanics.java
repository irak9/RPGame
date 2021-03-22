package rPGame;

import java.util.Scanner;
import rPGame.Creature.*;
import rPGame.GameMechanics.difficultyInstance;
import rPGame.Item.*;

public class GameMechanics {
	
	
	public int choiceMethod() {
		int choice = 0;
		Scanner nmb = new Scanner(System.in);
		try {
		choice = nmb.nextInt();
		}
		catch(Exception numberError) {
			System.out.println("Number not recognized");
		}
		return choice;
	}
	public String chooseName() {
		String choice = "noName";
		Scanner strng = new Scanner(System.in);
		try {
		choice = strng.nextLine();
		}
		catch(Exception stringError) {
			System.out.println("Error");
		}
		return choice;
	}
	public difficultyInstance setDifficulty() {
		int itemLevel = 0, gold = 0, attrbPoints = 0, choice = 0;
		System.out.println("Choose difficulty");
		System.out.println("1-easy, 2-normal, 3-hard");
		switch(choiceMethod()) {
		case 1: {
			itemLevel = 3;
			gold = 100;
			attrbPoints = 30;
			break;
		}
		case 2: {
			itemLevel = 2;
			gold = 100;
			attrbPoints = 25;
			break;
		}
		case 3: {
			itemLevel = 1;
			gold = 75;
			attrbPoints = 25;
			break;
		}
		default: {
			System.out.println("Try again");
			break;
		}
		}
		difficultyInstance diff = new difficultyInstance(itemLevel, gold, attrbPoints);
		return diff;
	}
	public int setItemlevel(int itemLevel) {
		return itemLevel;
	}
	
//Character creation	
	
	public String nameYourCharacter() {
		String name = "noName";
		System.out.println("Name Your character");
		name = chooseName();
		return name;
	}

	public Warrior createWarrior(String name, int attrbPoint, int gold) {
		int str = 0, dex = 0, vit = 0, will = 0, intl = 0;
		boolean attributeChoice = true;
		
		Creature creature = new Creature();
		Warrior player = creature.new Warrior("profession", 1, 1, 1, 1, 1, 4);
		while(attributeChoice == true) {
			System.out.println("You have " + attrbPoint + " attribute points to spend");
			System.out.println("Pick attribute and how many points you want to spend");
			System.out.println("1-Strength, 2-Dexterity, 3-Vitalilty, 4-Willpower, 5-Inteligence");			
			
			switch(choiceMethod()) {
			case 1: {
				str = Math.min(choiceMethod(), attrbPoint);
				player.setStrength(player.getStrength() + str);
				attrbPoint = attrbPoint - str;
				break;
			}
			case 2: {
				dex = Math.min(choiceMethod(), attrbPoint);
				player.setDexterity(player.getDexterity() + dex);
				attrbPoint = attrbPoint - dex;
				break;
			}
			case 3: {
				vit = Math.min(choiceMethod(), attrbPoint);
				player.setVitality(player.getVitality() + vit);
				attrbPoint = attrbPoint - vit;
				break;
			}
			case 4: {
				will = Math.min(choiceMethod(), attrbPoint);
				player.setWillpower(player.getWillpower() + will);
				attrbPoint = attrbPoint - will;
				break;
			}
			case 5:{
				intl = Math.min(choiceMethod(), attrbPoint);
				player.setInteligence(player.getInteligence() + intl);
				attrbPoint = attrbPoint - intl;
				break;
			}
			default:{
				System.out.println("Try again");
			}
			}
			if(attrbPoint == 0) {
				attributeChoice = false;
			}
		}
		player.setName(name);
		player.setMaxHitPoints(player.getVitality() * 7 + player.getStrength() * 4 + 60);
		player.setMaxEnergy(player.getWillpower() * 2 + 5);
		player.setAttackRate(player.getStrength() * 2 + player.getDexterity() * 1);
		player.setDefenseRate(player.getDexterity() * 2);
		player.setGold(gold);
		characterInfo(player);
		return player;
	}
	
	public BattlePriest createBattlePriest(String name, int attrbPoint, int gold) {
		int str = 0, dex = 0, vit = 0, will = 0, intl = 0;
		boolean attributeChoice = true;
		
		Creature creature = new Creature();
		BattlePriest player = creature.new BattlePriest("profesion", 1, 1, 1, 1, 1, 4);
		while(attributeChoice == true) {
			System.out.println("You have " + attrbPoint + " attribute points to spend");
			System.out.println("Pick attribute and how many points you want to spend");
			System.out.println("1-Strength, 2-Dexterity, 3-Vitalilty, 4-Willpower, 5-Inteligence");			
			
			switch(choiceMethod()) {
			case 1: {
				str = Math.min(choiceMethod(), attrbPoint);
				player.setStrength(player.getStrength() + str);
				attrbPoint = attrbPoint - str;
				break;
			}
			case 2: {
				dex = Math.min(choiceMethod(), attrbPoint);
				player.setDexterity(player.getDexterity() + dex);
				attrbPoint = attrbPoint - dex;
				break;
			}
			case 3: {
				vit = Math.min(choiceMethod(), attrbPoint);
				player.setVitality(player.getVitality() + vit);
				attrbPoint = attrbPoint - vit;
				break;
			}
			case 4: {
				will = Math.min(choiceMethod(), attrbPoint);
				player.setWillpower(player.getWillpower() + will);
				attrbPoint = attrbPoint - will;
				break;
			}
			case 5:{
				intl = Math.min(choiceMethod(), attrbPoint);
				player.setInteligence(player.getInteligence() + intl);
				attrbPoint = attrbPoint - intl;
				break;
			}
			default:{
				System.out.println("Try again");
			}
			}
			if(attrbPoint == 0) {
				attributeChoice = false;
			}
		}
		player.setName(name);
		player.setMaxHitPoints(player.getVitality() * 7 + player.getStrength() * 4 + 60);
		player.setMaxEnergy(player.getWillpower() * 2 + 5);
		player.setAttackRate(player.getStrength() * 2 + player.getDexterity() * 1);
		player.setDefenseRate(player.getDexterity() * 2);
		player.setGold(gold);
		characterInfo(player);
		return player;
	}
	
	
public Creature createCharacter(difficultyInstance difficulty) {
	byte classID = 0;
	boolean classChoice = true;
	String name;
	Creature player = null;
	
	name = nameYourCharacter();

	while(classChoice) {
		System.out.println("Pick your character class.");
		System.out.println("1-Warrior, 2-BattlePriest");
		switch(choiceMethod()) {
		case 1:{
			 player = createWarrior(name, difficulty.attributePoints, difficulty.gold);
			 classID = 1;
			 classChoice = false;
			 break;
		}
		case 2:{
			 player = createBattlePriest(name, difficulty.attributePoints, difficulty.gold);
			 classID = 2;
			 classChoice = false;
			 break;
		}
		default: {
			System.out.println("Try again");
			break;
		}
	}
}
	return player;
}
	
	public void characterInfo(Creature player) {
		System.out.println("Your name is: " + player.getName());
		System.out.println("Your strength is: " + player.getStrength());
		System.out.println("Your dexterity is: " + player.getDexterity());
		System.out.println("Your vitality is: " + player.getVitality());
		System.out.println("Your willpower is: " + player.getWillpower());
		System.out.println("Your inteligence is: " + player.getInteligence());
		System.out.println("Your hit poits are: " + player.getMaxHitPoints() + "/");
		System.out.println("Your energy points are: " + player.getMaxEnergy() + "/");
		System.out.println("Your bonus attack rate is: " + player.getAttackRate());
		System.out.println("Your bonus defense rate is: " + player.getDefenseRate());
		System.out.println("You have: " + player.getGold() + " gold");
	}
	
// End of character creation
	
//Skill management
	
	public void skill1Manager(Creature player, byte classID) {
		if (classID == 1) {
			((Warrior) player).offensiveSkill(6);
		}
		if (classID == 2) {
			((BattlePriest) player).offensiveSkill(8);
		}
	}
	
//End of skill management
	
//Enemy creation
	public Goblin createGoblin(String name, int strength, int dexterity, int vitality, int willpower,
			int inteligence, int moveSpeed) {		
		Creature creature = new Creature();
		Goblin goblin = creature.new Goblin(name, strength, dexterity, vitality, willpower, inteligence, moveSpeed);	
		return goblin;
	}
	
	public GoblinRaider createGoblinRaider(String name, int strength, int dexterity, int vitality, int willpower,
			int inteligence, int moveSpeed) {
			Creature creature = new Creature();
			GoblinRaider goblinRaider = creature.new GoblinRaider(name, strength, dexterity, vitality, willpower, inteligence, moveSpeed);
		return goblinRaider;
	}
	
//End of enemy creation	
	
//items creation
	public Weapon createWeapon(int itemLevel) {
		String name = randomNameGen.weaponName();
		int minDamage = (int) ((Math.random() * 3) + itemLevel);
		int maxDamage = (int) ((Math.random() * 4) + ((Math.random() * 3)) + itemLevel + 2);
		int weight = 4;
		int range = 1;
		int quantity = 1;
		int value = (int) ((Math.random() * 25) + (Math.random() * itemLevel * 2) + 20);
		Item item = new Item();
		Weapon weapon = item.new Weapon(name, minDamage, maxDamage, range, weight, quantity, value);
		return weapon;
	}
	public Armour createArmour(int itemLevel) {
		String name = randomNameGen.armourName();
		int armour = (int) ((Math.random() * itemLevel) + 2);
		int weight = 20;
		int quantity = 1;
		int value = (int) ((Math.random() * 20) + 30);
		Item item = new Item();
		Armour armor = item.new Armour(name, armour, weight, quantity, value);
		return armor;
	}
	
//End of items creation
	
//Equipment management

	public void weaponInfo(Weapon weapon) {
		System.out.print("Name: " + weapon.getName());
		System.out.print(", Damage: " + weapon.getMinDamage() + "-" + weapon.getMaxDamage());
		System.out.print(", Range: " + weapon.getRange());
		System.out.print(", Weight: " + weapon.getWeight());
		System.out.println(", Value " + weapon.getValue());		
	}
	public void armourInfo(Armour armour) {
		System.out.print("Name: " + armour.getName());
		System.out.print(", Armor: " + armour.getArmour());
		System.out.print(", Weight: " + armour.getWeight());
		System.out.println(", Value: " + armour.getValue());
	}
	
	public void equipmentInfo(Creature player) {
		boolean managingEq = true;
		while (managingEq == true)
		{
			System.out.println("1-weapon, 2-armour, 0-exit");
			switch(choiceMethod()) {
			case 1: {
				if(player.getCurrentWeapon() != null)
					weaponInfo(player.getCurrentWeapon());
				else
					System.out.println("You have no weapon!");
				break;
			}
			case 2: {
				if(player.getCurrentArmour() != null)
					armourInfo(player.getCurrentArmour());
				else
					System.out.println("You have no armour.");
				break;
			}
			case 0: {
				managingEq = false;
			}
			default:
			}
		}
	}
//End of equipment management

//Shops
	
	public void Shop(Creature player, int itemLevel) {
		boolean choiceInShop = true;
		Weapon weapon;
		Armour armor;
		
		weapon = createWeapon(itemLevel);
		armor = createArmour(itemLevel);
		System.out.println("Welcome in my shop, how can i help you");
		while(choiceInShop == true) {
			System.out.println("1-buy, 2-sell, 9-Your eqiupment, 0-leave shop");
			switch(choiceMethod()) {
			case 1: {
				buyAction(player, choiceInShop, weapon, armor);
				break;
			}
			case 2: {
				sellAction(player, choiceInShop);
				break;
			}
			case 9: {
				equipmentInfo(player);
				break;
			}
			case 0:
				choiceInShop = false;
				break;
		}
		}
	}
	
	public void buyAction(Creature player, boolean choiceInShop, Weapon weapon, Armour armor) {
		int weaponStock = 1;
		int armourStock = 1;
		String shopKeeperDialogue = "What would you like to buy?";
		
		while(choiceInShop == true) {			
			System.out.println(shopKeeperDialogue);
			if(weaponStock == 1) {
				System.out.println("1-" + weapon.getName() + " damage: " + weapon.getMinDamage() + "-" + weapon.getMaxDamage() + " price: " + weapon.getValue());
			}
			if(armourStock == 1) {
				System.out.println("2-" + armor.getName() + " armour: "+ armor.getArmour() + " price: " + armor.getValue());
			}
			System.out.print("9-Your eqiupment,");
			System.out.println(" 0-back");
			System.out.println("Your gold: " + player.gold);
			switch(choiceMethod()) {
			case 1:	{
				if(player.getCurrentWeapon() == null) {
				if(weaponStock == 0)
					System.out.println("Sorry, weapon sold");
				else if(weapon.getValue() > player.getGold())
					System.out.println("Sorry, you've got not enough gold");
				if(weaponStock == 1 && player.getGold() >= weapon.getValue()) {
					player.setCurrentWeapon(weapon); 
					weaponStock = weaponStock - 1;
					player.setGold( player.getGold() - weapon.getValue());
					System.out.println("You bought " + weapon.getName());
				}
				}
				else 
					System.out.println("Sell your current weapon.");
				break;
				}
			case 2: {
				if(player.getCurrentArmour() == null) {
				if(armourStock == 0)
					System.out.println("Sorry, armour sold");
				else if(armor.getValue() > player.getGold())
					System.out.println("Sorry, you've got not enough gold");
				if(armourStock == 1 && player.getGold() >= armor.getValue()) {
					player.setCurrentArmour(armor);
					armourStock = armourStock - 1;
					player.setGold(player.getGold() - armor.getValue());
					System.out.println("You bought " + armor.getName());
				}
				}
				else
					System.out.println("Sell your current armour");
				break;
				}
			case 3: {				
				break;
				}
			case 9:{
				equipmentInfo(player);
				break;
			}
			case 0: {
				choiceInShop = false;
				break;
			}
			}
			shopKeeperDialogue = "Anything else?";
		}
	}
	
	public void sellAction(Creature player, boolean choiceInShop) {
		while(choiceInShop == true) {
			System.out.println("What would you like to sell?");
			System.out.println("1-weapon , 2-armour, 9-Your equipment, 0-back");
			switch(choiceMethod()) {
			case 1: {
				if(player.getCurrentWeapon() != null) {
					Weapon weapon = player.getCurrentWeapon();
					int value = (int) weapon.getValue()/2;
					player.setGold(player.getGold() + value);
					System.out.println("You sold your weapon for " + value + " gold");
					player.setCurrentWeapon(null);
					break;
				}
				else {
					System.out.println("You have no weapon to sell");
					break;
				}
			}
			case 2: {
				if(player.getCurrentArmour() != null) {
					Armour armour = player.getCurrentArmour();
					int value = (int) armour.getValue()/2;
					player.setGold(player.getGold() + value);
					System.out.println("You sold your armour for " + value + " gold");
					player.setCurrentArmour(null);
					break;				
				}
				else {
					System.out.println("You have no armour to sell");
					break;
				}
			}
			case 9: {
				equipmentInfo(player);
				break;
			}
			case 0: {
				choiceInShop = false;
				break;
			}
		}
	}
}
	
	
// End of shops
	
	
	public void takeAction() {
		
	}	
	
	public void startGame() {
		difficultyInstance diff = setDifficulty();
		Creature player;
		player = createCharacter(diff);
	}
	
	class difficultyInstance {
		int itemLevel, gold, attributePoints;
		difficultyInstance(int itemLevel, int gold, int attributePoints){
			this.itemLevel = itemLevel;
			this.gold = gold;
			this.attributePoints = attributePoints;
		}
	public int getItemLevel() {
		return this.itemLevel;
	}
	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	}
	class enemyDifficulty {
		int itemLevel, enemyLevel;
		public enemyDifficulty(int enemyLevel, int itemLevel) {
			this.enemyLevel = enemyLevel;
			this.itemLevel = itemLevel;			
		}
		public int getEnemyItemLevel() {
			return this.itemLevel;
		}
		public void setEnemyItemLevel(int itemLevel) {
			this.itemLevel = itemLevel;
		}
		public int getEnemyLevel() {
			return this.enemyLevel;
		}
		public void setEnemyLevel(int enemyLevel) {
			this.enemyLevel = enemyLevel;
		}
	}
}
