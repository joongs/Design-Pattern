package duck.strategy.pattern;

public abstract class Duck {

	protected String name;
	
	public Duck() {
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
	
	public abstract String display();

}