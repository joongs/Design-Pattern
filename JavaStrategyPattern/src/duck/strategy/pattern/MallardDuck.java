package duck.strategy.pattern;

import flyBehavior.strategy.pattern.FlyWithWings;
import quackBehavior.strategy.pattern.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
	
	public MallardDuck(String name) {
		this.name = name;
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}

	public String display() {
		return "MallardDuck";
	}
}