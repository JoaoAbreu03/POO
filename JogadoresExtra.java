import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JogadoresExtra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JogadoresExtra extends Actor
{
    public int velocidade =4 ; 
    public int limiteEsquerdo =200;
    public int limiteDireito=1000 ;
    public int direcao =1; 
    /**
     * Act - do whatever the JogadoresExtra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //mover();
    }
    public void mover(){
        /*
            velocidade = 4; 
             limiteEsquerdo = 200;
        limiteDireito = 1000;
         direcao = 1; */
            if (getX() >= limiteDireito || getX() <= limiteEsquerdo) {
                direcao *= -1; // Inverte a direção
            }

            // Move o ator na direção atual
        setLocation(getX() + (velocidade * direcao), getY());
        
    }
}
