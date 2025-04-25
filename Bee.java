import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bee()
    {
        setImage("images/bee.png");
    }
    
    public void act()
    {
        move(-10);
        
        if (getX() <= 0)
        {
            resetBee();
        }
        
        if (isTouching(Human.class))
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBee()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num==0)
        {
            setLocation(600,300);
        } else {
            setLocation(600,100);
        }
        
    }
}
