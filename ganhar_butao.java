import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ganhar_butao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ganhar_butao extends Actor
{
    /**
     * Act - do whatever the ganhar_butao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean l2 = false;
    public void act()
    {
        // Add your action code here.
        boolean k = isTouching(Ken.class);
        boolean b = isTouching(Barbie.class);
        //quando um deles chegar troca de mundo
        if(b || k ) {
            // manda los para outro mundo e se o 
            if(!l2)
                Greenfoot.setWorld(new labirinto2());
            else
                Greenfoot.setWorld(new Inicio());
        }
            
    }
    
}
