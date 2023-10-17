import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogadora1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogadora1 extends JogadoresExtra
{
     public Jogadora1(){
        GreenfootImage image = getImage();
        int witdth = image.getWidth();
        int height = image.getHeight();
        image.scale(witdth/4,height/4);
    
    }
    /**
     * Act - do whatever the Jogadora1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moverActoresExtra();
    }
   
}