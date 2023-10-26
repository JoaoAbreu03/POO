import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class murro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class murro extends murros
{
    /**
     * Act - do whatever the murro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean bool  = false;
    public void act()
    {
        //verifico se o valor foi mudado
        if(bool)
        
            mudarTransparencia(bool);
        else
            mudarTransparencia();
    }
    //metodo para fazer com que a transparencia mude
    public void murro(boolean t)
    {
        bool = t;
        mudarTransparencia(t);   
    }
}
