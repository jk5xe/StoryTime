package plotTwist;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStoryArc {
	StoryCharacterUser jisu;
	StoryArc theBeginning;
	
	@Before
	public void setUp() throws Exception {
		jisu = new StoryCharacterUser("Jisu", CharacterRole.MASTER);
		theBeginning = new StoryArc("The Begginning");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_StoryArcIsNotNull_WhenInstantiated() {
		assertNotNull(theBeginning);
	}
	
	@Test
	public void test_StoryArcReturnEmptyCharacterList_WhenNoneAreEntered() {
		List<StoryCharacterUser> characters = theBeginning.getCharacters();
		assertEquals(0, characters.size());
	}
	
	@Test
	public void test_StoryArcAddsCharacterToCharacterList_WhenCharacterIsAdded() {
		theBeginning.addCharacter(jisu);
		List<StoryCharacterUser> characters = theBeginning.getCharacters();
		assertEquals(1, characters.size());
	}
	
	@Test
	public void test_StoryArcContainsCharacter_WhenCharacterIsAdded() {
		theBeginning.addCharacter(jisu);
		boolean isThere = theBeginning.characterIsInArc(jisu);
		assertTrue(isThere);
	}
	
//	@Test
//	public void test_StoryArcReturnsTasks_WhenGetTasksIsCalled()){
//		List<Task>
//	}

}
