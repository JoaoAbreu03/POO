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
       super(1200, 700, 1);  
       atores();
    }
    private void atores(){
        addObject(new Baliza(),600,50);
        addObject(new Bola(),450,520);
        addObject(new Barbie(),360,570);
        addObject(new Ken(),340,540);
        addObject(new Guarda(),615,225);
    }
}
