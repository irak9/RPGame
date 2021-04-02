package rPGame;

public abstract class Creature implements SpecialPower{
	String name;
	protected int strength, dexterity, vitality, willpower, inteligence, actionPoints;
	protected int maxHitPoints, maxEnergy, attackRate, defenseRate, moveSpeed, currentHitPoints, currentEnergy, gold;
	protected Weapon weapon;
	protected Armour armour;
	protected Shield shield;
	protected HealingPotion healingPotion;

	public int attack(Creature creature, Weapon weapon) {
		int damage = 0;
		if(creature.getCurrentWeapon() != null) {
		damage = (int) ((Math.random() * weapon.getMaxDamage()) + weapon.getMinDamage() + 1) + creature.getStrength() / 4;
		}
		else {
			damage = creature.getStrength() / 4 + 1;
		}
		return  damage;
	}
	public int useHealingPotion(HealingPotion healingPotion, int vitAttribute, int willAttribute) {
		return (int) (Math.random() * (healingPotion.getHealValue() / 3 * willAttribute)) + willAttribute + vitAttribute * healingPotion.getHealValue() / 3;
	}
	
public int getStrength() {
	return this.strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
public int getDexterity() {
	return this.dexterity;
}
public void setDexterity(int dexterity) {
	this.dexterity = dexterity;
}
public int getVitality() {
	return this.vitality;
}
public void setVitality(int vitality) {
	this.vitality = vitality;
}
public int getWillpower() {
	return this.willpower;
}
public void setWillpower(int willpower) {
	this.willpower = willpower;
}
public int getActionPoints() {
	return this.actionPoints;
}
public void setActionPoints(int actionPoints) {
	this.actionPoints = actionPoints;
}
public int getInteligence() {
	return this.inteligence;
}
public void setInteligence(int inteligence) {
	this.inteligence = inteligence;
}
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}
public int getMaxHitPoints() {
	return this.maxHitPoints;
}
public void setMaxHitPoints(int maxHitPoints) {
	this.maxHitPoints = maxHitPoints;
}
public int getMaxEnergy() {
	return this.maxEnergy;
}
public void setMaxEnergy(int maxEnergy) {
	this.maxEnergy = maxEnergy;
}
public int getCurrentHitPoints() {
	return this.currentHitPoints;
}
public void setCurrentHitPoints(int currentHitPoints) {
	this.currentHitPoints = currentHitPoints;
}
public int getCurrentEnergy() {
	return this.currentEnergy;
}
public void setCurrentEnergy(int currentEnergy) {
	this.currentEnergy = currentEnergy;
}
public int getAttackRate() {
	return this.attackRate;
}
public void setAttackRate(int attackRate) {
	this.attackRate = attackRate;
}
public int getDefenseRate() {
	return this.defenseRate;
}
public void setDefenseRate(int defenseRate) {
	this.defenseRate = defenseRate;
}
public int getMoveSpeed() {
	return this.moveSpeed;
}
public void setMoveSpeed(int moveSpeed) {
	this.moveSpeed = moveSpeed;
}
public int getGold() {
	return this.gold;
}
public void setGold(int gold) {
	this.gold = gold;
}
public Weapon getCurrentWeapon() {
	return this.weapon ;
}
public void setCurrentWeapon(Weapon weapon) {
	this.weapon = weapon;
}
public Armour getCurrentArmour() {
	return this.armour;
}
public void setCurrentArmour(Armour armour) {
	this.armour = armour;
}
public Shield getCurrentShield() {
	return this.shield;
}
public void setCurrentShield(Shield shield) {
	this.shield = shield;
}
public HealingPotion getHealingPotion() {
	return this.healingPotion;
}
public void setHealingPotion(HealingPotion healingPotion) {
	this.healingPotion = healingPotion;
}
@Override
public int offensiveSkill(Creature creature, Weapon weapon) {
	// TODO Auto-generated method stub
	return 0;
}
	
}



class BattlePriest extends Creature {
BattlePriest(String name, int strength, int dexterity, int vitality, int willpower, int inteligence, int actionPoints,
		int moveSpeed){
	super();
	this.name = name;
	this.strength = strength;
	this.dexterity = dexterity;
	this.vitality = vitality;
	this.willpower = willpower;
	this.inteligence = inteligence;
	this.actionPoints = actionPoints;
	this.maxHitPoints = maxHitPoints;
	this.currentHitPoints = maxHitPoints;
	this.maxEnergy = maxEnergy;
	this.currentEnergy = maxEnergy;
	this.attackRate = attackRate;
	this.defenseRate = defenseRate;
	this.moveSpeed = moveSpeed;
	this.weapon = null;
	this.armour = null;
	this.shield = null;
	this.healingPotion = null;
	this.gold = 0;
}
@Override
public int offensiveSkill(Creature player, Weapon weapon) {
	int damage = 0;
	System.out.println("Battle Priest SKill"); 
	if(player.getCurrentWeapon() != null) {
		damage = player.getWillpower() * 7 + weapon.getMaxDamage() * 2;
	}
	else {
		damage = player.getWillpower() * 7;
	}
	return damage;
}

}
class Warrior extends Creature {
Warrior(String name, int strength, int dexterity, int vitality, int willpower, int inteligence, int actionPoints,
		int moveSpeed){
	this.name = name;
	this.strength = strength;
	this.dexterity = dexterity;
	this.vitality = vitality;
	this.willpower = willpower;
	this.inteligence = inteligence;
	this.actionPoints = actionPoints;
	this.maxHitPoints = maxHitPoints;
	this.currentHitPoints = maxHitPoints;
	this.maxEnergy = maxEnergy;
	this.currentEnergy = maxEnergy;
	this.attackRate = attackRate;
	this.defenseRate = defenseRate;
	this.moveSpeed = moveSpeed;
	this.weapon = null;
	this.armour = null;
	this.shield = null;
	this.healingPotion = null;
	this.gold = 0;
}
@Override
public int offensiveSkill(Creature player, Weapon weapon) {
	int damage = 0;
	System.out.println("Warrior Skill");
	if(player.getCurrentWeapon() != null) {
		damage = (int) (player.getStrength() * 2 + Math.random() * 8) + weapon.getMinDamage() * 2;
	}
	else {
		damage = (int) (player.getStrength() * 2 + Math.random() * 8);
	}
	return damage;
}
}

class Goblin extends Creature {
Goblin(String name, int strength, int dexterity, int vitality, int willpower, int inteligence, int actionPoints,
		int moveSpeed){
	this.name = name;
	this.strength = strength;
	this.dexterity = dexterity;
	this.vitality = vitality;
	this.willpower = willpower;
	this.inteligence = inteligence;
	this.actionPoints = actionPoints;
	this.maxHitPoints = vitality * 3 + strength;
	this.currentHitPoints = maxHitPoints;
	this.maxEnergy = willpower;
	this.currentEnergy = maxEnergy;
	this.attackRate = dexterity;
	this.defenseRate = dexterity;
	this.moveSpeed = moveSpeed;
	this.weapon = null;
	this.armour = null;
	this.shield = null;
	this.gold = (int) (Math.random() * 4) + 1;
}
}
class GoblinRaider extends Creature {
GoblinRaider(String name, int strength, int dexterity, int vitality, int willpower, int inteligence, int actionPoints,
		int moveSpeed){
	this.name = name;
	this.strength = strength;
	this.dexterity = dexterity;
	this.vitality = vitality;
	this.willpower = willpower;
	this.inteligence = inteligence;
	this.actionPoints = actionPoints;
	this.maxHitPoints = vitality * 8 + strength * 6;
	this.currentHitPoints = maxHitPoints;
	this.maxEnergy = willpower;
	this.currentEnergy = maxEnergy;
	this.attackRate = strength * 4 + dexterity;
	this.defenseRate = dexterity * 2;
	this.moveSpeed = moveSpeed;
	this.weapon = null;
	this.armour = null;
	this.shield = null;
	this.gold = (int) (Math.random() * 20) + 10;
}
}
