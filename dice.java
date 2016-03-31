import java.util.Scanner;
import java.util.Random; 

public class dice {

   
    public static void main(String args[])
	{
	
		
		Scanner input = new Scanner( System.in );	
		Random generator = new Random();

		int diceNumber;
		float numberOfGames = 0;
		float gamesWon = 0; 
		float oddTotal = 0;
		float evenTotal = 0;
		float percentWon;
		float percentOdd;
		float percentEven;
		String userGuess;
		String userGuessCaps;
		String userAnswer;
		String userAnswerCaps;
		boolean repeat = true;
		
		
		
		while (repeat)
		{

			diceNumber = generator.nextInt(5)+1;
			System.out.println();
			System.out.println("A Dice Has Been Rolled!");
			System.out.println();
			System.out.println("Did The Dice Land on An Even or Odd Number?");
			userGuess = input.next();
			userGuessCaps= userGuess.toUpperCase();

			if (userGuessCaps.equals("EVEN") && diceNumber == 2 || userGuessCaps.equals("EVEN") && diceNumber == 4 
							|| userGuessCaps.equals("EVEN") && diceNumber == 6)
			{
				System.out.println("The Dice Landed on " + diceNumber + " You Guessed Correctly");
				numberOfGames++; 
				gamesWon++;
				evenTotal++;
			}

			else if (userGuessCaps.equals("EVEN") && diceNumber == 1 || userGuessCaps.equals("EVEN") && diceNumber == 3 
							|| userGuessCaps.equals("EVEN") && diceNumber == 5)
			{
				System.out.println ("The Dice Landed on " + diceNumber + " You Guessed Incorrectly");
				numberOfGames++;
				evenTotal++; 
			}

			else if (userGuessCaps.equals("ODD") && diceNumber == 2 || userGuessCaps.equals("ODD") && diceNumber == 4 
							|| userGuessCaps.equals("ODD") && diceNumber == 6)
			{
				System.out.println("The Dice Landed on " + diceNumber + " You Guessed Incorrectly");
				numberOfGames++;
				oddTotal++;
			}

			else if (userGuessCaps.equals("ODD") && diceNumber == 1 || userGuessCaps.equals("ODD") && diceNumber == 3 
							|| userGuessCaps.equals("ODD") && diceNumber == 5)
			{
				System.out.println ("The Dice Landed on " + diceNumber + " You Guessed Correctly");
				numberOfGames++;
				gamesWon++;
				oddTotal++;
			}

			System.out.println();
			System.out.println("Would You Like to Play Again? ENTER Yes or No");
			userAnswer = input.next();
			userAnswerCaps= userAnswer.toUpperCase();

			if(userAnswerCaps.equals("YES"))
			{
				repeat = true;
			}
			else 
			{
				repeat = false; 
			}
		}

		percentWon = (gamesWon / numberOfGames) * 100; 
		percentOdd = (oddTotal / numberOfGames) * 100;
		percentEven = (evenTotal / numberOfGames) * 100;

		System.out.println("You have Played " + numberOfGames + " Games");
		System.out.println("You have Won " + percentWon + "% of your Games");
		System.out.println("Of Those Game You Have Chosen Even " + percentEven + "% Of the Time.");
		System.out.println("Of Those Game You Have Chosen Odd " + percentOdd + "% Of the Time.");

       }
}