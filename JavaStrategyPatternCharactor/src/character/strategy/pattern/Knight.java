package character.strategy.pattern;

import weapon.strategy.pattern.Axo;

public class Knight extends Character{

	public Knight() {
		this.name = "no name";
		this.weaponBehavior = new Axo();
	}

	public Knight(String name) {
		this.name = name;
		this.weaponBehavior = new Axo();
	}
}
