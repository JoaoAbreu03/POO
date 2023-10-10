import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Futebol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Futebol extends World
{
    
    /**
     * Constructor for objects of class Futebol.
     * 
     */
    public Futebol()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1200, 700, 1);  
        pintaMundo(0,128,0);
        atores();
        //golosMarcar=Greenfoot.getRandomNumber(11);
       //getWorld().showText("Golos a marcar: "+golosamarcar, 100,350);
        
       //showText("Golos a marcar: "+golosMarcar, 750,50);
       
    }
    private void atores(){
        addObject(new Baliza(),450,70);
        //Greenfoot.getRandomNumber(getWidth()),60);
        addObject(new Bola(),450,520);
        addObject(new Barbie(),360,570);
        addObject(new Ken(),340,540);
        addObject(new Guarda(),450,110);
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
    /*public int geraGolos(){
        golosMarcar=Greenfoot.getRandomNumber(11);
        showText("Golos a marcar: "+golosMarcar, 750,50);
        return golosMarcar;
    }*/
}
