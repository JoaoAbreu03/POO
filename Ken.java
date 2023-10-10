import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ken extends Jogadores
{
    /**
     * Act - do whatever the Ken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveKen();
    }
    public void moveKen(){
        int x = getX();
        int y = getY();
 
        if(Greenfoot.isKeyDown("A")){
            setLocation(x-2, y);
        
        }else if(Greenfoot.isKeyDown("D")){
            setLocation(x+2, y);
        }
        else if(Greenfoot.isKeyDown("W")){
            setLocation(x, y-2);
        }
        else if(Greenfoot.isKeyDown("S")){
            setLocation(x, y+2);
        }
    }
}
