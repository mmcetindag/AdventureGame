import java.util.Random;
public class Obstacle {
	private String name;
	private int damage, award, health, maxNumber;

	public Obstacle(String name, int damage, int health, int award, int maxNumber) {
		this.name = name;
		this.damage = damage;
		this.award = award;
		this.health = health;
		this.maxNumber = maxNumber;
	}
	
	public int count() {
		Random r = new Random();
		return r.nextInt(this.maxNumber) + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAward() {
		return award;
	}

	public void setAward(int award) {
		this.award = award;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

}
