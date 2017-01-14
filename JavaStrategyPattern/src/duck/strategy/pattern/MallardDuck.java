package duck.strategy.pattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
	}
	
	public MallardDuck(String name) {
		this.name = name;
	}

	public String display() {
		return "MallardDuck";
	}
}