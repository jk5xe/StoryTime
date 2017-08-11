package plotTwist;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCharacter {
	StoryCharacter jisu;
	StoryArc theBeginning;
	HashMap<String, Integer> inventory;
	
	@Before
	public void setUp() throws Exception {
		jisu = new StoryCharacter("Jisu", CharacterRole.MASTER);
		theBeginning = new StoryArc("The Begginning");
		jisu.addToInventory("Horse");
		jisu.addToInventory("Horse");
		jisu.addToInventory("Money", 800);
		jisu.addToInventory("Hat");
		jisu.addToInventory("Shoes");
		jisu.addToInventory("Dress");
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
		assertTrue(jisu.getInventory().containsKey("Horse"));
	}
	
	@Test
	public void test_InventoryIsAccumulated_WhenAddToInventoryAddsDuplicateItem() {
		int value = jisu.getItemNumber("Horse");
		assertEquals(2, value);
	}
	
	@Test
	public void test_InventoryWillPrint_WhenToStringIsCalled() {
		
		String items = jisu.printInventory();
		System.out.println(items);
		assertEquals("Money: 800\nDress: 1\nHorse: 2\nHat: 1\nShoes: 1\n", items);
	}
	
	@Test
	public void test_InventoryWillUpdate_WhenRemoveFromInventoryIsCalled() {
		try {
			boolean didIt = jisu.removeFromInventory("Money");
			int value = jisu.getItemNumber("Money");
			assertTrue(didIt);
			assertEquals(799, value);
		} catch(InventoryException e) {
			System.out.println(e);
		}
		
	}
	
	@Test
	public void test_InventoryWillUpdate_WhenRemove100FromInventoryIsCalled(){
		try {
			boolean didIt = jisu.removeFromInventory("Money",100);
			int value = jisu.getItemNumber("Money");
			assertTrue(didIt);
			assertEquals(700, value);
		} catch(InventoryException e) {
			System.out.println(e);
		}
	}

}
