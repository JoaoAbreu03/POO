import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class murro_pequeno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class murro_pequeno extends murros
{
    /**
     * Act - do whatever the murro_pequeno wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean bool  = false;
    public void act()
    {
        if(bool)
        
            mudarTransparencia(bool);
        else
            mudarTransparencia();
    }
    //metodo para fazer com que a transparencia mude
    public void murro_pequeno(boolean t)
    {
        bool = t;
        mudarTransparencia(t);   
    }
}
