package rPGame;

public class Creature {
	String name;
	int strength, dexterity, vitality, willpower, inteligence;
	int hitPoints, energy, attackRate, defenseRate;

	private int attack(int minDamage, int maxDamage) {
		return (int) Math.random() * (maxDamage - minDamage);
	}
	
	class Warrior extends Creature implements SpecialPower{
		Warrior(String name, int strength, int dexterity, int vitality, int willpower, int inteligence){
			this.strength = strength;
			this.dexterity = dexterity;
			this.vitality = vitality;
			this.willpower = willpower;
			this.inteligence = inteligence;
			this.hitPoints = (vitality * 8) + (strength * 3) + 20;
			this.energy = willpower * 3 + 10;
			this.attackRate = (strength * 2) + (dexterity * 3) +10;
			this.defenseRate = (dexterity * 2) + 10;
			
		}
		@Override
		public int skill() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
		class BattlePrist extends Creature implements SpecialPower{
			BattlePrist(String name, int strength, int dexterity, int vitality, int willpower, int inteligence){
				this.strength = strength;
				this.dexterity = dexterity;
				this.vitality = vitality;
				this.willpower = willpower;
				this.inteligence = inteligence;
				this.hitPoints = (vitality * 4) + (strength * 2) + 20;
				this.energy = (willpower * 5) +(inteligence * 3) + 20;
				this.attackRate = (strength * 2) + (dexterity * 1) +10;
				this.defenseRate = (dexterity * 1) + 10;
			}

			@Override
			public int skill() {
				// TODO Auto-generated method stub
				return 0;
			}
	}
	class Goblin extends Creature {
		Goblin(String name, int strength, int dexterity, int vitality, int willpower, int inteligence){
			this.strength = strength;
			this.dexterity = dexterity;
			this.vitality = vitality;
			this.willpower = willpower;
			this.inteligence = inteligence;
			this.hitPoints = (vitality * 4) + (strength * 1) + 10;
			this.energy = willpower * 1 + 5;
			this.attackRate = (strength * 1) + (dexterity * 2) +5;
			this.defenseRate = dexterity * 2;
		} 
}
}
