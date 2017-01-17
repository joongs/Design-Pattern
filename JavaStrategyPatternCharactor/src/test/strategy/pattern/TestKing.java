package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import character.strategy.pattern.Character;
import character.strategy.pattern.King;
import weapon.strategy.pattern.Axo;

public class TestKing {

	@Test
	public void shouldCreateKingWhenCallNotGiveName() {
		//arrange
		Character king = new King();
		//act
		String name = king.getName();
		//assert
		assertEquals("no name", name);
	}
	
	@Test
	public void shouldCreateKingWhenCallGiveName() {
		//arrange
		Character king = new King("KING");
		//act
		String name = king.getName();
		//assert
		assertEquals("KING", name);
	}
	
	@Test
	public void shouldUseWeaponWhenCallFight() {
		//arrange
		Character king = new King("KING");
		//act
		String weapon = king.fight();
		//assert
		assertEquals("sword", weapon);
	}
	
	@Test
	public void shouldUseAxoWhenCallSetWeaponBehavior() {
		//arrange
		Character king = new King("KING");
		//act
		String weaponBefore = king.fight();
		king.setWeapon(new Axo());
		String weaponAfter = king.fight();
		//assert
		assertEquals("sword", weaponBefore);
		assertEquals("axo", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
	
	@Test
	public void shouldUseKnifeWhenCallSetWeaponBehavior() {
		//arrange
		Character king = new King("KING");
		//act
		String weaponBefore = king.fight();
		king.setWeapon(new Knife());
		String weaponAfter = king.fight();
		//assert
		assertEquals("sword", weaponBefore);
		assertEquals("knife", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
	
	@Test
	public void shouldUSeBowAndArrowWhenCallSetWeaponBehavior() {
		//arrange
		Character king = new King("KING");
		//act
		String weaponBefore = king.fight();
		king.setWeapon(new BowAndArrow());
		String weaponAfter = king.fight();
		//assert
		assertEquals("sword", weaponBefore);
		assertEquals("bow and arrow", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
}
