import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carros extends Actor
{
    public int speed = 5;
    private GreenfootImage imgParaCima;
    private GreenfootImage imgParaBaixo;
    private GreenfootImage imgParaDireita;
    private GreenfootImage imgParaEsquerda;
    /**
     * Act - do whatever the Carros wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public void ConeCoracao(){
         if (isTouching(Cone.class))
        {
            removeTouching(Cone.class);
            speed=2;
        }else if(isTouching(Coracao.class)){
            removeTouching(Coracao.class);
            speed=speed+1;
        }
    }
    
    
}
