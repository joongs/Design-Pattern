package flyBehavior.strategy.pattern;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public String fly() {
		return "can fly fast";
	}
}
