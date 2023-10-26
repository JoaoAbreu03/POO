import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas 
{
    private int vidaBarbie;
    private int vidaKen;
    
    public Vidas(int vidaBarbie, int vidaKen){
        this.vidaBarbie=vidaBarbie;
        this.vidaKen=vidaKen;
    }
    public int getVidaBarbie(){
        return vidaBarbie;
    }
    public int getVidaKen(){
        return vidaKen;
    }
}
