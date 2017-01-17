package test.strategy.pattern;

import weapon.strategy.pattern.WeaponBehavior;

public class Knife implements WeaponBehavior {

	@Override
	public String use() {
		return "knife";
	}
}
