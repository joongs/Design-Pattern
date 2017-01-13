package duck.strategy.pattern;

public class MallardDuck {

	private String name;
	
	public MallardDuck(String name) {
		this.name = name;
	}

	public MallardDuck() {
		this.name = "no name";
	}

	public String getName() {
		return name;
	}

	public String quack() {
		return "quack quack";
	}

	public String swim() {
		return "can swimming";
	}

	public String display() {
		return "MallardDuck";
	}
}