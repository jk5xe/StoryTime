package plotTwist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTask {
	Task firstTask;

	@Before
	public void setUp() throws Exception {
		firstTask = new Task("Name Your Character");
		firstTask.addObjective("You want to name your character");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_TaskIsNotNull_WhenTestIsInstantiated() {
		assertNotNull(firstTask);
	}
	
	@Test 
	public void test_GetTaskName_WhenGetNameIsCalled() {
		String name = firstTask.getTaskName();
		assertEquals("Name Your Character", name);
	}
	
	@Test
	public void test_ObjectIsNotInserted_WhenAdded() {
		boolean added = firstTask.addObjective("You want to name your character");
		assertFalse(added);
	}
	
	@Test
	public void test_TaskReturnsObjective_WhenGetObjectiveIsCalled() {
		String objective = firstTask.getObjective();
		assertEquals("You want to name your character", objective);
	}
	
	

}
