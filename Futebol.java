import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Futebol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Futebol extends World
{
    /*public int vidaBarbie=3;
    public int vidaKen=3;*/
    //private Cronometro cronometro;
    /**
     * Constructor for objects of class Futebol.
     * 
     */
    public Futebol()
    {    
       super(1200, 700, 1);  
       //cronometro=new Cronometro();
       // addObject(new Cronometro(100), 400, 200); // Create a timer that lasts for 100 act cycles
         // o 60 e o tempo que demora um ciclo
        timer timer = new timer(40 * 60); 
        addObject(timer, 0, 0);
           
       atores();
    }
     public void atorGanhaPontos(int pontos) {
        Pontuacao.adicionarPontos(pontos);
    }
    public void act(){
        //verificavida();
        /*cronometro=new Cronometro();
        
        cronometro.act();
        showText("Tempo: "+cronometro.getTempoAtual(), 100,50);
        if(cronometro.getTempoAtual()>=40){
           Greenfoot.setWorld(new GameOver());
        }*/
        //cronometro=new Cronometro(10);
    }
    
    private void atores(){
        
        addObject(new Baliza(),600,50);
        addObject(new Bola(),450,520);
        addObject(new Barbie(),360,570);
        addObject(new Ken(),340,540);
        addObject(new Guarda(),615,225);
       
        //addObject(new Cronometro(40, 200));
        //showText("Vida Barbie: "+vidaBarbie, 100,50);
        //showText("Vida Ken: "+vidaKen, 1100,50);
        
    }
    /*public void vidaBarbie(int vida){
        //1 true ou seja ganhou vida
        if(vida==1){
            vidaBarbie=vidaBarbie+1;
            showText("Vida Barbie: "+vidaBarbie, 100,50);
        }//0 false ou seja perdeu vida
        else if (vida==0){
            vidaBarbie=vidaBarbie-1;
            showText("Vida Barbie: "+vidaBarbie, 100,50);
        }
        
    }*/
    /*public void vidaKen( int vida){
        if(vida==1){
             vidaKen=vidaKen+1;
            showText("Vida Ken: "+vidaKen, 1100,50);
        }else if (vida==0){
            vidaKen=vidaKen-1;
            showText("Vida Ken: "+vidaKen, 1100,50);
        }
        
    }*/
    /*public void verificavida(){
        //verifica se a vida da Barbie ou do Ken é iguala zero
        if(vidaKen==0 || vidaBarbie==0){
            //se a vida do ken for 0 e a da barbie for maior que 1 ela doa uma vida ao ken
            if(vidaKen==0 && vidaBarbie>1){
                vidaBarbie=vidaBarbie-1;
                showText("Vida Barbie: "+vidaBarbie, 100,50);
                vidaKen=vidaKen+1;
                showText("Vida Ken: "+vidaKen, 1100,50);
                //se a vida do ken for maior que 1 e a do ken for zero ele doa uma vida ao ken
            }else if(vidaKen>1 && vidaBarbie==0){
                vidaBarbie=vidaBarbie+1;
                showText("Vida Barbie: "+vidaBarbie, 100,50);
                vidaKen=vidaKen-1;
                showText("Vida Ken: "+vidaKen, 1100,50);
                //caso contrario eles perdem o jogo
            }else {
                Greenfoot.setWorld(new GameOver());
            }
        }
    }*/
}
