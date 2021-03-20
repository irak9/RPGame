package rPGame;

public class Creature {
	String name;
	protected int strength, dexterity, vitality, willpower, inteligence;
	protected int hitPoints, energy, attackRate, defenseRate, moveSpeed, currentHitPoints, currentEnergy;

	public int attack(int minDamage, int maxDamage) {
		return (int) Math.random() * (maxDamage - minDamage);
		
	}
	
class BattlePriest extends Creature implements SpecialPower {
	BattlePriest(String name, int strength, int dexterity, int vitality, int willpower, int inteligence,
			int moveSpeed){
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.vitality = vitality;
		this.willpower = willpower;
		this.inteligence = inteligence;
		this.hitPoints = (vitality * 10) + (strength * 2) + 40;
		this.currentHitPoints = hitPoints;
		this.energy = (willpower * 4) + 20;
		this.currentEnergy = energy;
		this.attackRate = (strength * 2);
		this.defenseRate = (dexterity * 1);
		this.moveSpeed = moveSpeed;
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
		this.hitPoints = (vitality * 7) + (strength * 4) + 60;
		this.currentHitPoints = hitPoints;this.currentEnergy = energy;
		this.energy = (willpower * 2) + 5;
		this.currentEnergy = energy;
		this.attackRate = (strength * 2) + (dexterity * 1);
		this.defenseRate = (dexterity * 2);
		this.moveSpeed = moveSpeed;
		
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
		this.hitPoints = (vitality * 4) + (strength * 2) + 10;
		this.currentHitPoints = hitPoints;
		this.energy = (willpower * 1) + 3;
		this.currentEnergy = energy;
		this.attackRate = (strength * 1) + (dexterity * 3);
		this.defenseRate = (dexterity * 2);
		this.moveSpeed = moveSpeed;
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
		this.hitPoints = (vitality * 6) + (strength * 6) + 40;
		this.currentHitPoints = hitPoints;
		this.energy = (willpower * 1) + 3;
		this.currentEnergy = energy;
		this.attackRate = (strength * 3) + (dexterity * 3);
		this.defenseRate = (dexterity * 2);
		this.moveSpeed = moveSpeed;
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
public int getHitPoints() {
	return this.hitPoints;
}
public void setHitPoints(int hitPoints) {
	this.hitPoints = hitPoints;
}
public int getEnergy() {
	return this.energy;
}
public void setEnergy(int energy) {
	this.energy = energy;
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

}

