import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Actor
{
    boolean atTop = true;
    /**
     * Act - do whatever the Human wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int currentY = 0;
    public Human() 
    {
        setImage("images/man01.png");
    }
    
    public void act()
    {
        // Add your action code here.
  
        if (Greenfoot.mouseClicked(null)) {
            currentY++;
        
            if (currentY > 2) {
                currentY = 0;
            }
        
            int y = 100 + currentY * 100;
            setLocation(100, y);
        }
    }
}
