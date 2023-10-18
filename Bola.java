import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Bola here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Bola extends Actor
{
private int golos, golosMarcar, equipa, jogador,pontos;
private boolean numeroPontosGerado=false;
GreenfootImage bola1,bola2;
public Bola(){
    GreenfootImage image = getImage();
    int witdth = image.getWidth();
    int height = image.getHeight();
    image.scale(witdth/2,height/2);
    bola1= new GreenfootImage("BolaBarbie.png");
    bola1.scale(witdth/2,height/2);
    bola2= new GreenfootImage("tenis1.png");
    golos=0;
    pontos=0;
}
/**
 * Act - do whatever the Bola wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
public void act(){
    mudar();
    moveBola();
    if(getWorld() instanceof Futebol){
    contapontos();
    }
    if(!numeroPontosGerado){
        golosMarcar=Greenfoot.getRandomNumber(2)+2;
        getWorld().showText("Pontos a marcar: "+ golosMarcar, 1110,650);
        numeroPontosGerado=true;
    }
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
        if (getWorld() instanceof Futebol) {
            if((x>xbarbie) && (y<ybarbie)) {
                 setLocation(x+6, y-6);
            }else if((x<xbarbie) && (y<ybarbie)){
             setLocation(x-6, y-6);
            }else if((x>xbarbie) && (y>ybarbie)) {
             setLocation(x+6, y+6);
            }
            else if((x<xbarbie) && (y>ybarbie)){
             setLocation(x-6, y+6);
            }
            else if(x<xbarbie){
             setLocation(x, y-6);
            }
            else if(x>xbarbie){
             setLocation(x, y+6);
            }
            else if(y>ybarbie){
             setLocation(x-6,y);
            }
            else if (y<ybarbie){
             setLocation(x+6, y);
            }
        }else  if(getWorld() instanceof Tenis){
            setLocation(x-Greenfoot.getRandomNumber(getWorld().getWidth()-50),y-Greenfoot.getRandomNumber(getWorld().getHeight()-50));
            if(getX()>=1050 || getX()<=150 || getY() <= 100 || getY() >= 650 ||getX()>=550){
                pontosequipa2();
                setLocation(402,340);
            }
            if(isTouching(Rede.class)){
                pontosequipa2();
                setLocation(402,340);
            }
        }
    }else if(isTouching(Ken.class)){
        int xken = ken.getX();
        int yken = ken.getY();
        if(getWorld() instanceof Futebol){
            if( (x>xken) && (y<yken)) {
                 setLocation(x+6, y-6);
            }else if((x<xken) && (y<yken)){
             setLocation(x-6, y-6);
            }else if( (x>xken) && (y>yken)){
             setLocation(x+6, y+6);
            }
            else if( (x<xken) && (y>yken)){
             setLocation(x-6, y+6);
            }
            else if(x<xken){
             setLocation(x, y-6);
            }
            else if(x>xken){
             setLocation(x, y+6);
            }
            else if(y>yken){
             setLocation(x-6,y);
            }
            else if (y<yken){
             setLocation(x+6, y);
            }
        }else if(getWorld() instanceof Tenis){
            setLocation(x-Greenfoot.getRandomNumber(getWorld().getWidth()-100),y-Greenfoot.getRandomNumber(getWorld().getHeight()-100));
            if(getX()>=1050 || getX()<=150 || getY() <= 100 || getY() >= 650 ||getX()>=550){
            pontosequipa2();
            setLocation(402,340);
            }
            if(isTouching(Rede.class)){
                pontosequipa2();
                setLocation(402,340);
            }
        }
    }else if(isTouching(Jogadora1.class)){
        setLocation(x+Greenfoot.getRandomNumber(getWorld().getWidth()-100),y+Greenfoot.getRandomNumber(getWorld().getHeight()+100));
        if(getX()>=1050 || getX()<=150 || getY() <= 100 || getY() >= 650 ||getX()<=600){
            contapontos();
            setLocation(784,309);
        }
        if(isTouching(Rede.class)){
                contapontos();
                setLocation(784,309);
        }
    }else if(isTouching(Jogadora2.class)){
        setLocation(x+Greenfoot.getRandomNumber(getWorld().getWidth()-100),y+Greenfoot.getRandomNumber(getWorld().getHeight()+100));
        if(getX()>=1050 || getX()<=150 || getY() <= 100 || getY() >= 650 ||getX()<=600){
            contapontos();
            setLocation(784,309);
        }
        if(isTouching(Rede.class)){
            contapontos();
            setLocation(784,309);
        }
    }
}
private void contapontos(){
    if(getWorld() instanceof Futebol){
        if(isTouching(Guarda.class)){
            Greenfoot.playSound("naah.mp3");
            Greenfoot.delay(5);
            setLocation(650,550);
        }else if(isTouching(Baliza.class)){
            Greenfoot.playSound("siuuu.mp3");
            golos=golos+1;
            getWorld().showText("Golos: "+golos, 100,650);
            Greenfoot.delay(5);
            setLocation(650,550);
        }
    }else if(getWorld() instanceof Tenis){
            golos=golos+1;
            getWorld().showText("Equipa Barbie: "+golos, 400,650);
            Greenfoot.delay(5);
    } 
    }
private void pontosequipa2(){
            pontos=pontos+1;
            getWorld().showText("Equipa 2 : "+pontos, 100,650);
            Greenfoot.delay(5);
    }
public void mudar(){
    if (getWorld() instanceof Futebol) {
        setImage(bola1);
    }else if(getWorld() instanceof Tenis){
        setImage(bola2);
    }
    
}

public void passarnivel(){
    if (getWorld() instanceof Futebol) {
        if(golos==golosMarcar){
            Greenfoot.setWorld(new Tenis());
        }
    }else if(getWorld() instanceof Tenis){
         if(golos==golosMarcar || pontos == golosMarcar){
             if(pontos >= golos){
                 Greenfoot.delay(5);
                 getWorld().showText("Perdeu o jogo ", 600,350);
                 Greenfoot.delay(5);
                 Greenfoot.setWorld(new Tenis());
         }else if(pontos < golos){
            Greenfoot.setWorld(new CorridaDeCarros());
        }
        }
    }
}
}