import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayField extends World
{
    
    private boolean startGame = false;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PlayField()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        createBackground();
    }
    
    private void createBackground()
    {
        getBackground().setColor(Color.BLACK);
        getBackground().fillRect(0, 0,getWidth(),getHeight() );
        
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect(getWidth()/2- 2, 0, 5,getHeight() );
        
        showText (" Press spacebar to begin the game!", 200, 550);
    }
    
    
    public boolean getStarted()
    {
        return startGame;   
    }
    
}
