import java.util.Scanner;
/**
 * 20 guesses to guess the random generated number
 *
 * @author (Tamulavage)
 * @version (2/5)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int randNum;
    private int userVal;
    private int attempts;
    private int lastuserVal;
    boolean gameWinner;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        System.out.println("Pick a number between 1 and 100, you have 20 guesses");
        // initialise instance variables
        lastuserVal = 0;
        
        randNum = getRandomNum();
    //  System.out.println(randNum);
        attempts = 0;
        
        while(gameWinner != true && attempts < 20)
        {
        userVal = getUserInput();   
        if(lastuserVal != userVal){
            attempts++;
        }
        
        if(userVal == randNum){
        gameWinner = true;
          System.out.println("You won!!");
          System.out.println("It took you " + attempts + " to guess correctly" );
    }
     if(userVal > randNum)
        {
             System.out.println("To High");
        }
       if(userVal < randNum)
        {
             System.out.println("To low");
        }
        lastuserVal = userVal;
    } // end While
    
     if(gameWinner != true)
     {System.out.println("Sorry, You lost");
        }
        
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getRandomNum()
    {
        // put your code here
        int ran = 0;
        
        ran = 1+ (int)(Math.random() * 100);
        
        return ran ;
    }
    
     public int getUserInput()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your guess? ");
        int guess = reader.nextInt();
        // close reader
        reader.close();
        
        return guess;
    }
}
