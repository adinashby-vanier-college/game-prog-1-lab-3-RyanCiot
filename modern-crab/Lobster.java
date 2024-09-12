// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        initDirection();
        moveAround();
        eat();
        army();
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        if (Crab != null) {
            World world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * 
     */
    public void initDirection()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }

    /**
     * 
     */
    public void army()
    {
        Actor Worm = getOneIntersectingObject(Worm.class);
        if (Worm != null) {
            World world = getWorld();
            int xLocation = Worm.getX();
            int yLocation = Worm.getY();
            world.removeObject(Worm);
            Actor Lobster =  new Lobster();
            world.addObject(Lobster, xLocation, yLocation);
            Greenfoot.playSound("Transform.wav");
        }
    }
}
