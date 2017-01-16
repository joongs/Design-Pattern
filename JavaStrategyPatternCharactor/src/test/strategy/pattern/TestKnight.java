package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import character.strategy.pattern.Knight;
import weapon.strategy.pattern.Sword;

public class TestKnight {

	@Test
	public void shouldCreateKnightWhenCallNotGiveName() {
		//arrange
		Knight knight = new Knight();
		//act
		String name = knight.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldCreateKnightWhenCallGiveName() {
		//arrange
		Knight knight = new Knight("kkk");
		//act
		String name = knight.getName();
		//assert
		assertEquals("kkk", name);
	}
	
	@Test
	public void shouldUseWeaponWhenCallFight() {
		//arrange
		Knight knight = new Knight("kkk");
		//act
		String weapon = knight.fight();
		//assert
		assertEquals("axo", weapon);
	}
	
	@Test
	public void shouldChangeWeaponWhenCallSetWeaponBehavior() {
		//arrange
		Knight knight = new Knight("kkk");
		//act
		String weaponBefore = knight.fight();
		knight.setWeaponBehavior(new Sword());
		String weaponAfter = knight.fight();
		//assert
		assertEquals("axo", weaponBefore);
		assertEquals("sword", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
}
