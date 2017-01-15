package duck.strategy.pattern;

import flyBehavior.strategy.pattern.flyBehavior;
import quackBehavior.strategy.pattern.QuackBehavior;

public abstract class Duck {

	protected String name;
	protected QuackBehavior quackBehavior;
	protected flyBehavior flyBehavior;
	
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
}