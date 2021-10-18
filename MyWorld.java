import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player player = new player();
        addObject(player,200,400);
        player.setLocation(0,200);
        enemy enemy = new enemy();
        addObject(enemy,150,Greenfoot.getRandomNumber(400));
        enemy enemy1 = new enemy();
        enemy1.setRotation(90);
        addObject(enemy1,300,Greenfoot.getRandomNumber(400));
        enemy enemy2 = new enemy();
        enemy2.setRotation(90);
        addObject(enemy2,450,Greenfoot.getRandomNumber(400));
        enemy.setRotation(90);
        enemy enemy3 = new enemy();
        addObject(enemy3,282,Greenfoot.getRandomNumber(400));
        enemy enemy4 = new enemy();
        addObject(enemy4,433,Greenfoot.getRandomNumber(400));
        enemy2.setRotation(90);
        enemy3.setRotation(90);
        fruit fruit = new fruit();
        addObject(fruit,534,215);
    }
}