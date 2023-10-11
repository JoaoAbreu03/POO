import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{

    private int golos, golosMarcar;  
    private boolean numeroGolosGerado=false;
    
     public Bola()
    {
       golos=0;
    }
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        moveBola();
        contagolos();
        if(!numeroGolosGerado){
        
         golosMarcar=Greenfoot.getRandomNumber(2)+2;
         getWorld().showText("Golos a marcar: "+golosMarcar, 750,50);
         numeroGolosGerado=true;
        }
        //golosMarcar=Greenfoot.getRandomNumber(6)+5;
        //getWorld().showText("Golos a marcar: "+golosMarcar, 750,50);
        passarnivel();
        
    }
    private void moveBola(){
        GreenfootImage image = getImage();
        int width = image.getWidth();
        int height = image.getHeight();
        Actor barbie=getOneIntersectingObject(Barbie.class);
        Actor ken=getOneIntersectingObject(Ken.class);
        int x =  getX();
        int y = getY();
        if(isTouching(Barbie.class)){
            
            int xbarbie = barbie.getX();
            int ybarbie = barbie.getY();
            
            if((x>xbarbie) && (y<ybarbie)) {
                 setLocation(x+2, y-2);
            }else if((x<xbarbie) && (y<ybarbie)){
             setLocation(x-2, y-2);
            }else if((x>xbarbie) && (y>ybarbie)) {
             setLocation(x+2, y+2);
            }
            else if((x<xbarbie) && (y>ybarbie)){
             setLocation(x-2, y+2);
            }
            else if(x<xbarbie){
             setLocation(x, y-2);
            }
            else if(x>xbarbie){
             setLocation(x, y+2);
            }
            else if(y>ybarbie){
             setLocation(x-2,y);
            }
            else if (y<ybarbie){
             setLocation(x+2, y);
            }
        }else if(isTouching(Ken.class)){
            int xken = ken.getX();
            int yken = ken.getY();
            if( (x>xken) && (y<yken)) {
                 setLocation(x+2, y-2);
            }else if((x<xken) && (y<yken)){
             setLocation(x-2, y-2);
            }else if( (x>xken) && (y>yken)){
             setLocation(x+2, y+2);
            }
            else if( (x<xken) && (y>yken)){
             setLocation(x-2, y+2);
            }
            else if(x<xken){
             setLocation(x, y-2);
            }
            else if(x>xken){
             setLocation(x, y+2);
            }
            else if(y>yken){
             setLocation(x-2,y);
            }
            else if (y<yken){
             setLocation(x+2, y);
            }
        }
    }
    private void contagolos(){
        
        Actor balizaColidida = getOneIntersectingObject(Baliza.class);
         // Verifica se o ator tocou em Ator2
        boolean estaTocandoGuarda = isTouching(Guarda.class);

         if (balizaColidida != null && !estaTocandoGuarda) {
            // O ator tocou em Ator1, mas não tocou em Ator2
            // Faça algo aqui...
             Greenfoot.playSound("siuuu.mp3");
                golos=golos+1;
                getWorld().showText("Golos: "+golos, 100,50);
                Greenfoot.delay(4);
                setLocation(450,550);
        }else if( estaTocandoGuarda && balizaColidida != null){
           
                 Greenfoot.playSound("naah.mp3");
                Greenfoot.delay(4);
                setLocation(450,550);
        }
        // if ((isTouching(Baliza.class)) && (!isTouching(Guarda.class))
        //Actor guardaColidido = getOneIntersectingObject(Guarda.class);
        /*if (isTouching(Baliza.class)) 
        {
            Actor guardaColidido = getOneIntersectingObject(Guarda.class);
            if(guardaColidido!=null){
                Greenfoot.playSound("naah.mp3");
                Greenfoot.delay(4);
                setLocation(450,550);
            }else if(guardaColidido==null){
                Greenfoot.playSound("siuuu.mp3");
                golos=golos+1;
                getWorld().showText("Golos: "+golos, 100,50);
                Greenfoot.delay(4);
                setLocation(450,550);
            }*/
            /*Greenfoot.playSound("siuuu.mp3");
            golos=golos+1;
            getWorld().showText("Golos: "+golos, 100,50);
            
            Greenfoot.delay(4);
            setLocation(450,550);*/
            //nao ta a reconhecer o !istouching guuarda
            //System.out.println("Tocando AtorA, mas não AtorB.");
            
        }
       
/*
        else if (isTouching(Guarda.class) && isTouching(Baliza.class))
        {
            Greenfoot.playSound("naah.mp3");
            Greenfoot.delay(4);
            setLocation(450,550);
        }
        else if(isTouching(Guarda.class)){
            Greenfoot.playSound("naah.mp3");
            Greenfoot.delay(4);
            setLocation(450,550);
        }else if (isTouching(Baliza.class))
        {
            Greenfoot.playSound("siuuu.mp3");
            golos=golos+1;
            getWorld().showText("Golos: "+golos, 100,50);
    
            Greenfoot.delay(4);
            setLocation(450,550);
            
        }*/
    
    /*public int geraGolos(){
           if(!golosMarcar){
       
        golosMarcar=Greenfoot.getRandomNumber(6)+5;
        getWorld().showText("Golos a marcar: "+golosMarcar, 750,50);
    }
        return golosMarcar;
    }*/
//}
    public void passarnivel(){
    
        if(golos==golosMarcar){
            Greenfoot.setWorld(new Tenis());
        }
        
    }
}