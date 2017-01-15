package duck.strategy.pattern;

import flyBehavior.strategy.pattern.FlyNoWay;
import quackBehavior.strategy.pattern.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super();
		this.quackBehavior = new MuteQuack();
		this.flyBehavior = new FlyNoWay();
	}
	
	public ModelDuck(String name) {
		this.name = name;
		this.quackBehavior = new MuteQuack();
		this.flyBehavior = new FlyNoWay();
	}

	@Override
	public String display() {
		return "ModelDuck";
	}
}
