package quackBehavior.strategy.pattern;

public class Quack implements QuackBehavior {

	@Override
	public String quack() {
		return "quack quack";
	}
}
