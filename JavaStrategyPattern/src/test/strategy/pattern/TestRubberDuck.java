package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.Duck;
import duck.strategy.pattern.RubberDuck;
import flyBehavior.strategy.pattern.FlyWithWings;

public class TestRubberDuck {

	@Test
	public void shouldIdentifyNameWhenNotGiveName() {
		//arrange
		Duck duck = new RubberDuck();
		//act
		String name = duck.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldIdentifyNameWhenGiveName() {
		//arrange
		Duck duck = new RubberDuck("RBD");
		//act
		String name = duck.getName();
		//assert
		assertEquals("RBD", name);
	}
	
	@Test
	public void shouldCryWhenCallQuack() {
		//arrange
		Duck duck = new RubberDuck("RBD");
		//act
		//String sound = duck.quack();
		String sound = duck.performQuack();
		//assert
		assertEquals("bbic bbic", sound);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		Duck duck = new RubberDuck("RBD");
		//act
		String swim = duck.swim();
		//assert
		assertEquals("can swimming", swim);
	}
	
	@Test
	public void shouldShowShapeWhenCallDisplay() {
		//arrange
		Duck duck = new RubberDuck("RBD");
		//act
		String display = duck.display();
		//assert
		assertEquals("RubberDuck", display);
	}
	
	@Test
	public void shouldFlyWhenCallFly() {
		//arrange
		Duck duck = new RubberDuck("RBD");
		//act
		String fly = duck.performFly();
		//assert
		assertEquals("can't fly", fly);
	}
	
	@Test
	public void sholudFlyWhenSetFlyBehavior() {
		//arrange
		Duck duck = new RubberDuck("RBD");
		//act
		String flyBefore = duck.performFly();
		duck.SetFlyBehavior(new FlyWithWings());
		String flyAfter = duck.performFly();
		//assert
		assertEquals("can't fly", flyBefore);
		assertEquals("can fly", flyAfter);
		assertNotEquals(flyBefore, flyAfter);
	}
}
