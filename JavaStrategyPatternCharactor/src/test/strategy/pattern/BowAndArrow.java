package test.strategy.pattern;

import weapon.strategy.pattern.WeaponBehavior;

public class BowAndArrow implements WeaponBehavior {

	@Override
	public String use() {
		return "bow and arrow";
	}

}
