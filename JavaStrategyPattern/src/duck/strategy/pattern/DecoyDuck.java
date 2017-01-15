package duck.strategy.pattern;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		super();
		this.quackBehavior = new MuteQuack();
		this.flyBehavior = new FlyNoWay();
	}
	
	public DecoyDuck(String name) {
		this.name = name;
		this.quackBehavior = new MuteQuack();
		this.flyBehavior = new FlyNoWay();
	}
	
	@Override
	public String display() {
		return "DecoyDuck";
	}
}
