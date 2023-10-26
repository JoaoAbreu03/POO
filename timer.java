import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 
Write a description of class timer here.
@author (your name)
@version (a version number or a date)
*/


public class timer extends Actor {
    private int timer;
    
    //contrutor
    public timer(int targetTime) {
        this.timer = targetTime;
    }

    public void act() {
        if (timer > 0) {
            //reduz o tempo
            timer--;
            // converte o tempo para segundos
            int tempo = timer/60;
            //mostra o tempo restante no mundo
            getWorld().showText("tempo restante: " + tempo + " sec", 110, 50);

            
        } else {
            // quando o tempo acaba e ele ainda nao passou o nivel acaba o munndo
            Greenfoot.setWorld(new GameOver());
        }
    }
}