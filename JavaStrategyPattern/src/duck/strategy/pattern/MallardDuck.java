package duck.strategy.pattern;

public class MallardDuck extends Duck {

	public MallardDuck(String name) {
		this.name = name;
	}

	public MallardDuck() {
		super();
	}

	public String display() {
		return "MallardDuck";
	}
}