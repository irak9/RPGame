package rPGame;

import java.util.Scanner;

public class GameMechanics {
	
	
	public int choiceMethod() {
		int choice = 0;
		try {
		Scanner nmb = new Scanner(System.in);
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
		int itemLevel = 0, gold = 0, attrbPoints = 0, enemyLevel= 0;
		System.out.println("Choose difficulty");
		System.out.println("1-easy, 2-normal, 3-hard");
		switch(choiceMethod()) {
		case 1: {
			itemLevel = 3;
			gold = 100;
			attrbPoints = 30;
			enemyLevel = 1;
			break;
		}
		case 2: {
			itemLevel = 2;
			gold = 100;
			attrbPoints = 25;
			enemyLevel = 2;
			break;
		}
		case 3: {
			itemLevel = 1;
			gold = 75;
			attrbPoints = 25;
			enemyLevel = 3;
			break;
		}
		default: {
			System.out.println("Try again");
			break;
		}
		}
		difficultyInstance diff = new difficultyInstance(itemLevel, gold, attrbPoints, enemyLevel);
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
		
		Warrior player = new Warrior("profession", 1, 1, 1, 1, 1, 10, 4);
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
		player.setMaxHitPoints(player.getVitality() * 12 + player.getStrength() * 2 + 60);
		player.setCurrentHitPoints(player.getMaxHitPoints());
		player.setMaxEnergy(player.getWillpower() * 2 + 5);
		player.setCurrentEnergy(player.getMaxEnergy());
		player.setAttackRate(player.getStrength() * 2 + player.getDexterity());
		player.setDefenseRate(player.getDexterity());
		player.setGold(gold);
		characterInfo(player);
		return player;
	}
	
	public BattlePriest createBattlePriest(String name, int attrbPoint, int gold) {
		int str = 0, dex = 0, vit = 0, will = 0, intl = 0;
		boolean attributeChoice = true;
		
		BattlePriest player = new BattlePriest("profesion", 1, 1, 1, 1, 1, 10, 4);
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
		player.setMaxHitPoints(player.getVitality() * 8 + player.getWillpower() * 2 + player.getStrength() * 2 + 10);
		player.setCurrentHitPoints(player.getMaxHitPoints());
		player.setMaxEnergy(player.getWillpower() * 4 + 20);
		player.setCurrentEnergy(player.getMaxEnergy());
		player.setAttackRate(player.getStrength() + player.getDexterity() + player.getWillpower());
		player.setDefenseRate(player.getWillpower() + player.getDexterity());
		player.setGold(gold);
		characterInfo(player);
		return player;
	}
	
	
public Creature createCharacter(difficultyInstance difficulty) {
	boolean classChoice = true;
	String name;
	Creature player = null;
	
	name = nameYourCharacter();

	while(classChoice) {
		System.out.println("Pick your character class.");
		System.out.println("1-Warrior, 2-Battle Priest, 0-class info");
		switch(choiceMethod()) {
		case 1: {
			 player = createWarrior(name, difficulty.attributePoints, difficulty.gold);
			 classChoice = false;
			 break;
		}
		case 2: {
			 player = createBattlePriest(name, difficulty.attributePoints, difficulty.gold);
			 classChoice = false;
			 break;
		}
		case 0: {
			warriorClassInfo();
			battlePriestClassInfo();
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
		
//End of character creation

//character info methods

public void characterInfo(Creature player) {
	System.out.println("Your name is: " + player.getName());
	System.out.println("Your strength is: " + player.getStrength());
	System.out.println("Your dexterity is: " + player.getDexterity());
	System.out.println("Your vitality is: " + player.getVitality());
	System.out.println("Your willpower is: " + player.getWillpower());
	System.out.println("Your inteligence is: " + player.getInteligence());
	System.out.println("Your hit poits are: " + player.getCurrentHitPoints() + "/" + player.getMaxHitPoints());
	System.out.println("Your energy points are: " + player.getCurrentEnergy() + "/" + player.getMaxEnergy());
	System.out.println("Your bonus attack rate is: " + player.getAttackRate());
	System.out.println("Your bonus defense rate is: " + player.getDefenseRate());
	System.out.println("You have: " + player.getGold() + " gold");
}
	
public void warriorClassInfo() {
	System.out.println("Warrior");
	System.out.println("base hp:60, +11 per vitality point, +2 per strength point");
	System.out.println("base energy:5, +2 per willpower point");
	System.out.println("+2 attack rate per strength point, +1 attack rate per dexterity point");
	System.out.println("+1 defense rate per dexterity point \n");
}

public void battlePriestClassInfo() {
	System.out.println("Battle Priest");
	System.out.println("base hp:10, +8 per vitality point, +1 per strength point, +3 per willpower point");
	System.out.println("base energy:20, +4 per willpower point");
	System.out.println("+1 attack rate per strength, dexterity and willpower point");
	System.out.println("+1 defense rate per dexterity and willpower point \n");
}

//End of character info methods
		
//Enemy creation
	public Goblin createGoblin(String name, int strength, int dexterity, int vitality, int willpower, int actionPoints,
			int inteligence, int moveSpeed, int itemLevel) {	
		Goblin goblin = new Goblin(name, strength, dexterity, vitality, willpower, inteligence, actionPoints, moveSpeed);	
		Weapon weapon = createWeapon(itemLevel / 2);
		Armour armour = createArmour(itemLevel / 2);
		goblin.setCurrentWeapon(weapon);
		goblin.setCurrentArmour(armour);
		return goblin;
	}
	
	public GoblinRaider createGoblinRaider(String name, int strength, int dexterity, int vitality, int willpower, int actionPoints,
			int inteligence, int moveSpeed, int itemLevel) {
			GoblinRaider goblinRaider = new GoblinRaider(name, strength, dexterity, vitality, willpower, inteligence, actionPoints, moveSpeed);
			Weapon weapon = createWeapon(itemLevel);
			Armour armour = createArmour(itemLevel / 2);
			Shield shield = createShield(itemLevel / 2);
			goblinRaider.setCurrentWeapon(weapon);
			goblinRaider.setCurrentArmour(armour);
			goblinRaider.setCurrentShield(shield);
		return goblinRaider;
	}
	
//End of enemy creation	
	
//items creation
	public Weapon createWeapon(int itemLevel) {
		String name = randomNameGen.weaponName();
		int minDamage = (int) ((Math.random() * 3) + itemLevel);
		int maxDamage = (int) ((Math.random() * 6) + ((Math.random() * 3)) + itemLevel + 2);
		int weight = 4;
		int range = 1;
		int quantity = 1;
		int value = (int) ((Math.random() * 25 + 20) + (Math.random() * itemLevel / 2) + itemLevel);
		Weapon weapon = new Weapon(name, minDamage, maxDamage, range, weight, quantity, value);
		return weapon;
	}
	public Armour createArmour(int itemLevel) {
		String name = randomNameGen.armourName();
		int armour = (int) ((Math.random() * 5) + itemLevel);
		int weight = 20;
		int quantity = 1;
		int value = (int) (((Math.random() * 20) + 30) + itemLevel * 2);
		Armour armor = new Armour(name, armour, weight, quantity, value);
		return armor;
	}
	
	public Shield createShield(int itemLevel) {
		String name = randomNameGen.shieldName();
		int armour = (int) ((Math.random() * (itemLevel / 2)) * (Math.random() * (itemLevel / 3)) + 1);
		int weight = 5;
		int quantity = 1;
		int value = (int) (((Math.random() * 5) + 12) + itemLevel);
		Shield shield = new Shield(name, armour, weight, quantity, value);
		return shield;
	}
	
	public HealingPotion createHealingPotion(int itemLevel) {
		String name = "Healing potion";
		int healValue= (int) (itemLevel / 4 + 8 );
		int weight = 2;
		int quantity = 1;
		int value = (int) (((Math.random() * 3) + 10) + itemLevel);
		HealingPotion healingPotion = new HealingPotion(name, healValue, weight, quantity, value);
		return healingPotion;
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
		System.out.print(", Armor: " + armour.getArmourValue());
		System.out.print(", Weight: " + armour.getWeight());
		System.out.println(", Value: " + armour.getValue());
	}
	public void shieldInfo(Shield shield) {
		System.out.print("Name: " + shield.getName());
		System.out.print(", Armor: " + shield.getArmourValue());
		System.out.print(", Weight: " + shield.getWeight());
		System.out.println(", Value: " + shield.getValue());
	}
	
	public void equipmentInfo(Creature player) {
		boolean managingEq = true;
		while (managingEq == true)
		{
			System.out.println("1-weapon, 2-armour, 3-shield, 0-exit");
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
			case 3: {
				if(player.getCurrentShield() != null)
					shieldInfo(player.getCurrentShield());
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
	
	public void shop(Creature player, Weapon weapon, Armour armor, Shield shield, HealingPotion healingPotion) {
		boolean choiceInShop = true;
		
		System.out.println("");
		System.out.println("Welcome in my shop, how can i help you");
		while(choiceInShop == true) {
			System.out.println("1-buy, 2-sell, 9-Your eqiupment, 0-leave shop");
			switch(choiceMethod()) {
			case 1: {
				buyAction(player, choiceInShop, weapon, armor, shield, healingPotion);
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
	
	public void buyAction(Creature player, boolean choiceInShop, Weapon weapon, Armour armor, Shield shield, HealingPotion healingPotion) {
		String shopKeeperDialogue = "What would you like to buy?";
		
		while(choiceInShop == true) {			
			System.out.println(shopKeeperDialogue);
			if(weapon.getQuantity() >= 1) {
				System.out.println("1-" + weapon.getName() + " damage: " + weapon.getMinDamage() + "-" + weapon.getMaxDamage() + " price: " + weapon.getValue());
			}
			if(armor.getQuantity() >= 1) {
				System.out.println("2-" + armor.getName() + " armour: "+ armor.getArmourValue() + " price: " + armor.getValue());
			}
			if(shield.getQuantity() >= 1) {
				System.out.println("3-" + shield.getName() + " armour: "+ shield.getArmourValue() + " price: " + shield.getValue());
			}
			if(healingPotion.getQuantity() >= 1) {
				System.out.println("4-" + healingPotion.getName() + " base healing power: " + healingPotion.getHealValue() + " price: " + healingPotion.getValue());
			}
			System.out.print("9-Your eqiupment,");
			System.out.println(" 0-back");
			System.out.println("Your gold: " + player.getGold());
			switch(choiceMethod()) {
			case 1:	{
				if(player.getCurrentWeapon() == null) {
					if(weapon.getQuantity() == 0)
						System.out.println("Sorry, weapons sold");
					else if(weapon.getValue() >= player.getGold())
						System.out.println("Sorry, you've got not enough gold");
					if(weapon.getQuantity() >= 1 && player.getGold() >= weapon.getValue()) {
						player.setCurrentWeapon(weapon); 
						weapon.setQuantity(weapon.getQuantity() - 1);
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
					if(armor.getQuantity() == 0)
						System.out.println("Sorry, armours sold");
					else if(armor.getValue() >= player.getGold())
						System.out.println("Sorry, you've got not enough gold");
					if(armor.getQuantity() >= 1 && player.getGold() >= armor.getValue()) {
						player.setCurrentArmour(armor);
						armor.setQuantity(armor.getQuantity() - 1);
						player.setGold(player.getGold() - armor.getValue());
						System.out.println("You bought " + armor.getName());
				}
				}
				else
					System.out.println("Sell your current armour");
				break;
				}
			case 3: {		
				if(player.getCurrentShield() == null) {
					if(shield.getQuantity()== 0)
						System.out.println("Sorry, shields sold");
					else if(shield.getValue() >= player.getGold())
						System.out.println("Sorry, you've got not enough gold");
					if(shield.getQuantity() >= 1 && player.getGold() >= shield.getValue()) {
						player.setCurrentShield(shield);
						shield.setQuantity(shield.getQuantity() - 1);
						player.setGold(player.getGold() - shield.getValue());
						System.out.println("You bought " + shield.getName());
				}
				}
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
			System.out.println("\nWhat would you like to sell?");
			System.out.println("1-weapon , 2-armour, 3-shield, 9-Your equipment, 0-back");
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
			case 3: {
				if(player.getCurrentShield() != null) {
					Shield shield = player.getCurrentShield();
					int value = (int) shield.getValue()/2;
					player.setGold(player.getGold() + value);
					System.out.println("You sold your shield for " + value + " gold");
					player.setCurrentShield(null);
					break;				
				}
				else {
					System.out.println("You have no shield to sell");
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
	
	
//End of shops
	
//Battle mechanics
	
	public int isActionSuccessful(Creature attacker, Creature defender) {
		int successRate = 0;
		successRate = (int) (Math.random() * 100) + attacker.getAttackRate() - defender.getDefenseRate();
		return successRate;
	}
	
	public void battle(Creature player, Creature enemy) {
		boolean loop = true;
		characterInfo(enemy);
		System.out.println("You have been attacked by " + enemy.getName());
		
		while(loop) {
			int damage = 0;
			int heal = 0;
			int gold = 0;
			int armor = 0;
				
			System.out.println("Choose action");
			System.out.println("1-attack, 2-Use special power, 3-Use healing potion");
			
			switch(choiceMethod()) {
			case 1: {
				damage = player.attack(enemy, player.getCurrentWeapon());
				break;
			}
			case 2: {
				damage = player.offensiveSkill(enemy, player.getCurrentWeapon());
				break;
			}
			case 3: {
				heal = player.useHealingPotion(player.getHealingPotion(), player.getVitality(), player.getWillpower());
				player.setCurrentHitPoints(Math.min(player.getMaxHitPoints(), (player.getCurrentHitPoints() + heal)));
				break;
			}
			}
			
			if(50 < isActionSuccessful(player, enemy)) {
				System.out.println("You swing your weapon and hit " + enemy.getName());
				if(enemy.getCurrentArmour() != null) {
					armor = armor + enemy.getCurrentArmour().getArmourValue();
				}
				if(enemy.getCurrentShield() != null) {
					armor = armor + enemy.getCurrentShield().getArmourValue();
				}
					damage = damage - armor;
					enemy.setCurrentHitPoints(enemy.getCurrentHitPoints() - damage);
					System.out.println("You have dealt " + damage + " to " + enemy.getName());
					System.out.println(enemy.getName() + " has " + enemy.getCurrentHitPoints() + " hit points.\n");
			}
			else {
				System.out.println("You missed " + enemy.getName());
			}
			
			if(50 < isActionSuccessful(enemy, player)) {	
				armor = 0;
				System.out.println(enemy.getName() + " swings his weapon and hits you");
				if(player.getCurrentArmour() != null) {
					armor = armor + player.getCurrentArmour().getArmourValue();
				}
				if(player.getCurrentShield() != null) {
					armor = armor + player.getCurrentShield().getArmourValue();
				}
				damage = enemy.attack(player, enemy.getCurrentWeapon());
				damage = damage - armor;
				player.setCurrentHitPoints(player.getCurrentHitPoints() - damage);
				System.out.println(enemy.getName() + " dealt " + damage + " to you.");
				System.out.println(player.getName() + " has " + player.getCurrentHitPoints() + "/" + player.getMaxHitPoints() + " hit points.\n");
			}
			else {
				System.out.println(enemy.getName() + " misses you");
			}
			
			if(enemy.getCurrentHitPoints() < 1) {
				System.out.println("You won battle with " + enemy.getName());
				loop = false;
				gold = enemy.getGold();
				player.setGold(player.getGold() + gold);
				System.out.println("you found " + gold + " gold");
			}
			if(player.getCurrentHitPoints() < 1) {
				System.out.println("You lost battle with " + enemy.getName());
				loop = false;
			}
		}
	}
	
// End of battle mechanics
			
	public void startGame() {
		difficultyInstance diff = setDifficulty();
		Creature player;
		boolean loop = true;
		
		player = createCharacter(diff);
		System.out.println("\nYou are standing in main square of a small town");
		while(loop) {
		
		Weapon weapon;
		Armour armor;
		Shield shield;
		HealingPotion healingPotion;
		
		weapon = createWeapon(diff.getItemLevel());
		armor = createArmour(diff.getItemLevel());
		shield = createShield(diff.getItemLevel());
		healingPotion = createHealingPotion(diff.getItemLevel());
		weapon.setQuantity((int) (Math.random() * 10) + 1);
		armor.setQuantity((int) (Math.random() * 3) + 1);
		shield.setQuantity((int) (Math.random() * 7) + 1);
		healingPotion.setQuantity((int) (Math.random() * 5) + 2);
		loop = true;
		while(loop) {
		System.out.println("What would you like to do");
		System.out.println("1-Visit shop, 2-Patrol around the town");
		switch(choiceMethod()) {
		case 1: {
			
			shop(player, weapon, armor, shield, healingPotion);
			break;
		}
		case 2: {
			System.out.println(diff.getEnemyLevel());
			Creature enemy = createGoblin("goblin", 1 * diff.getEnemyLevel() + 2, 3 * diff.getEnemyLevel(), 3 * diff.getEnemyLevel(), 1 * diff.getEnemyLevel(),
					1 * diff.getEnemyLevel(), 8, 4, diff.getItemLevel() + 1);	
			battle(player, enemy);
			break;
		}
		}
		if(player.getCurrentHitPoints() < 1) {
			System.out.println("Game over");
			loop = false;
	}
		
		}
	}
	}

//Difficulty settings
	
	class difficultyInstance {
		private int itemLevel, gold, attributePoints, enemyLevel;
		difficultyInstance(int itemLevel, int gold, int attributePoints, int enemyLevel){
			this.itemLevel = itemLevel;
			this.enemyLevel = enemyLevel;
			this.gold = gold;
			this.attributePoints = attributePoints;
		}
	public int getItemLevel() {
		return this.itemLevel;
	}
	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	public int getEnemyLevel() {
		return this.enemyLevel;
	}
	public void setEnemyLevel(int enemyLevel) {
		this.enemyLevel = enemyLevel;
	}
	}
	
//End of difficulty settings
}
