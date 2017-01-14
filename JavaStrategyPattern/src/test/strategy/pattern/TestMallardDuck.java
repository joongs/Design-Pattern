package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.Duck;
import duck.strategy.pattern.MallardDuck;

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
		String sound = duck.quack();
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
	public void shouldflyWhenCallFly() {
		//arrange
		Duck duck = new MallardDuck("MD");
		//act
		//String fly = ((MallardDuck)duck).fly();
		String fly = duck.fly();
		//assert
		assertEquals("can fly", fly);
	}
}