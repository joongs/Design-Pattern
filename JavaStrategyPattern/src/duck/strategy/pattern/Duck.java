package duck.strategy.pattern;

public abstract class Duck {

	protected String name;
	protected QuackBehavior quackBehavior;
	
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

	public String fly() {
		return "can fly";
	}

	public String performQuack() {
		return quackBehavior.quack();
	}
}