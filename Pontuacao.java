import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pontuacao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pontuacao 
{
    private static int pontuacaoTotal = 0;

    public static int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public static void adicionarPontos(int pontos) {
        pontuacaoTotal += pontos;
    }
     public static void resetPontuacao() {
        pontuacaoTotal = 0;
    }
    
    
}
