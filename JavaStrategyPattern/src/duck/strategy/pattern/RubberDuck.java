package duck.strategy.pattern;

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

	public String display() {
		return "RubberDuck";
	}
}
