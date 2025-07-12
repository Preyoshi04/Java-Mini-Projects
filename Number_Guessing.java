import java.util.*;
import java.util.Random;
class Number_Guessing
{
    public void GuessNumber()
    {
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        
        //takes random number between 1 to 100

        int numberToGuess=r.nextInt(100);
        int userGuess=0;
        int noOfTries=0;

        System.out.println();
        System.out.println("\t---- WELCOME TO NUMBER GUESSING GAME ----");

        while(userGuess!=numberToGuess)
        {
            System.out.print("\t\tGuess our number: ");
            userGuess=sc.nextInt();
            noOfTries++;

            System.out.println();

            if(userGuess>numberToGuess)
            {
                System.out.println("\t\t---- Number is lesser!!---- ");
                System.out.println("-----------------------------------------------");
                System.out.println("\t\tWRONG GUESS!!\n\tTRY AGAIN!!\n");
            }
            else if(userGuess<numberToGuess)
            {
                System.out.println("\t\t---- Number is greater!!---- ");
                System.out.println("\t\tWRONG GUESS!!\n\t\tTRY AGAIN!!\n");
            }
            else if(userGuess==numberToGuess)
            {
                System.out.println("\t******* PERFECT ******\n\t******* YOU GET IT *******");
            }
        }
        System.out.println();
        System.out.println("\t You have got your answer after "+noOfTries+" tries !!! ");

    }

    public static void main(String args[])
    {
        Number_Guessing obj = new Number_Guessing();
        obj.GuessNumber();
    }
}