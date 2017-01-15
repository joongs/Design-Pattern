package duck.strategy.pattern;

public class FlyNoWay implements flyBehavior {

	@Override
	public String fly() {
		return "can't fly";
	}
}
