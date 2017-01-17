package character.strategy.pattern;

import weapon.strategy.pattern.WeaponBehavior;

public class Character {
	
	WeaponBehavior weapon;

	protected String name;

	public Character() {
		super();
	}

	public String getName() {
		return name;
	}

	public String fight() {
		return weapon.use();
	}

	public void setWeaponBehavior(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}