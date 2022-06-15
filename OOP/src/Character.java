public class Character {
	
	private String name;
	private int chances;
	private String position;
	
	Character(String name, int chances, String position) {
		this.name = name;
		this.chances = chances;
		this.position = position;
	}
	
	public void display() {
		System.out.println("Name: " + this.getName());
		System.out.println("Chances Left: " + this.getChances());
		System.out.println("Position: " + this.getPosition());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChances() {
		return chances;
	}

	public void setChances(int chances) {
		this.chances = chances;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
