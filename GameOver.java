import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        textos();
        Pontuacao.resetPontuacao();
    }
    private void textos()
    {
        int pontuacaoFinal = Pontuacao.getPontuacaoTotal(); // Obtém a pontuação total
        if(pontuacaoFinal==100){
             addObject(new Win(),604,188);
            addObject(new JogarNovamente(),593,280);
        }else{
            addObject(new GameOvertexto(),604,188);
            addObject(new recomecar(),593,280);
        }
       
        PontuacaoFinal actorPontuacaoFinal = new PontuacaoFinal(pontuacaoFinal); // Cria o ator
        addObject(actorPontuacaoFinal, getWidth() / 2, getHeight() / 2); // Adiciona o ator ao centro do mundo
    }
    
}
