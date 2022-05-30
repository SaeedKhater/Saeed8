package game;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Thread1 extends Thread{
    Game game;
    public void run(){
        System.out.println("Game1");
        Game game = new Game("my tetris");

        game.run();
    }

}
