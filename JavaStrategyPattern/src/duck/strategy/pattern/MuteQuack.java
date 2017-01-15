package duck.strategy.pattern;

public class MuteQuack implements QuackBehavior {

	@Override
	public String quack() {
		return "can't quack quack";
	}
}
