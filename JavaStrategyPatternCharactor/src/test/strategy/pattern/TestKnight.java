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
	public void shouldSwordWhenCallSetWeaponBehavior() {
		//arrange
		Knight knight = new Knight("kkk");
		//act
		String weaponBefore = knight.fight();
		knight.setWeapon(new Sword());
		String weaponAfter = knight.fight();
		//assert
		assertEquals("axo", weaponBefore);
		assertEquals("sword", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
	
	@Test
	public void shouldKnifeWhenCallSetWeaponBehavior() {
		//arrange
		Knight knight = new Knight("kkk");
		//act
		String weaponBefore = knight.fight();
		knight.setWeapon(new Knife());
		String weaponAfter = knight.fight();
		//assert
		assertEquals("axo", weaponBefore);
		assertEquals("knife", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
	
	@Test
	public void shouldBowAndArrowWhenCallSetWeaponBehavior() {
		//arrange
		Knight knight = new Knight("kkk");
		//act
		String weaponBefore = knight.fight();
		knight.setWeapon(new BowAndArrow());
		String weaponAfter = knight.fight();
		//assert
		assertEquals("axo", weaponBefore);
		assertEquals("bow and arrow", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
}
