package flyBehavior.strategy.pattern;

public class FlyNoWay implements FlyBehavior {

	@Override
	public String fly() {
		return "can't fly";
	}
}
