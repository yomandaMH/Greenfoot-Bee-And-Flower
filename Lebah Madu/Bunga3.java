import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bunga3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bunga3 extends Actor
{
    /**
     * Act - do whatever the Bunga3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()-1);
        if(getY()==0)
        {
            setLocation(getX(), 495);
        }
    }    
}
