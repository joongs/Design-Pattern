package duck.strategy.pattern;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		super();
	}
	
	public DecoyDuck(String name) {
		this.name = name;
	}
	
	@Override
	public String quack() {
		return "can't quack quack";
	}
	
	@Override
	public String display() {
		return "DecoyDuck";
	}
	
	@Override
	public String fly() {
		return "can't fly";
	}
}
