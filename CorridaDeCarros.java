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
        super(1200, 700, 1);  
        pintaMundo(0,150,0);
        //GreenfootImage background = new GreenfootImage("pistaDeCarros2.png"); // Load your background image
        //setBackground(background);

        preparaObjetos();             
    }
    private void preparaObjetos(){
        
        addObject(new pistaSemFundo(),610,350);
        addObject(new meta(),545,130);
        addObject(new car1(),480,104);
        addObject(new car2(),480,160);
        for (int i=0; i<10; i++) {
            Cone cone = new Cone();
            addObject(cone, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        for (int i=0; i<6; i++) {
            Coracao coracao = new Coracao();
            addObject(coracao, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }

}
