package plotTwist;

public class Health {
	private HealthStatus status;
	private int healthBar;
	private int MP;
	
	
	public Health() {
		super();
		this.status = HealthStatus.NORMAL;
		this.healthBar = 100;
		this.MP = 100;
	}

	public Health(int healthBar) {
		super();
		this.status = HealthStatus.NORMAL;
		this.healthBar = healthBar;
		this.MP = 100;
	}
	public Health(int healthBar, int mP) {
		super();
		this.status = HealthStatus.NORMAL;
		this.healthBar = healthBar;
		MP = mP;
	}
	public Health(HealthStatus status, int healthBar, int mP) {
		super();
		this.status = status;
		this.healthBar = healthBar;
		this.MP = mP;
	}
	public HealthStatus getStatus() {
		return status;
	}
	public void setStatus(HealthStatus status) {
		this.status = status;
	}
	public int getHealthBar() {
		return healthBar;
	}
	public void setHealthBar(int healthBar) {
		this.healthBar = healthBar;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	
	public int removeMP(int mP) {
		this.MP -= mP;
		return this.MP;
	}
	
	public int removHealth(int health) {
		this.healthBar -= health;
		return this.healthBar;
	}
	
	public int addMP(int mP) {
		this.MP += mP;
		return this.MP;
	}
	
	public int addHealth(int health) {
		this.healthBar += health;
		return this.healthBar;
	}
	
	
}
