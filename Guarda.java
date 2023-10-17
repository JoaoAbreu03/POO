import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guarda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guarda extends JogadoresExtra
{
    public Guarda(){
        GreenfootImage image = getImage();
        int witdth = image.getWidth();
        int height = image.getHeight();
        image.scale(witdth/6,height/6);
    }
   /**
     * Act - do whatever the Guarda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moverActoresExtra();
        
    }
    
}
