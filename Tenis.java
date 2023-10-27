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
         // o 60 e o tempo que demora um ciclo
        timer timer = new timer(40 * 60); 
        addObject(timer, 0, 0);

    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
    private void populate(){
        addObject(new Margem(),607,335);
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
    
    if(equipa==1){
        //equipa barbie
      
            addObject(new Bola(),784,309);
        
        //equipa 2 
    }else if(equipa==2){
        
           addObject(new Bola(),402,340);
    
    }
}
}
