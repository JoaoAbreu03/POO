import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JogadoresExtra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JogadoresExtra extends Actor
{
    public int velocidade=1; 
    public int velocidade1=4; 
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
            //move(5);
            setLocation(getX()+velocidade,getY());
            setLocation(getX(),getY()+ velocidade1);
           if(getX() <= 150 || getX() >= 500 ){
               velocidade*=-velocidade;
           }
           if(getY() <= 100 || getY() >= 650 ){
               velocidade1=-velocidade1;
           }
        }
        
    }
}
