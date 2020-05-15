import java.util.Scanner;

public abstract class Location {
	protected Player player;
	protected String name;
	Scanner scan = new Scanner(System.in);
	
	Location(Player player){
		this.player = player;
	}
	
	public abstract boolean getLocation();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
