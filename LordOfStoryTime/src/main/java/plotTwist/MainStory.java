package plotTwist;

import java.util.Scanner;

public class MainStory {
	private static StoryCharacter mainCharacter;
	private static Scanner in  = new Scanner(System.in);
	
//	private static StoryCharacter getMainCharacter() {
//		return mainCharacter;
//	}
	private static void setMainCharacter(StoryCharacter mainCharacter) {
		MainStory.mainCharacter = mainCharacter;
	}

	
	public static void chooseCharacter() throws StoryException {
		System.out.println("Please pick a character by entering a number:\n 1)Jisu 2)Mickeal 3)Luis 4)QUIT");
		int choice = in.nextInt();
		
		switch(choice) {
			case 1:	setMainCharacter(new StoryCharacter("Jisu"));
							break;
			case 2: 	setMainCharacter(new StoryCharacter("Mickeal"));
							break;
			case 3:	setMainCharacter(new StoryCharacter("Luis"));
							break;
			case 4:	System.exit(0);;
			default :
							throw new StoryException("You have inputted an invalid option. Please Try again\n");
		}
	}
	

	
	/*
	public static void main(String[] args) {
		System.out.println("Hello! Welcome to the Plot Twist! \nThis is an interactive game, where you can explore my world.\nPlease Enjoy! - Jisu\n");
		
		while(true) {
			try {
				chooseCharacter();
				break;
			} catch(StoryException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("You have chosen: " + mainCharacter.getName() + "!");
		
	}*/
}
