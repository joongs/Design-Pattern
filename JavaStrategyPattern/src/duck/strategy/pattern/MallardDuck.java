package duck.strategy.pattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		this.quackBehavior = new Quack();
	}
	
	public MallardDuck(String name) {
		this.name = name;
		this.quackBehavior = new Quack();
	}

	public String display() {
		return "MallardDuck";
	}
}