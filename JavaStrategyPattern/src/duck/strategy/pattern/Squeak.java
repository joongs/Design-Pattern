package duck.strategy.pattern;

public class Squeak implements QuackBehavior {

	@Override
	public String quack() {
		return "bbic bbic";
	}
}
