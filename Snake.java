import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Snake()
    {
        setImage("images/snake.png");
    }
    
    public void act()
    {
        move(-2);
        
        if (getX() <= 0)
        {
            resetSnake();
        }
        
        if (isTouching(Human.class))
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetSnake()
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
