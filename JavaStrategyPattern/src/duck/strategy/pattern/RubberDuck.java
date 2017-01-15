package duck.strategy.pattern;

public class RubberDuck extends Duck{

	public RubberDuck() {
		super();
		this.quackBehavior = new Squeak();
	}
	
	public RubberDuck(String name) {
		this.name = name;
		this.quackBehavior = new Squeak();
	}

	public String display() {
		return "RubberDuck";
	}
	
	@Override
	public String fly() {
		return "can't fly";
	}
}
