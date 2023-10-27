import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labirinto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labirinto2 extends World
{
    //variaveis globais para podemos obter dados dos jogadores durante o jogow
    Ken k = new Ken();
    Barbie b = new Barbie(); 
    public labirinto2()
    {    
        super(1200, 700, 1);
        //adiciona todos os objetos necessarios do mundo
        populate();
       
        addObject(b,200,630);
        addObject(k,1000,630);
        
        int pontuacaoFinal = Pontuacao.getPontuacaoTotal();
        showText("Pontuação "+ pontuacaoFinal, 1100,50);
    }
    
    //aqui quero que durante a duração do mundo esteja sempre a verificar se a
    //vida dos jogados foi alterada ent para isso coloquei as variaveis globais
    //para aceder aos valores da vida aqui
    public void act(){
       showText("Vida Barbie: " + b.getVida(), 100,50);
       showText("Vida Ken: " + k.getVida(), 1100,80);
    }
    private void populate(){
       //adiciona os adversarios
       addObject(new aranha(),600,480);
       addObject(new aranha(),300,250);
       construirLabririnto();
       ganhar_butao b1 = new ganhar_butao();
       b1.l2 = true;
       addObject(b1, 50, 250); 
    }
    //cria os murros do mundo
    private void construirLabririnto(){
       int d = 250;
       for ( int i= 0; i < 5; i++ ){
           murro m = new murro();
           m.murro(true);
           addObject(m,d,530);
           d = d + 175;
       }
       
       d = 150;
       for ( int i= 0; i < 4; i++ ){
           murro m = new murro();
           m.murro(true);
           addObject(m,d,330);
           d = d + 175;
       }
       
       d = 1100;
       for ( int i= 0; i < 1; i++ ){
           murro m = new murro();
           m.murro(true); 
           addObject(m,d,330);
           d = d + 175;
       }
       
       murro_pequeno m = new murro_pequeno();
       m.murro_pequeno(true); 
       m.setRotation(90);
       addObject(m,145,222);
       
       d = 305;
       for ( int i= 0; i < 2; i++ ){
           murro m4 = new murro();
           m4.murro(true);
           m4.setRotation(90);
           addObject(m4,d  ,10);
           d = d+ 275;
       }
          
       murro_pequeno m3 = new murro_pequeno();
       m3.murro_pequeno(true);  
       m3.setRotation(90);
       addObject(m3,797  ,225);
       
       murro m2 = new murro();
       m2.murro(true);
       addObject(m2,920,135);
       
    }
}
