package character.strategy.pattern;

import weapon.strategy.pattern.Sword;

public class King extends Character {

	public King() {
		this.name = "no name";
		this.weaponBehavior = new Sword();
	}
	
	public King(String name) {
		this.name = name;
		this.weaponBehavior = new Sword();
	}
}
