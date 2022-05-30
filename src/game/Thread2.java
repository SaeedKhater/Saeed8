package game;

public class Thread2 extends Thread{

    public void run(){
        System.out.println("Game 2");
        Game game = new Game("Tetris ");
        game.run();


    }
}
