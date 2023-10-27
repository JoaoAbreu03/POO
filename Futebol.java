import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Futebol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Futebol extends World
{
    
    /**
     * Constructor for objects of class Futebol.
     * 
     */
    public Futebol()
    {    
       super(1200, 700, 1);  
       
         // o 60 e o tempo que demora um ciclo
        timer timer = new timer(40 * 60); 
        addObject(timer, 0, 0);
         //chama os atores que vao estar no mundo  
       atores();
       int pontuacaoFinal = Pontuacao.getPontuacaoTotal(); // Obtém a pontuação total
       showText("Pontuação "+pontuacaoFinal, 1100,50);
    }
    //atores que vão ficar no mundo
    private void atores(){
        
        addObject(new Baliza(),600,50);
        addObject(new Bola(),450,520);
        addObject(new Barbie(),360,570);
        addObject(new Ken(),340,540);
        addObject(new Guarda(),615,225);
       
      
        
    }
   
}
