package plotTwist;

import java.util.ArrayList;
import java.util.List;

public class StoryArc {
	String arcName;
	List<StoryCharacter> characters;

	public StoryArc(String name) {
		super();
		this.arcName = name;
		this.characters = new ArrayList<StoryCharacter>();
	}

	public List<StoryCharacter> getCharacters() {
		return this.characters;
	}

	public void addCharacter(StoryCharacter character) {
		this.characters.add(character);
		
	}

	public boolean characterIsInArc(StoryCharacter jisu) {
		return this.characters.contains(jisu);
	}

}
