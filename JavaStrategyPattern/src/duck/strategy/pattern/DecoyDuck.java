package duck.strategy.pattern;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		super();
		this.quackBehavior = new MuteQuack();
	}
	
	public DecoyDuck(String name) {
		this.name = name;
		this.quackBehavior = new MuteQuack();
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
