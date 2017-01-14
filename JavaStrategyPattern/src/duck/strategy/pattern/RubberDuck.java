package duck.strategy.pattern;

public class RubberDuck extends Duck{

	public RubberDuck(String name) {
		this.name = name;
	}

	public RubberDuck() {
		super();
	}

	@Override
	public String quack() {
		return "bbic bbic";
	}
	
	@Override
	public String display() {
		return "RubberDuck";
	}
	
	@Override
	public String fly() {
		return "can't fly";
	}

}
