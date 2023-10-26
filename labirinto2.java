import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labirinto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labirinto2 extends World
{

    /**
     * Constructor for objects of class labirinto2.
     * 
     */
    public labirinto2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1);
        populate();
    }
    private void populate(){
        
       addObject(new Barbie(),200,630);
       addObject(new Ken(),1000,630);
       addObject(new aranha(),600,480);
       addObject(new aranha(),300,250);
       construirLabririnto();
       ganhar_butao b1 = new ganhar_butao();
       addObject(b1, 50, 250); 
       
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
    
    private void construirLabririnto(){
       
       // cria a barreira para dividir o mapa 
       
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
       
       //enconstado a parede do lado do ken
       /*
       d = 777;
       for ( int i= 0; i < 2; i++ ){
           murro m = new murro();
           addObject(m,d,330);
           d = d + 175;
       }
       */
      
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
