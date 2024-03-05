package com.springframework.learnspringframework;
import com.springlearn.learnspringframework.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
    
}
