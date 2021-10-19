import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkKeys();
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
}
