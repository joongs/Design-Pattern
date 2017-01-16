package character.strategy.pattern;

import weapon.strategy.pattern.WeaponBehavior;

public class Character {
	
	WeaponBehavior weaponBehavior;

	protected String name;

	public Character() {
		super();
	}

	public String getName() {
		return name;
	}

	public String fight() {
		return weaponBehavior.use();
	}

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
}