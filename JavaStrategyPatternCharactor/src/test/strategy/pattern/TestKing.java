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
	public void shouldCreatKingWhenCallGiveName() {
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
	
	public void shouldChangeWeaponWhenCallSetWeaponBehavior() {
		//arrange
		Character king = new King("KING");
		//act
		String weaponBefore = king.fight();
		king.setWeaponBehavior(new Axo());
		String weaponAfter = king.fight();
		//assert
		assertEquals("sword", weaponBefore);
		assertEquals("axo", weaponAfter);
		assertNotEquals(weaponBefore, weaponAfter);
	}
}
