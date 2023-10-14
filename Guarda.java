import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guarda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guarda extends Actor
{
    private int velocidade = 4; 
    private int limiteEsquerdo = 200;
    private int limiteDireito = 1000;
    private int direcao = 1; 
    public Guarda(){
        GreenfootImage image = getImage();
        int witdth = image.getWidth();
        int height = image.getHeight();
        image.scale(witdth/6,height/6);
    }
    /**
     * Act - do whatever the Guarda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
    }
    private void move(){
        if (getX() >= limiteDireito || getX() <= limiteEsquerdo) {
            direcao *= -1; // Inverte a direção
        }

        // Move o ator na direção atual
        setLocation(getX() + (velocidade * direcao), getY());
    }
     
}
