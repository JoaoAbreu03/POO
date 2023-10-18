import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogadores extends Actor
{   GreenfootImage imagem1,imagem2;
    /**
     * Act - do whatever the Jogadores wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
     public void mudar(){
        if (getWorld() instanceof Futebol) {
            setImage(imagem1);
        }else if(getWorld() instanceof Tenis){
            setImage(imagem2);
        }
        
    }
    
}
