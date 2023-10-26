import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aranha extends adversario
{
    /**
     * Act - do whatever the aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int m = 4;
    public void act()
    {
        // Add your action code here.
        move(m);
        if(isAtEdge())
            if(m>0)
                m =-4;
            else
                m =4;
        if(isTouching(Ken.class) || isTouching(Barbie.class) || isTouching(murros.class) ){
            if(m>0)
                m =-4;
            else
                m = 4;
        }
    }
}
