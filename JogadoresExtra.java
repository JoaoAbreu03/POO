import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JogadoresExtra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JogadoresExtra extends Actor
{
    public int velocidade=4; 
    
    /**
     * Act - do whatever the JogadoresExtra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //mover();
    }
    
    public void moverActoresExtra()
    {
        if (getWorld() instanceof Futebol){
           
            setLocation(getX()+ velocidade,getY());
           if(getX() <= 200 || getX() >= 1000 ){
               velocidade=-velocidade;
           }
          
    
        }else if(getWorld() instanceof Tenis){
             setLocation(getX()+ velocidade,getY()+velocidade);
           if(getX() <= 200 || getX() >= 1000 ){
               velocidade=-velocidade;
           }
        }
        
    }
}
