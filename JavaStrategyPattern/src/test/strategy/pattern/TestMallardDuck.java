package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.Duck;
import duck.strategy.pattern.MallardDuck;
import flyBehavior.strategy.pattern.FlyNoWay;
import quackBehavior.strategy.pattern.Squeak;

public class TestMallardDuck {

	@Test
	public void shouldIdentifyNameWhenNotGiveName() {
		//arrange
		Duck duck = new MallardDuck();
		//act
		String name = duck.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldIdentifyNameWhenGiveName() {
		//arrange
		Duck duck = new MallardDuck("mDuck");
		//act
		String name = duck.getName();
		//assert
		assertEquals("mDuck", name);
	}
	
	@Test
	public void shouldCryWhenCallQuack() {
		//arrange
		Duck duck = new MallardDuck("MD");
		//act
		String sound = duck.performQuack();
		//assert
		assertEquals("quack quack", sound);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		Duck duck = new MallardDuck("MD");
		//act
		String swim = duck.swim();
		//assert
		assertEquals("can swimming", swim);
	}
	
	@Test
	public void shouldShowShapeWhenDisplay() {
		//arrange
		Duck duck = new MallardDuck("MD");
		//act
		String display = duck.display();
		//assert
		assertEquals("MallardDuck", display);
	}
	
	@Test
	public void shouldFlyWhenCallFly() {
		//arrange
		Duck duck = new MallardDuck("MD");
		//act
		String fly = duck.performFly();
		//assert
		assertEquals("can fly", fly);
	}
	
	@Test
	public void shouldFlyWhenCallSetFlyBehavior() {
		//arrange
		Duck duck = new MallardDuck("MD");
		//act
		String flyBefore = duck.performFly();
		duck.setFlyBehavior(new FlyNoWay());
		String flyAfter= duck.performFly();
		//assert
		assertEquals("can fly", flyBefore);
		assertEquals("can't fly", flyAfter);
		assertNotEquals(flyBefore, flyAfter);
	}
	
	@Test
	public void sholudQuackWhenCallSetQuackBehavior() {
		//arrange
		Duck duck = new MallardDuck("MD");
		//act
		String quackBefore = duck.performQuack();
		duck.setQuackBehavior(new Squeak());
		String quackAfter = duck.performQuack();
		//assert
		assertEquals("quack quack", quackBefore);
		assertEquals("bbic bbic", quackAfter);
		assertNotEquals(quackBefore, quackAfter);
	}
}
