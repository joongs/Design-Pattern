package duck.strategy.pattern;

import flyBehavior.strategy.pattern.FlyNoWay;
import quackBehavior.strategy.pattern.Squeak;

public class RubberDuck extends Duck{

	public RubberDuck() {
		super();
		this.quackBehavior = new Squeak();
		this.flyBehavior = new FlyNoWay();
	}
	
	public RubberDuck(String name) {
		this.name = name;
		this.quackBehavior = new Squeak();
		this.flyBehavior = new FlyNoWay();
	}

	@Override
	public String display() {
		return "RubberDuck";
	}
}
