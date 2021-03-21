package rPGame;

import rPGame.Item.Armour;
import rPGame.Item.Weapon;

public class Creature {
	String name;
	protected int strength, dexterity, vitality, willpower, inteligence;
	protected int maxHitPoints, maxEnergy, attackRate, defenseRate, moveSpeed, currentHitPoints, currentEnergy, gold;
	protected Weapon weapon;
	protected Armour armour;

	
class BattlePriest extends Creature implements SpecialPower {
	BattlePriest(String name, int strength, int dexterity, int vitality, int willpower, int inteligence,
			int moveSpeed){
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.vitality = vitality;
		this.willpower = willpower;
		this.inteligence = inteligence;
		this.maxHitPoints = maxHitPoints;
		this.currentHitPoints = maxHitPoints;
		this.maxEnergy = maxEnergy;
		this.currentEnergy = maxEnergy;
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.moveSpeed = moveSpeed;
		this.weapon = null;
		this.armour = null;
		this.gold = 0;
	}
	@Override
	public int skill(int damage) {
		System.out.println("Skill used 2");
		return damage;
	}
}
class Warrior extends Creature implements SpecialPower {
	Warrior(String name, int strength, int dexterity, int vitality, int willpower, int inteligence,
			int moveSpeed){
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.vitality = vitality;
		this.willpower = willpower;
		this.inteligence = inteligence;
		this.maxHitPoints = maxHitPoints;
		this.currentHitPoints = maxHitPoints;
		this.maxEnergy = maxEnergy;
		this.currentEnergy = maxEnergy;
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.moveSpeed = moveSpeed;
		this.weapon = null;
		this.armour = null;
		this.gold = 0;
	}
	@Override
	public int skill(int damage) {
		System.out.println("Skill used 2");
		return damage;
	}
}

class Goblin extends Creature {
	Goblin(String name, int strength, int dexterity, int vitality, int willpower, int inteligence,
			int moveSpeed){
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.vitality = vitality;
		this.willpower = willpower;
		this.inteligence = inteligence;
		this.maxHitPoints = maxHitPoints;
		this.currentHitPoints = maxHitPoints;
		this.maxEnergy = maxEnergy;
		this.currentEnergy = maxEnergy;
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.moveSpeed = moveSpeed;
		this.weapon = null;
		this.armour = null;
		this.gold = 0;
	}
}
class GoblinRaider extends Creature {
	GoblinRaider(String name, int strength, int dexterity, int vitality, int willpower, int inteligence,
			int moveSpeed){
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.vitality = vitality;
		this.willpower = willpower;
		this.inteligence = inteligence;
		this.maxHitPoints = maxHitPoints;
		this.currentHitPoints = maxHitPoints;
		this.maxEnergy = maxEnergy;
		this.currentEnergy = maxEnergy;
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.moveSpeed = moveSpeed;
		this.weapon = null;
		this.armour = null;
		this.gold = 0;
	}
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
}

