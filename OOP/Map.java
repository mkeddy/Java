
public class Map {
	private int x; 
	private int y; 
	private int currentX; 
	private int currentY;
	
	public Map(int x, int y, int currentX, int currentY) {
		this.x = x;
		this.y = y;
		this.currentX = currentX;
		this.currentY = currentY;
	}
	
	public void getInfo() {
		System.out.println("Map Size is X,Y: " + this.getX() + "'" + this.getY());
		System.out.println("Player currently at X,Y: " + this.getCurrentX() + "," + this.getCurrentY());
	}
	
	public void move(String direction) {
		System.out.println(direction);
		direction = direction.toLowerCase();
		switch(direction) {
		case "n":
			if (this.getCurrentY() == this.y) {
				this.setCurrentY(0);
			}else {
				this.setCurrentY(this.getCurrentY()+1);
			}
			break;
		case "s":
			if (this.getCurrentY() == 0) {
				this.setCurrentY(this.y);
			}else {
				this.setCurrentY(this.getCurrentY()-1);
			}
			break;
		case "e":
			if (this.getCurrentX() == this.x) {
				this.setCurrentX(0);
			}else {
				this.setCurrentX(this.getCurrentX()+1);
			}
			break;
		case "w":
			if (this.getCurrentX() == 0) {
				this.setCurrentX(this.x);
			}else {
				this.setCurrentX(this.getCurrentX()-1);
			}
			break;
			default:
				System.out.println("Direction Not Recognised!");
		}
	}

	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
	
}
