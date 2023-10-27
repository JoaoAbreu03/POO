import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cone extends Actor
{
    /**
     * Act - do whatever the Cone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cone()
    {
         GreenfootImage image = getImage();
        int witdth = image.getWidth();
        int height = image.getHeight();
        image.scale(witdth/15,height/15);
    
    }
}
