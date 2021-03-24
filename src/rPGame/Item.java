package rPGame;

public abstract class Item implements Cloneable {
	String name;
	int weight, quantity, value;
	
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
	
	class Weapon extends Item {
		int minDamage, maxDamage, range;
		
	public int getMinDamage() {
		return this.minDamage;
	}
	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}
	public int getMaxDamage() {
		return this.maxDamage;
	}
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}	
	public int getRange() {
		return this.range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	
		Weapon(String name, int minDamage, int maxDamage, int range, int weight, int quantity, int value){
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.range = range;
		this.weight = weight;
		this.quantity = quantity;
		this.value = value;
		}
	}
	
	
	class Armour extends Item{
		int armour;
		
		public int getArmourValue() {
			return this.armour;
		}
		public void setArmourValue(int armour) {
			this.armour = armour;
		}
		
		Armour(String name, int armour, int weight, int quantity, int value){
			this.name = name;
			this.armour = armour;
			this.weight = weight;
			this.quantity = quantity;
			this.value = value;
		}
	}
	
	class Shield extends Item {
		int armour;
		
		public int getArmourValue() {
			return this.armour;
		}
		public void setArmourValue(int armour) {
			this.armour = armour;
		}
		
		Shield(String name, int armour, int weight, int quantity, int value){
			this.name = name;
			this.armour = armour;
			this.weight = weight;
			this.quantity = quantity;
			this.value = value;
		
	}
}
	
	class HealingPotion extends Item {
		int healValue;
		
		public int getHealValue() {
			return this.healValue;
		}
		public void setHealValue(int healValue) {
			this.healValue = healValue;
		}
		
		HealingPotion(String name, int healValue, int weight, int quantity, int value){
			this.name = name;
			this.healValue = healValue;
			this.weight = weight;
			this.quantity = quantity;
			this.value = value;
		}
		
	}
	
	
