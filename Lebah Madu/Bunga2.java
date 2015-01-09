import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bunga2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bunga2 extends Actor
{
    /**
     * Act - do whatever the Bunga2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation (getX()-1, getY());
        if(getX()==0)
        {
            setLocation(495, getY());
        }
    }    
}
