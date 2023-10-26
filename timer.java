import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class timer extends Actor {
    private int timer; // Timer in seconds
    private int targetTime; // The target time in seconds to count down from
    private int countdownDelay; // Delay in milliseconds

    public timer(int targetTime) {
        this.targetTime = targetTime;
        this.timer = targetTime;
        this.countdownDelay = 1000; // 1000 milliseconds = 1 second
    }

    public void act() {
        if (timer > 0) {
            timer--;
            int tempo = timer/60;
            getWorld().showText("tempo restante: " + tempo + " sec", 110, 50);

            // Delay for 1 second (1000 milliseconds)
        } else {
            // The countdown timer has reached 0, perform your action here
            Greenfoot.setWorld(new GameOver());
        }
    }
}
