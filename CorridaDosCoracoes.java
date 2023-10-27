import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CorridaDeCarros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CorridaDosCoracoes extends World
{
    //criacao dos objetos
    car1 carro1 = new car1();
    car2 carro2 = new car2();
    
    public void act()
    {
        //quando os dois carros apanharem os 9 coracoes cada, aumenta a pontuacao e muda de mundo
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
        
        super(1200, 700, 1);
        
        preparaObjetos(); 
        //coloca o timer a 30 segundos
        timer timer = new timer(30 * 60); 
        addObject(timer, 0, 0);
        
        int pontuacaoFinal = Pontuacao.getPontuacaoTotal();
        showText("Pontuação "+ pontuacaoFinal, 1100,50);
    }
    private void preparaObjetos(){
        //adiciona os carros, cones e coracoes de cada cor
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
    //recebe os pontos e adiciona a pontuacao final
    public void ganharPontos(int pontos) {
        Pontuacao.adicionarPontos(pontos);
    }
    

}
