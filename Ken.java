import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ken extends Jogadores
{   GreenfootImage imagem1,imagem2;
    public Ken(){ 
        GreenfootImage image = getImage();
        int witdth = image.getWidth();
        int height = image.getHeight();
        image.scale(witdth/4,height/4);
        imagem1= new GreenfootImage("kenjogadorcostas.png");
        imagem1.scale(witdth/4,height/4);
        imagem2= new GreenfootImage("kentenisladooraquete.png");
        imagem2.scale(witdth/4,height/4);
        
    }
    /**
     * Act - do whatever the Ken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //moveKen();
        movePlayer( "A", "D", "W", "S");
        mudar();
        hitMurro("A", "D", "W", "S");
        verificarVida();
    }
    /*public void moveKen(){
        int x = getX();
        int y = getY();
 
        if(Greenfoot.isKeyDown("A")){
            setLocation(x-2, y);
        
        }else if(Greenfoot.isKeyDown("D")){
            setLocation(x+2, y);
        }
        else if(Greenfoot.isKeyDown("W")){
            setLocation(x, y-2);
        }
        else if(Greenfoot.isKeyDown("S")){
            setLocation(x, y+2);
        }
    }*/
    public void mudar(){
        if (getWorld() instanceof Futebol) {
            setImage(imagem1);
        }else if(getWorld() instanceof Tenis){
            setImage(imagem2);
        }
        
    }
    
}
