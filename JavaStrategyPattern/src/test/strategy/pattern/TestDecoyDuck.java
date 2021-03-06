package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.DecoyDuck;
import duck.strategy.pattern.Duck;
import flyBehavior.strategy.pattern.FlyWithWings;
import quackBehavior.strategy.pattern.Quack;

public class TestDecoyDuck {

	@Test
	public void sholudCreateDecoyDuckWhenNotGivaName() {
		//arrange
		Duck duck = new DecoyDuck();
		//act
		String name = duck.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldCreateDecoyDuckWhenGiveName() {
		//arrange
		Duck duck = new DecoyDuck("DD");
		//act
		String name = duck.getName();
		//assert
		assertEquals("DD", name);
	}
	
	@Test
	public void shouldCryWhenCallQuack() {
		//arrange
		Duck duck = new DecoyDuck("DD");
		//act
		String sound = duck.performQuack();
		//assert
		assertEquals("can't quack quack", sound);		
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		Duck duck = new DecoyDuck("DD");
		//act
		String swim = duck.swim();
		//assert
		assertEquals("can swimming", swim);
	}
	
	@Test
	public void shouldShowShapeWhenCallDisplay() {
		//arrange
		Duck duck = new DecoyDuck("DD");
		//act
		String display = duck.display();
		//assert
		assertEquals("DecoyDuck", display);
	}
	
	@Test
	public void shouldFlyWhenCallFly() {
		//arrange
		Duck duck = new DecoyDuck("DD");
		//act
		String fly = duck.performFly();
		//assert
		assertEquals("can't fly", fly);
	}
	
	@Test
	public void sholudFlyWhenCallSetFlyBehavior() {
		//arrange
		Duck duck = new DecoyDuck("DD");
		//act
		String flyBefore = duck.performFly();
		duck.setFlyBehavior(new FlyWithWings());
		String flyAfter = duck.performFly();
		//assert
		assertEquals("can't fly", flyBefore);
		assertEquals("can fly", flyAfter);
		assertNotEquals(flyBefore, flyAfter);
	}
	
	@Test
	public void shouldQuackWhenCallSetQuackBehavior() {
		//arrange
		Duck duck = new DecoyDuck("DD");
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
