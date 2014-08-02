import greenfoot.*;
import java.awt.Font;
import java.awt.Color;

public class numberBall extends Actor
{
    private int ballNumber = 0;
    private int ballWidth = 0;
    static int FONTHEIGHT = 16;
    static int FONTWIDTH = 8;
    
    public numberBall(int number)
    {
        ballNumber = number;
        setNumberText();        
    }
    
    public void act() 
    {

    }

     public void setNumberText()
    {
        setImage("ball.png");  
        GreenfootImage image = getImage();        
        Font AFont = new Font("Calibri", 1, FONTHEIGHT);    
        image.setFont(AFont);
        image.setColor(new Color(0,0,0));         
        String numberText = ""+ ballNumber;
        centreText(numberText, image); 
    }
    
    private void centreText(String theText, GreenfootImage theImage)
    {
        if(theText !="")
        {
            int textLength = theText.length() * FONTWIDTH;
            int XPos = theImage.getWidth()/2 - textLength/2;
            int Ypos = theImage.getHeight()/2 + FONTHEIGHT/2;
            theImage.drawString(theText,XPos, Ypos);
        }
    }
   
    public int getBallWidth()
    {
        GreenfootImage thisImage = getImage();
        return thisImage.getWidth();
    }
   
    public int getBallNumber()
    {
        return ballNumber;
    }
    
    public void setBallNumber(int number)
    {
       ballNumber = number;
    } 
}
