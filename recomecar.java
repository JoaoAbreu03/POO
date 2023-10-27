import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class recomecar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recomecar extends Actor
{
    /**
     * Act - do whatever the recomecar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        mouseCliked();
    }
     public void mouseCliked(){
        if(Greenfoot.mouseClicked(this)){
        Pontuacao.resetPontuacao();
        Greenfoot.setWorld(new Futebol());
    }
    }
}
