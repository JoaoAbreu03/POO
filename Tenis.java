import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tenis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tenis extends World
{
    private int  equipa, jogador;
    /**
     * Constructor for objects of class Tenis.
     * 
     */
    public Tenis()
    {    
        super(1200, 700, 1); 
        pintaMundo(0,128,0);
        populate();
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
    private void populate(){
        addObject(new Barbie(),944,149);
        addObject(new Ken(),944,476);
        addObject(new Jogadora1(),181,149);
        addObject(new Jogadora2(),174,476);
        addObject(new Rede(),600,350);
        equipa();
        //addObject(new Bola(),400,350);
    }
    public void equipa(){
    equipa=Greenfoot.getRandomNumber(2)+1;
    jogador=Greenfoot.getRandomNumber(2)+1;
    //equipa 1 barbie e ken
    if(equipa==1){
        //jogador1 barbie
        if(jogador==1){
            addObject(new Bola(),944,149);
        //jogador2 ken  
        }else if(jogador==2){
           addObject(new Bola(),944,476);
        }
        //equipa 2 jogadora1 e jogadora 2
    }else if(equipa==2){
        if(jogador==1){
           addObject(new Bola(),181,149);
        }else if(jogador==2){
            addObject(new Bola(),174,476);
        }
    }
}
}
