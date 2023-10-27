import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car2 extends Carros
{
    private GreenfootImage imgParaCima;
    private GreenfootImage imgParaBaixo;
    private GreenfootImage imgParaDireita;
    private GreenfootImage imgParaEsquerda;
   // private int speed = 15;

    /**
     * Act - do whatever the car1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movePlayer( "left", "right", "up", "down");
        ConeCoracao();
    }
    public void ConeCoracao(){
         if (isTouching(Cone.class))
        {
            removeTouching(Cone.class);
            speed=2;
        }else if(isTouching(Coracao_amarelo.class)){
            removeTouching(Coracao_amarelo.class);
            speed=speed+1;
            contador++;
        }
    }
    
   public void movePlayer( String left, String right, String up, String down){
        
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown(left)){
            setLocation(getX()-speed, getY());
            setImage(imgParaEsquerda);
        }
        if(Greenfoot.isKeyDown(right)){
            setLocation(getX()+speed, getY());
            setImage(imgParaDireita);
        }
        
        if(Greenfoot.isKeyDown(up)){
            setLocation(getX(), getY() - speed);
            setImage(imgParaCima);
        }
        
        if(Greenfoot.isKeyDown(down)){
            setLocation(getX(), getY() + speed);
            setImage(imgParaBaixo);
        }
    }
    public car2(){
        imgParaCima = new GreenfootImage("car2_cima.png");
        imgParaBaixo = new GreenfootImage("car2_baixo.png");
        imgParaDireita = new GreenfootImage("car2_direita.png");
        imgParaEsquerda = new GreenfootImage("car2_esquerda.png");
        
        setImage(imgParaDireita); // imagem inicial
    }
    
    /*public boolean IsTouchingAColor(Color[] referenceColors) {
        GreenfootImage imagemDoMundo = getWorld().getImage().getColorAt(0, 0);
        int x = getX();
        int y = getY();
        Color imagem = imagemDoMundo.getColorAt(x, y);
        boolean touchAnyColor = false;
        for(Color color : referenceColors){
            touchAnyColor |= imagemDoMundo.getColorAt(x, y).equals(color);
        }
        return touchAnyColor;
    }*/
    
}