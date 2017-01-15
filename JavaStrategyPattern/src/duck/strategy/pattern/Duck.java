package duck.strategy.pattern;

import flyBehavior.strategy.pattern.FlyBehavior;
import quackBehavior.strategy.pattern.QuackBehavior;

public abstract class Duck {

	protected String name;
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
	
	public Duck() {
		this.name = "no name";
	}

	public String getName() {
		return name;
	}

	public String swim() {
		return "can swimming";
	}
	
	public abstract String display();

	public String performQuack() {
		return quackBehavior.quack();
	}

	public String performFly() {
		return flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}