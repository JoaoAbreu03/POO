import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labirinto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labirinto extends World
{

    /**
     * Constructor for objects of class labirinto.
     * 
     */
    public labirinto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 1000, 1); 
        pintaMundo(0,0,0);
        populate();
    }
    private void populate(){
        
       addObject(new Barbie(),200,900);
       addObject(new Ken(),1200,900);
     
       int d = 100;
      
       for ( int i= 0; i < 5; i++ ){
           murro m = new murro();
           m.setRotation(90);
           addObject(m,700,d);
           d = d + 200;
       }
       
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
}
