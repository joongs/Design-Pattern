package duck.strategy.pattern;

public class RedheadDuck extends Duck{

	public RedheadDuck() {
		super();
	}
	
	public RedheadDuck(String name) {
		this.name = name;
	}

	@Override
	public String display() {
		return "RedheadDuck";
	}
}