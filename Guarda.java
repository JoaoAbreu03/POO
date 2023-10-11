import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guarda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guarda extends Actor
{
    private final int SPEED=4;
    private int SX;
    String[] paises = {"Espanha", "França", "Ingleterra", "Argentina"};
    public Guarda(){
        GreenfootImage image = getImage();
        int witdth = image.getWidth();
        int height = image.getHeight();
        image.scale(witdth/4,height/4);
        SX=1;
    }
    /**
     * Act - do whatever the Guarda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //move();
        //volta();
    }
     private void volta(){
       if(getX()==0){
            SX=1;
        }
       if(getX()==getWorld().getWidth()-1){
            SX=-1;
        }
    }
      private void move(){
        int x= getX();
        int y=130;
        
        x=x+SPEED*SX;
       
        setLocation(x,y);
    }
    private void guardaredes(){
        
    }
}
