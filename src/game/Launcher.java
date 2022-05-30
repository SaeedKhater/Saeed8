package game;

public class Launcher {
	public static void main(String[] args) {
        Thread1 game= new Thread1();
		Thread2 game2 = new Thread2();

		game.start();
		game2.start();

	}
}
