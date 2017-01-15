package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.DecoyDuck;
import duck.strategy.pattern.Duck;

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
		String fly = duck.fly();
		//assert
		assertEquals("can't fly", fly);
	}
}
