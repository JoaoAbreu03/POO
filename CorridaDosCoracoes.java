import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CorridaDeCarros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CorridaDosCoracoes extends World
{
    car1 carro1 = new car1();
    car2 carro2 = new car2();
    
    public void act()
    {
        if(carro1.getCoracoes()==9 && carro2.getCoracoes()==9 ){
            ganharPontos(20);
            Greenfoot.setWorld(new labirinto());
        }
    }
    
    /**
     * Constructor for objects of class CorridaDeCarros.
     * 
     */
    public CorridaDosCoracoes()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1);
        //GreenfootImage background = new GreenfootImage("pistaDeCarros2.png"); // Load your background image
        //setBackground(background);
        preparaObjetos(); 
        
        timer timer = new timer(40 * 60); 
        addObject(timer, 0, 0);
        
        int pontuacaoFinal = Pontuacao.getPontuacaoTotal();
        showText("Pontuação "+ pontuacaoFinal, 1100,50);
    }
    private void preparaObjetos(){
        addObject(new fundo_relva(),600,350);
        addObject(carro1,480,104);
        addObject(carro2,480,160);
       
        for (int i=0; i<10; i++) {
            Cone cone = new Cone();
            addObject(cone, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        for (int i=0; i<9; i++) {
            Coracao_azul coracao = new Coracao_azul();
            addObject(coracao, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        for (int i=0; i<9; i++) {
            Coracao_amarelo coracao = new Coracao_amarelo();
            addObject(coracao, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    public void ganharPontos(int pontos) {
        Pontuacao.adicionarPontos(pontos);
    }
    

}
