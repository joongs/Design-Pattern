package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.Duck;
import duck.strategy.pattern.RedheadDuck;

public class TestRedheadDuck {

	@Test
	public void shouldIdentifyNameWhenNotGiveName() {
		//arrange
		Duck duck = new RedheadDuck();
		//act
		String name = duck.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldIdentifyNameWhenGiveName() {
		//arrange
		Duck duck = new RedheadDuck("rhDuck");
		//act
		String name = duck.getName();
		//assert
		assertEquals("rhDuck", name);
	}
	
	@Test
	public void shouldCryWhenCallQuack() {
		//arrange
		Duck duck = new RedheadDuck("RD");
		//act
		String sound = duck.quack();
		//assert
		assertEquals("quack quack", sound);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		Duck duck = new RedheadDuck("RD");
		//act
		String swim = duck.swim();
		//assert
		assertEquals("can swimming", swim);
	}
	
	@Test
	public void shouldShowShapeWhenDisplay() {
		//arrange
		Duck duck = new RedheadDuck("RD");
		//act
		String display = duck.display();
		//assert
		assertEquals("RedheadDuck", display);
	}

	@Test
	public void sholudFlyWhenCallFly() {
		//arrange
		Duck duck = new RedheadDuck("RD");
		//act
		String fly = duck.fly();
		//assert
		assertEquals("can fly", fly);
	}
}
