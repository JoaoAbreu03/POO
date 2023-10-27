import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coracao_amarelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coracao_amarelo extends Coracao
{
    /**
     * Act - do whatever the coracao_amarelo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Coracao_amarelo()
    {
         GreenfootImage image = getImage();
        int witdth = image.getWidth();
        int height = image.getHeight();
        image.scale(witdth/15,height/15);
    }
}
