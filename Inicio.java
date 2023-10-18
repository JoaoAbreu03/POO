import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{

    /**
     * Constructor for objects of class Inicio.
     * 
     */
      public Inicio()
    {    
        super(1200, 700, 1); 
        populateWorld();
        pintaMundo(45,171,253);
    }
    public void populateWorld(){
        addObject(new Fundo(),604,364);
        addObject(new Titulo(),605,80);
        addObject(new Subtitulo(),621,671);
        addObject(new Play(),480,325);
        showText("Play", 481,330);
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }    
}
