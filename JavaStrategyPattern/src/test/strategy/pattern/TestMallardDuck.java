package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.Duck;
import duck.strategy.pattern.MallardDuck;

public class TestMallardDuck {

	@Test
	public void shouldIdentifyNameWhenNotGiveName() {
		//arrange
		Duck mDuck = new MallardDuck();
		//act
		String name = mDuck.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldIdentifyNameWhenGiveName() {
		//arrange
		Duck mDuck = new MallardDuck("mDuck");
		//act
		String name = mDuck.getName();
		//assert
		assertEquals("mDuck", name);
	}
	
	@Test
	public void shouldCryWhenCallQuack() {
		//arrange
		Duck mDuck = new MallardDuck("MD");
		//act
		String sound = mDuck.quack();
		//assert
		assertEquals("quack quack", sound);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		Duck mDuck = new MallardDuck("MD");
		//act
		String swim = mDuck.swim();
		//assert
		assertEquals("can swimming", swim);
	}
	
	@Test
	public void shouldShowShapeWhenDisplay() {
		//arrange
		MallardDuck mDuck = new MallardDuck("MD");
		//act
		String display = mDuck.display();
		//assert
		assertEquals("MallardDuck", display);
	}
}