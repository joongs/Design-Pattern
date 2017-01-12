package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.RedheadDuck;

public class TestRedheadDuck {

	@Test
	public void shouldIdentifyNameWhenNotGiveName() {
		//arrange
		RedheadDuck rhDuck = new RedheadDuck();
		//act
		String name = rhDuck.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldIdentifyNameWhenGiveName() {
		//arrange
		RedheadDuck rhDuck = new RedheadDuck("rhDuck");
		//act
		String name = rhDuck.getName();
		//assert
		assertEquals("rhDuck", name);
	}
	
	@Test
	public void shouldCryWhenCallQuack() {
		//arrange
		RedheadDuck rhDuck = new RedheadDuck("RD");
		//act
		String sound = rhDuck.quack();
		//assert
		assertEquals("quack quack", sound);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		RedheadDuck rhDuck = new RedheadDuck("RD");
		//act
		String swim = rhDuck.swim();
		//assert
		assertEquals("can swimming", swim);
	}
	
	@Test
	public void shouldShowShapeWhenDisplay() {
		//arrange
		RedheadDuck rhDuck = new RedheadDuck("RD");
		//act
		String display = rhDuck.display();
		//assert
		assertEquals("RedheadDuck", display);
	}
}
