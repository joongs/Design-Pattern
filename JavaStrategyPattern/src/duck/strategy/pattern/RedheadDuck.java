package duck.strategy.pattern;

import flyBehavior.strategy.pattern.FlyWithWings;
import quackBehavior.strategy.pattern.Quack;

public class RedheadDuck extends Duck{

	public RedheadDuck() {
		super();
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
	
	public RedheadDuck(String name) {
		this.name = name;
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}

	public String display() {
		return "RedheadDuck";
	}
}