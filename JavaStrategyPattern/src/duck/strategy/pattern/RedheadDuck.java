package duck.strategy.pattern;

public class RedheadDuck {

	String name;
	
	public RedheadDuck() {
		this.name= "no name";
	}
	
	public RedheadDuck(String name) {
		this.name = name;
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
		return "RedheadDuck";
	}
}
