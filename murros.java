import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class murros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class murros extends obstaculos
{
    /**
     * Act - do whatever the murros wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void mudarTransparencia(){
        //vai tornar o murro invisivel
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
    
    public void mudarTransparencia(boolean t){
        //nao ficar invisivel
        if(t){
            GreenfootImage imagem = getImage();
            int alpha = imagem.getTransparency();
            alpha = 255;
            imagem.setTransparency(alpha); 
        }   
               
    }
    

}
