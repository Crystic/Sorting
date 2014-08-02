import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Random;

public class SortingWorld extends World
{
    static int BUTTONHEIGHT = 320;
    public SortingWorld()
    {    
        super(600, 400, 1);
        setBackground("crumpled-paper.jpg");
        populate();
    }

    private void populate()
    {
        numberBall thisNumberBall = new numberBall(Greenfoot.getRandomNumber(48) + 1);
        placeBall(thisNumberBall, 0, 2);
        thisNumberBall = new numberBall(Greenfoot.getRandomNumber(48) + 1);
        placeBall(thisNumberBall, 1, 2);
        thisNumberBall = new numberBall(Greenfoot.getRandomNumber(48) + 1);
        placeBall(thisNumberBall, 2, 2);
        thisNumberBall = new numberBall(Greenfoot.getRandomNumber(48) + 1);
        placeBall(thisNumberBall, 3, 2);
        thisNumberBall = new numberBall(Greenfoot.getRandomNumber(48) + 1);
        placeBall(thisNumberBall, 4, 2);
        thisNumberBall = new numberBall(Greenfoot.getRandomNumber(48) + 1);
        placeBall(thisNumberBall, 5, 2); 
              
        sortButton thisSortButton = new sortButton();
        thisSortButton = new sortButton();
        addObject(thisSortButton, 300, 300);

    }

    private void placeBall(numberBall numberBallToPlace, int objectNumber, int numberOfObjects)
    {
        int ballWidth = numberBallToPlace.getBallWidth();
        int XPos = getWidth()/2 - 65 + (objectNumber - numberOfObjects/2) * (ballWidth + ballWidth/2);
        int YPos = getHeight()/2;
        addObject(numberBallToPlace, XPos, YPos);    
    }
   
    public void sortNumbers()
    {
        List balls = getObjects(numberBall.class);
        numberBall firstBall = (numberBall)(balls.get(0));
        numberBall secondBall = (numberBall)balls.get(1);
        numberBall thirdBall = (numberBall)balls.get(2);
        numberBall fourthBall = (numberBall)balls.get(3);
        numberBall fifthBall = (numberBall)balls.get(4);
        numberBall sixthBall = (numberBall)balls.get(5);

        for(int i=0; i<36; i++)
        {
         if(firstBall.getBallNumber() > secondBall.getBallNumber())
            {
                int tempNum = firstBall.getBallNumber();
                firstBall.setBallNumber(secondBall.getBallNumber());
                firstBall.setNumberText();
                secondBall.setBallNumber(tempNum);
                secondBall.setNumberText();
            }
         
         if(secondBall.getBallNumber() > thirdBall.getBallNumber())
            {
                int tempNum = secondBall.getBallNumber();
                secondBall.setBallNumber(thirdBall.getBallNumber());
                secondBall.setNumberText();
                thirdBall.setBallNumber(tempNum);
                thirdBall.setNumberText();
            }
         
         if(thirdBall.getBallNumber() > fourthBall.getBallNumber())
            {
                int tempNum = thirdBall.getBallNumber();
                thirdBall.setBallNumber(fourthBall.getBallNumber());
                thirdBall.setNumberText();
                fourthBall.setBallNumber(tempNum);
                fourthBall.setNumberText();
            }
         
         if(fourthBall.getBallNumber() > fifthBall.getBallNumber())
            {
                int tempNum = fourthBall.getBallNumber();
                fourthBall.setBallNumber(fifthBall.getBallNumber());
                fourthBall.setNumberText();
                fifthBall.setBallNumber(tempNum);
                fifthBall.setNumberText();
            }
        
         if(fifthBall.getBallNumber() > sixthBall.getBallNumber())
            {
                int tempNum = fifthBall.getBallNumber();
                fifthBall.setBallNumber(sixthBall.getBallNumber());
                fifthBall.setNumberText();
                sixthBall.setBallNumber(tempNum);
                sixthBall.setNumberText();
             }
        }
        

    }
}
