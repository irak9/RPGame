package rPGame;

public class Item {

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
	
	
	class Weapon extends Item {
		
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
	
	
	int minDamage, maxDamage, range;
	
		Weapon(int minDamage, int maxDamage, int range, int weight, int quantity, int value){
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
		Armour(int armour, int weight, int quantity, int value){
			this.armour = armour;
			this.weight = weight;
			this.quantity = quantity;
			this.value = value;
		}
	}
	
}