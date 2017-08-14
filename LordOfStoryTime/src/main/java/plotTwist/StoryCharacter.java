package plotTwist;

public abstract class StoryCharacter {
	private String name;
	private CharacterRole role;
	private Health health;
	
	public StoryCharacter() {
		super();
		this.name = "";
		this.role = CharacterRole.NONDETERMINED;
		this.setHealth(new Health());
	}
	public StoryCharacter(String name) {
		super();
		this.name = name;
		this.role = CharacterRole.NONDETERMINED;
		this.setHealth(new Health());
	}
	public StoryCharacter(String name, CharacterRole role) {
		super();
		this.name = name;
		this.role = role;
		this.setHealth(new Health());
	}
	public StoryCharacter(String name, CharacterRole role, Health health) {
		super();
		this.name = name;
		this.role = role;
		this.setHealth(health);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public CharacterRole getRole() {
		return role;
	}
	public void setRole(CharacterRole role) {
		this.role = role;
	}
	public Health getHealth() {
		return health;
	}
	public void setHealth(Health health) {
		this.health = health;
	}

	public int getCharacterHealthBar() {
		return this.health.getHealthBar();
	}
	public void setCharacterHealthBar(int healthBar) {
		this.health.setHealthBar(healthBar);
	}
	public int getCharacterMP() {
		return this.health.getMP();
	}
	public void setCharacterMP(int mP) {
		this.health.setMP(mP);;
	}
	
	public int removeCharacterMP(int mP) {
		return this.health.removeMP(mP);
	}
	
	public int removeCharacterHealth(int health) {
		return this.health.removeHealth(health);
	}
	
	public int addCharacterMP(int mP) {
		return this.health.addMP(mP);
	}
	
	public int addCharacterHealth(int health) {
		return this.health.addHealth(health);
	}
	
}
