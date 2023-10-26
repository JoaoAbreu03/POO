import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        textos();
    }
    private void textos()
    {
        addObject(new GameOvertexto(),604,188);
        addObject(new recomecar(),593,280);
        addObject(new PontuacaoTexto(),344,543);
        
    }
    
}
