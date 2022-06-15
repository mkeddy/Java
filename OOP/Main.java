import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter Name:");
		String name = sc.nextLine();
		System.out.print("Please Enter Position:");
		String position = sc.nextLine();
		Character player = new Character(name, 10, position);
		
		player.display();
		
		System.out.print("Enetr map size for X:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("Enetr map size for Y:");
		int y = Integer.parseInt(sc.nextLine());
		
		Random rand = new Random();
		int currentX = rand.nextInt(x+1);
		int currentY = rand.nextInt(y+1);
		
		Map map = new Map(x , y, currentX, currentY);
		map.getInfo();
		
		int winX = rand.nextInt(x+1);
		int winY = rand.nextInt(y+1);
		
		String direction;
		while(map.getCurrentX() != winX || map.getCurrentY() != winY) {
			System.out.println("Please select which direction you want to move: N, S, E or W:");
			direction = sc.nextLine();
			map.move(direction);
			map.getInfo();
		}
		
		System.out.println("Congrats you got to the ball first!");
	}
	
	

}
