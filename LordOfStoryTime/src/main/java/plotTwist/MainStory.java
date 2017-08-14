package plotTwist;

import java.util.Scanner;

public class MainStory {
	private static StoryCharacterUser mainCharacter;
	private static Scanner in  = new Scanner(System.in);
	
//	private static StoryCharacter getMainCharacter() {
//		return mainCharacter;
//	}
	private static void setMainCharacter(StoryCharacterUser mainCharacter) {
		MainStory.mainCharacter = mainCharacter;
	}
	
	private static void setCharacterRole(CharacterRole role) {
		mainCharacter.setRole(role);
	}

	
	public static void chooseCharacter() throws StoryException {
		System.out.println("Please enter your character name");
		String name = in.nextLine();
		setMainCharacter(new StoryCharacterUser(name));
	}
	
	
	public static void chooseCharacterRole() throws StoryException {
		System.out.println("Please pick a role for your charcter by entering a number:\n 1)Squire 2)Noob 3)Nondetermined 4)QUIT");
		int choice = in.nextInt();
		
		switch(choice) {
			case 1:	setCharacterRole(CharacterRole.SQUIRE);
							break;
			case 2: 	setCharacterRole(CharacterRole.NOOB);
							break;
			case 3:	setCharacterRole(CharacterRole.NONDETERMINED);
							break;
			case 4:	System.exit(0);;
			default :
							throw new StoryException("You have inputted an invalid option. Please Try again\n");
		}
	}
	
	public static void printArcSetting(String filename) {
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello! Welcome to the Plot Twist! \nThis is an interactive game, where you can explore my world.\nPlease Enjoy! - Jisu\n");
		
		
		//choose character
		while(true) {
			try {
				chooseCharacter();
				break;
			} catch(StoryException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("You have chosen to name your character " + mainCharacter.getName() + "!");
		
		//choose character role.
		while(true) {
			try {
				chooseCharacterRole();
				break;
			} catch(StoryException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("You have chosen: " + mainCharacter.getRole() + "!");
		
		
		
		in.close();
	}
}
