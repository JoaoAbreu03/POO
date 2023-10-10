import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barbie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barbie extends Jogadores
{
    /**
     * Act - do whatever the Barbie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveBarbie();
    }
    public void moveBarbie(){
        int x = getX();
        int y = getY();
 
        if(Greenfoot.isKeyDown("left")){
            setLocation(x-2, y);
        
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(x+2, y);
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(x, y-2);
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(x, y+2);
        }
    }
}
