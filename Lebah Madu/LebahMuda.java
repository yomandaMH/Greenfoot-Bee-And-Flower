import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LebahMuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LebahMuda extends Actor
{
    /**
     * Act - do whatever the LebahMuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private TamanBunga pelor; 
    public void addedToWorld(World dunia)
    {
        pelor = (TamanBunga) dunia;
    }
    
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("x"))
        {
            pelor.addObject(new Peluru1(), getX(),getY());
            Greenfoot.playSound("fire.wav");
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+1,getY());
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-1,getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-1);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+1);
        }
        
        Bunga1 a=(Bunga1)getOneIntersectingObject(Bunga1.class);
        Bunga2 b=(Bunga2)getOneIntersectingObject(Bunga2.class);
        Bunga3 c=(Bunga3)getOneIntersectingObject(Bunga3.class);
        Batu1 d=(Batu1)getOneIntersectingObject(Batu1.class);
        Batu2 e=(Batu2)getOneIntersectingObject(Batu2.class);
        
        if(a!=null)
        {
            Greenfoot.playSound("makan.wav");
            getWorld().removeObject(a);
            return;
        }
        
        if(b!=null)
        {
            Greenfoot.playSound("makan.wav");
            getWorld().removeObject(b);
            return;
        }
        
        if(c!=null)
        {
            Greenfoot.playSound("makan.wav");
            getWorld().removeObject(c);
            return;
        }
        
        if(d!=null)
        {
            setImage("gameover.png");
            Greenfoot.playSound("lose.wav");
            getWorld().removeObject(d);
            return;
        }
        
        if(e!=null)
        {
            setImage("gameover.png");
            Greenfoot.playSound("lose.wav");
            getWorld().removeObject(e);
            return;
        }
      
    }    
}
