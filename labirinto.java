import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labirinto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labirinto extends World
{

    /**
     * Constructor for objects of class labirinto.
     * 
     */
    public labirinto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        pintaMundo(0,0,0);
        populate();
        
        // o 60 e o tempo que demora um ciclo
        timer timer = new timer(40 * 60); 
        addObject(timer, 0, 0);
    }
    private void populate(){
        
       addObject(new Barbie(),200,630);
       addObject(new Ken(),1000,630);
       construirLabririnto();
       
       ganhar_butao b2 = new ganhar_butao();
       addObject(b2, 50, 250);  
       ganhar_butao b1 = new ganhar_butao();
       addObject(b1, 1150, 250);    
    }
    private void pintaMundo(int r,int g, int b){
        GreenfootImage fundo= getBackground();
        Color cor = new Color(r,g,b);
        fundo.setColor(cor);
        fundo.fill();
    }
    
    private void construirLabririnto(){
       
       // cria a barreira para dividir o mapa 
       int d = 100;
      
       for ( int i= 0; i < 5; i++ ){
           murro m = new murro();
           m.setRotation(90);
           addObject(m,600,d);
           d = d + 200;
       }
       
       d = 250;
       for ( int i= 0; i < 5; i++ ){
           murro m = new murro();
           addObject(m,d,530);
           d = d + 175;
       }
       
       d = 150;
       for ( int i= 0; i < 2; i++ ){
           murro m = new murro();
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
      
       d = 880;
       for ( int i= 0; i < 2; i++ ){
           murro m = new murro();
           addObject(m,d,330);
           d = d + 175;
       }
       
       d = 445;
       for ( int i= 0; i < 2; i++ ){
           murro_pequeno m = new murro_pequeno();
           
           m.setRotation(90);
           addObject(m,d,222);
           d = d - 300;
       }
       murro m4 = new murro();
       m4.setRotation(90);
       addObject(m4,305  ,15);
       
       d = 755;
       for ( int i= 0; i < 2; i++ ){
           murro_pequeno m = new murro_pequeno();
           m.setRotation(90);      
           addObject(m,d,222);
           d = d + 300;
       }
       
       
       murro m3 = new murro();
       m3.setRotation(90);
       addObject(m3,900  ,10);
       
       
       
    }
}