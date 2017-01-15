package duck.strategy.pattern;

public class FlyWithWings implements flyBehavior {

	@Override
	public String fly() {
		return "can fly";
	}
}
