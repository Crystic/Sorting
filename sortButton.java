import greenfoot.*;
import java.awt.Font;
import java.awt.Color;

public class sortButton extends Actor
{
    private static int FONTHEIGHT = 16;
    private static int FONTWIDTH = 8;
    
    public sortButton()
    {
        setImage("button-green.png");  
        GreenfootImage image = getImage();
        Font AFont = new Font("Calibri", 1, FONTHEIGHT);
        image.setFont(AFont);
        image.setColor(new Color(0,0,0));
        String theText = "SORT";
        int textLength = theText.length() * FONTWIDTH;
        int XPos = image.getWidth()/2 - (textLength + 1)/2;
        int Ypos = image.getHeight()/2 + FONTHEIGHT/4;
        image.drawString(theText,XPos, Ypos);
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            SortingWorld thisWorld = (SortingWorld)getWorld();
            thisWorld.sortNumbers();
        }
    }    
     
    public int getButtonWidth()
    {
        GreenfootImage thisImage = getImage();
        return thisImage.getWidth();
    }
}
