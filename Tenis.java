import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tenis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tenis extends World
{

    /**
     * Constructor for objects of class Tenis.
     * 
     */
    public Tenis()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        pintaMundo(0,128,0);
        showText("Tenis",200,300);
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
}
