package weapon.strategy.pattern;

public class Sword implements WeaponBehavior {

	@Override
	public String use() {
		return "sword";
	}

}
