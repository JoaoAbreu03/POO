import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car1 extends Actor
{
    private GreenfootImage imgParaCima;
    private GreenfootImage imgParaBaixo;
    private GreenfootImage imgParaDireita;
    private GreenfootImage imgParaEsquerda;

    /**
     * Act - do whatever the car1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
        
    }
    
    private void movimento(){
         if (Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 3); // Move para cima
            setImage(imgParaCima);
        }
        if (Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 3); // Move para cima
            setImage(imgParaBaixo);

        }
        if (Greenfoot.isKeyDown("D")) {
            setLocation(getX()+ 3, getY()); // Move para a direita
            setImage(imgParaDireita);

        }
        if (Greenfoot.isKeyDown("A")) {
            setLocation(getX()-3, getY()); // Move para a esquerda
            setImage(imgParaEsquerda);
        }
        
    }
    public car1(){
        imgParaCima = new GreenfootImage("car1_cima.png");
        imgParaBaixo = new GreenfootImage("car1_baixo.png");
        imgParaDireita = new GreenfootImage("car1_direita.png");
        imgParaEsquerda = new GreenfootImage("car1_esquerda.png");
        
        setImage(imgParaCima); // imagem inicial
    }
}
