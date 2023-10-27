import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PontuacaoFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PontuacaoFinal extends Actor
{
    private int pontuacaoFinal;

    public PontuacaoFinal(int pontuacao) {
        pontuacaoFinal = pontuacao;
        setImage(new GreenfootImage("Pontuação Final: " + pontuacaoFinal, 24, Color.WHITE, Color.BLACK));
    }
}
