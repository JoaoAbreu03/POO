import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CorridaDeCarros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CorridaDeCarros extends World
{

    /**
     * Constructor for objects of class CorridaDeCarros.
     * 
     */
    public CorridaDeCarros()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 900, 1);  
        preparaObjetos();             
    }
    private void preparaObjetos(){
        addObject(new car1(),150,550);
    }

}
