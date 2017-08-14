package plotTwist;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCharacter {
	StoryCharacterUser jisu;
	StoryArc theBeginning;
	HashMap<InventoryItem, Integer> inventory;
	
	@Before
	public void setUp() throws Exception {
		jisu = new StoryCharacterUser("Jisu", CharacterRole.MASTER);
		theBeginning = new StoryArc("The Begginning");
		jisu.addToInventory(InventoryItem.HORSE);
		jisu.addToInventory(InventoryItem.HORSE);
		jisu.addToInventory(InventoryItem.HORSE);
		jisu.addToInventory(InventoryItem.HAT);
		jisu.addToInventory(InventoryItem.SHOES);
		jisu.addToInventory(InventoryItem.DRESS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_CharacterIsNotNull_WhenCharacterIsInstantiated() {
		assertNotNull(jisu);
	}
	
	@Test
	public void test_CharacterChangedRole_WhenChangedRole() {
		jisu.setRole(CharacterRole.KNIGHT);
		CharacterRole role = jisu.getRole();
		assertEquals(role, CharacterRole.KNIGHT);
	}
	
	@Test
	public void test_CharacterGetsInventory_WhenGetInventoryIsCalled() {
		inventory  = jisu.getInventory();
		assertNotNull(inventory);
	}
	
	@Test
	public void test_InventoryIsEditied_WhenAddToInventoryIsCalled() {
		assertTrue(jisu.getInventory().containsKey(InventoryItem.HORSE));
	}
	
	@Test
	public void test_InventoryIsAccumulated_WhenAddToInventoryAddsDuplicateItem() {
		int value = jisu.getItemNumber(InventoryItem.HORSE);
		assertEquals(3, value);
	}
	
	@Test
	public void test_InventoryWillPrint_WhenToStringIsCalled() {
		
		String items = jisu.printInventory();
		System.out.println(items);
		assertEquals("SHOES: 1\nHAT: 1\nDRESS: 1\nHORSE: 3\n", items);
	}
	
	@Test
	public void test_InventoryWillUpdate_WhenRemoveFromInventoryIsCalled() {
		try {
			boolean didIt = jisu.removeFromInventory(InventoryItem.HORSE);
			int value = jisu.getItemNumber(InventoryItem.HORSE);
			assertTrue(didIt);
			assertEquals(2, value);
		} catch(InventoryException e) {
			System.out.println(e);
		}
		
	}
	
	@Test
	public void test_InventoryWillUpdate_WhenRemove2FromInventoryIsCalled(){
		try {
			boolean didIt = jisu.removeFromInventory(InventoryItem.HORSE, 2);
			int value = jisu.getItemNumber(InventoryItem.HORSE);
			assertTrue(didIt);
			assertEquals(1, value);
		} catch(InventoryException e) {
			System.out.println(e);
		}
	}

}
