import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogadores extends Actor
{   
    GreenfootImage imagem1,imagem2;
    int vida = 3;
    //string up,down,left, right;
    /**
     * Act - do whatever the Jogadores wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
     /*public void mudar(){
        if (getWorld() instanceof Futebol) {
            setImage(imagem1);
        }else if(getWorld() instanceof Tenis){
            setImage(imagem2);
        }
        
    }*/
    public void movePlayer( String left, String right, String up, String down){
        
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown(left)){
            setLocation(x-2, y);
        
        }else if(Greenfoot.isKeyDown(right)){
            setLocation(x+2, y);
        }
        else if(Greenfoot.isKeyDown(up)){
            setLocation(x, y-2);
        }
        else if(Greenfoot.isKeyDown(down)){
            setLocation(x, y+2);
        }        
    }
    public void hitMurro( String left, String right, String up, String down){
        int x = getX();
        int y = getY();
        if (isTouching(murro.class) || isTouching(murro_pequeno.class))
        {
            if(Greenfoot.isKeyDown(left)){
                setLocation(x+2, y);           
            }else if(Greenfoot.isKeyDown(right)){
                setLocation(x-2, y);
            }
            else if(Greenfoot.isKeyDown(up)){
                setLocation(x, y+2  );
            }
            else if(Greenfoot.isKeyDown(down)){
                setLocation(x, y-2);
            }
        }
    }
    public void verificarVida(){
        if(isTouching(adversario.class)){
            vida  -= 1; 
            if(vida <= 0){
                int a = 0;
            }
        }
    }
}
