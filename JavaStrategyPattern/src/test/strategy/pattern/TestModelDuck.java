package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.Duck;
import duck.strategy.pattern.ModelDuck;
import flyBehavior.strategy.pattern.FlyRocketPowered;
import quackBehavior.strategy.pattern.Quack;

public class TestModelDuck {

	@Test
	public void sholudCreateModelDuckWhenNotGivaName() {
		//arrange
		Duck duck = new ModelDuck();
		//act
		String name = duck.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldCreateModelDuckWhenGiveName() {
		//arrange
		Duck duck = new ModelDuck("MD");
		//act
		String name = duck.getName();
		//assert
		assertEquals("MD", name);
	}
	
	@Test
	public void shouldCryWhenCallQuack() {
		//arrange
		Duck duck = new ModelDuck("MD");
		//act
		String quack = duck.performQuack();
		//assert
		assertEquals("can't quack quack", quack);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		Duck duck = new ModelDuck("MD");
		//act
		String swim = duck.swim();
		//assert
		assertEquals("can swimming", swim);
	}
	
	@Test
	public void shouldShowShapeWhenCallDisplay() {
		//arrange
		Duck duck = new ModelDuck("MD");
		//act
		String display = duck.display();
		//assert
		assertEquals("ModelDuck", display);
	}
	
	@Test
	public void shouldFlyWhenSetFlyBehavior() {
		//arrange
		Duck duck = new ModelDuck("MD");
		//act
		String flyBefore = duck.performFly();
		duck.setFlyBehavior(new FlyRocketPowered());
		String flyAfter = duck.performFly();
		//assert
		assertEquals("can't fly", flyBefore);
		assertEquals("can fly fast", flyAfter);
		assertNotEquals(flyBefore, flyAfter);
	}
	
	@Test
	public void shouldQuackWhenSetQuackBehavior() {
		//arrange
		Duck duck = new ModelDuck("MD");
		//act
		String quackBefore = duck.performQuack();
		duck.setQuackBehavior(new Quack());
		String quackAfter = duck.performQuack();
		//assert
		assertEquals("can't quack quack", quackBefore);
		assertEquals("quack quack", quackAfter);
		assertNotEquals(quackBefore, quackAfter);
	}

}
