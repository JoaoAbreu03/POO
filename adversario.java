import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class adversario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class adversario extends obstaculos
{
    /**
     * Act - do whatever the adversario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //valiavel criada para controlar o movimento 
    int m = 4;
    public void act()
    {
        // Add your action code here.
    }
    public int checkMoviment(){
        if(isAtEdge())
            if(m>0)
                m =-4;
            else
                m =4;
        if(isTouching(Jogadores.class) || isTouching(murros.class) ){
            if(m>0)
                m =-4;
            else
                m = 4;
        }
        return m;
    }
}
