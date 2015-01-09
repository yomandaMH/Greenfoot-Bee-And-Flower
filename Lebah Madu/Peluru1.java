import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru1 extends Actor
{
    /**
     * Act - do whatever the Peluru1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+2,getY());
        
        if(getX()==494)
        {
           getWorld().removeObject(this);
           return;
        }
        
        Batu1 d=(Batu1)getOneIntersectingObject(Batu1.class);
        Batu2 e=(Batu2)getOneIntersectingObject(Batu2.class);
        
         if(d!=null)
        {
            Greenfoot.playSound("fire.wav");
            getWorld().removeObject(d);
            return;
        }
        
        if(e!=null)
        {
            Greenfoot.playSound("fire.wav");
            getWorld().removeObject(e);
            return;
        }
        
        
    }    
}
