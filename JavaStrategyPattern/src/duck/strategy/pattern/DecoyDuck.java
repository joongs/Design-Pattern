package duck.strategy.pattern;

import flyBehavior.strategy.pattern.FlyNoWay;
import quackBehavior.strategy.pattern.MuteQuack;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		super();
		this.quackBehavior = new MuteQuack();
		this.flyBehavior = new FlyNoWay();
	}
	
	public DecoyDuck(String name) {
		this.name = name;
		this.quackBehavior = new MuteQuack();
		this.flyBehavior = new FlyNoWay();
	}
	
	@Override
	public String display() {
		return "DecoyDuck";
	}
}
