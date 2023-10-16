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
        super(1200, 700, 1); 
        pintaMundo(0,128,0);
        //showText("Tenis",200,300);
        populate();
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
    private void populate(){
        
       addObject(new Barbie(),944,149);
        
        addObject(new Ken(),944,476);
        addObject(new Jogadora1(),181,149);
        addObject(new Jogadora2(),174,476);
        addObject(new Rede(),600,350);
        addObject(new Bola(),400,350);
    }
}
