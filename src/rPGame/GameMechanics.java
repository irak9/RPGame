package rPGame;

import java.util.Scanner;
import rPGame.Creature.*;
import rPGame.Item.*;

public class GameMechanics {
	private int attrbPoint, choice, itemLevel, gold;
	private Creature player, enemy;
	private Armour armor;
	private Weapon weapon;
	
	
	public int choiceMethod(int choice) {
		Scanner nmb = new Scanner(System.in);
		try {
		choice = nmb.nextInt();
		}
		catch(Exception numberError) {
			System.out.println("Number not recognized");
		}
		return choice;
	}
	public String choiceMethod(String choice) {
		Scanner strng = new Scanner(System.in);
		try {
		choice = strng.nextLine();
		}
		catch(Exception numberError) {
			System.out.println("Error");
		}
		return choice;
	}
	public void setDifficulty() {
		System.out.println("Choose difficulty");
		System.out.println("1-easy, 2-normal, 3-hard");
		switch(choiceMethod(choice)) {
		case 1: {
			attrbPoint = 30;
			itemLevel = 2;
			gold = 100;
			break;
		}
		case 2: {
			attrbPoint = 25;
			itemLevel = 2;
			gold = 75;
			break;
		}
		case 3: {
			attrbPoint = 20;
			itemLevel = 1;
			gold = 50;
			break;
		}
		default: {
			System.out.println("Try again");
			break;
		}
		}
	}
	
	public void addCreature(Object object) {
		
	} 
//Character creation	
	
	public void createCharacter() {
		boolean characterChoice = true, attributeChoice = true;
		String name = "name";
		int str = 0, dex = 0, vit = 0, will = 0, intl = 0;
		int curStr = 0, curDex = 0, curVit = 0, curWill = 0, curIntl = 0;
		int classChoice = 0;
		
		System.out.println("Choose your profession");
		System.out.println("1-Warrior, 2-Battle Prist");
		while(characterChoice == true) {
			switch(choiceMethod(choice)) {
				case 1: {
					classChoice = 1;
					characterChoice = false;
					break;
				}
				case 2: {
					classChoice = 2;
					characterChoice = false;
					break;
				}
				default :{
					System.out.println("Try again");
				}
			
			}
		}
		System.out.println("Name Your character");
		name = choiceMethod(name);
		while(attributeChoice == true) {
			System.out.println("You have " + attrbPoint + " attribute points to spend");
			System.out.println("Pick attribute and how many points you want to spend");
			System.out.println("1-Strength, 2-Dexterity, 3-Vitalilty, 4-Willpower, 5-Inteligence");			
			
			switch(choiceMethod(choice)) {
			case 1: {
				str = Math.min(choiceMethod(choice), attrbPoint);
				curStr = curStr + str;
				attrbPoint = attrbPoint - str;
				break;
			}
			case 2: {
				dex = Math.min(choiceMethod(choice), attrbPoint);
				curDex = curDex + dex;
				attrbPoint = attrbPoint - dex;
				break;
			}
			case 3: {
				vit = Math.min(choiceMethod(choice), attrbPoint);
				curVit = curVit + vit;
				attrbPoint = attrbPoint - vit;
				break;
			}
			case 4: {
				will = Math.min(choiceMethod(choice), attrbPoint);
				curWill = curWill + will;
				attrbPoint = attrbPoint - will;
				break;
			}
			case 5:{
				intl = Math.min(choiceMethod(choice), attrbPoint);
				curIntl = curIntl + intl;
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
		
		switch(classChoice) {
		case 1: {
			Creature creature = new Creature();
			Warrior player = creature.new Warrior("warrior", curStr, curDex, curVit, curWill, curIntl, 4);
			this.player = player;
			break;
		}
		case 2: {
			Creature creature = new Creature();
			BattlePriest player = creature.new BattlePriest("battlePriest", curStr, curDex, curVit, curWill, curIntl, 4);
			this.player = player;
			break;
		}
		}
		player.setName(name);
		System.out.println("Creating character completed");
		characterInfo();
	}
	
	public void characterInfo() {
		System.out.println("Your name is: " + player.getName());
		System.out.println("Your strength is: " + player.getStrength());
		System.out.println("Your dexterity is: " + player.getDexterity());
		System.out.println("Your vitality is: " + player.getVitality());
		System.out.println("Your willpower is: " + player.getWillpower());
		System.out.println("Your inteligence is: " + player.getInteligence());
		System.out.println("Your hit poits are: " + player.getHitPoints());
		System.out.println("Your energy is: " + player.getEnergy());
		System.out.println("Your bonus attack rate is: " + player.getAttackRate());
		System.out.println("Your bonus defense rate is: " + player.getDefenseRate());
	}
	
	
	
// End of character creation
	
//Enemy creation
	public void createMonster(String name, int strength, int dexterity, int vitality, int willpower,
			int inteligence, int moveSpeed) {
		int numberOfEnemyTypes = 2;
		int random = (int) (Math.random() * numberOfEnemyTypes);
		switch(random) {
		case 1: {
		Creature creature = new Creature();
		Goblin enemy = creature.new Goblin(name, strength, dexterity, vitality, willpower, inteligence, moveSpeed);
		this.enemy = enemy;
		break;
		}
		case 2: {
			Creature creature = new Creature();
			GoblinRaider enemy = creature.new GoblinRaider(name, strength, dexterity, vitality, willpower, inteligence, moveSpeed);
			this.enemy = enemy;
			break;
		}
		}
	}
//End of enemy creation	
	
//items creation
	public Weapon createWeapon(int itemLevel) {
		String name = "Broadsword";
		int minDamage = (int) ((Math.random() * 3) + itemLevel);
		int maxDamage = (int) ((Math.random() * 4) + ((Math.random() * 3)) + itemLevel);
		int weight = 4;
		int range = 1;
		int quantity = 1;
		int value = (int) ((Math.random() * 25) + (Math.random() * itemLevel * 2) + 20);
		Item item = new Item();
		Weapon weapon = item.new Weapon(name, minDamage, maxDamage, range, weight, quantity, value);
		return weapon;
	}
	public Armour createArmour(int itemLevel) {
		String name = "Chain Mail";
		int armour = (int) ((Math.random() * itemLevel) + 2);
		int weight = 20;
		int quantity = 1;
		int value = (int) ((Math.random() * 20) + 30);
		Item item = new Item();
		Armour armor = item.new Armour(name, armour, weight, quantity, value);
		return armor;
	}
	
	public void weaponInfo(Weapon weapon) {
		System.out.println("Name: " + weapon.getName());
		System.out.println("Damage: " + weapon.getMinDamage() + "-" + weapon.getMaxDamage());
		System.out.println("Range: " + weapon.getRange());
		System.out.println("Weight: " + weapon.getWeight());
		System.out.println("Value " + weapon.getValue());		
	}
	public void armourInfo(Armour armour) {
		System.out.println("Name: " + armour.getName());
		System.out.println("Armor: " + armour.getArmour());
		System.out.println("Weight: " + armour.getWeight());
		System.out.println("Value: " + armour.getValue());
	}
	
//End of items creation
	
	public void Shop() {
		boolean choiceInShop = true;
		int weaponStock = 1;
		int armourStock = 1;
		Weapon weapon;
		Armour armor;
		weapon = createWeapon(itemLevel);
		armor = createArmour(itemLevel);
		System.out.println("Welcome in my shop, what would you like to buy");
		System.out.println("1-weapon, 2-armour, 3-healing potion, 0-leave shop");
		System.out.println("damage " + weapon.getMinDamage() +"-" + weapon.getMaxDamage() + " Value: " + weapon.getValue());
		System.out.println("armour "+ armor.getArmour() + " Value " + armor.getValue());
		while(choiceInShop == true) {
			System.out.println("1-weapon, 2-armour, 3-healing potion, 0-leave shop");
			System.out.println("Your gold: " + gold);
			switch(choiceMethod(choice)) {
			case 1:	{
				if(weaponStock == 0)
					System.out.println("Sorry, weapon sold");
				else if(weapon.getValue() > gold)
					System.out.println("Sorry, you've got not enough gold");
				if(weaponStock == 1 && gold >= weapon.getValue()) {
					this.weapon = weapon;
					weaponStock = weaponStock - 1;
					gold = gold - weapon.getValue();
				}
				break;
				}
			case 2: {
				if(armourStock == 0)
					System.out.println("Sorry, armour sold");
				else if(armor.getValue() > gold)
					System.out.println("Sorry, you've got not enough gold");
				if(armourStock == 1 && gold >= armor.getValue()) {
					this.armor = armor;
					armourStock = armourStock - 1;
					gold = gold - armor.getValue();
				}
				break;
				}
			case 3: {				
				break;
				}
			default : {
					choiceInShop = false;
				}
			}
		}
	}
	public void Battle() {
		
	}
}
