package plotTwist;

import java.util.ArrayList;
import java.util.List;

public class StoryArc {
	String arcName;
	List<StoryCharacterUser> characters;

	public StoryArc(String name) {
		super();
		this.arcName = name;
		this.characters = new ArrayList<StoryCharacterUser>();
	}

	public List<StoryCharacterUser> getCharacters() {
		return this.characters;
	}

	public void addCharacter(StoryCharacterUser character) {
		this.characters.add(character);
		
	}

	public boolean characterIsInArc(StoryCharacterUser jisu) {
		return this.characters.contains(jisu);
	}

}
