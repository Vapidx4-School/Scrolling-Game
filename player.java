import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private int fruitsEaten;
    private int frame = 1;
    
    public player()
    {
        image1 = new GreenfootImage("tile000.png");
        image2 = new GreenfootImage("tile001.png");
        image3 = new GreenfootImage("tile002.png");
        image4 = new GreenfootImage("tile003.png");
        setImage(image1);

        fruitsEaten = 0;
        
      
    }
    
    public void act()
    {
        checkKeys();
        animation();
        checkCollision();
        eatFruit();
    }
    
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("right")){
            setRotation(360);
            move(5);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(-360);
            move(-5);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(-90);
            move(5);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(5);
        }
    }
    private void checkCollision()
    {
        if(isTouching(enemy.class)) {
            getWorld().showText("YOU GOT EATEN!", 300, 200);
            Greenfoot.playSound("secret1.wav");
            Greenfoot.stop();
        }
    }
    public void eatFruit()
    {
        if(isTouching(fruit.class)){ 
            fruitsEaten++;
            getWorld().showText("Fruits eaten:" + fruitsEaten, 300, 200);
        }
        if(fruitsEaten == 3){
            Greenfoot.stop();
            getWorld().showText("YOU WIN!", 500, 400);
        }
    }
    public void animation()
    {
        getWorld().showText("animate", 400, 400);

        if (frame == 1)
        {
            setImage(image1);
        }
        else if(frame == 2)
        {
            setImage(image2);
        }
        else if(frame == 3)
        {
            setImage(image3);
        }
        else if(frame == 4)
        {
            setImage(image4);
            frame = 0;
            return;
        }
        frame ++;
    }
        
        
        }