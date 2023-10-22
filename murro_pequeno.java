import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class murro_pequeno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class murro_pequeno extends Actor
{
    /**
     * Act - do whatever the murro_pequeno wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
       
        mudarTransparencia();    
        
        
    }
    public void mudarTransparencia(){
        GreenfootImage imagem = getImage();
        int alpha = imagem.getTransparency();
        if(isTouching(Ken.class) || isTouching(Barbie.class)){
            alpha = 255;
            imagem.setTransparency(alpha);
            
        }else{
            alpha = imagem.getTransparency();  
            if(alpha >= 5)
                imagem.setTransparency(alpha - 5);
        }  
    }
}
