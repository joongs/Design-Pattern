package duck.strategy.pattern;

public class RubberDuck extends Duck{

	public RubberDuck() {
		super();
	}
	
	public RubberDuck(String name) {
		this.name = name;
	}

	@Override
	public String quack() {
		return "bbic bbic";
	}
	
	public String display() {
		return "RubberDuck";
	}
	
	@Override
	public String fly() {
		return "can't fly";
	}

}
