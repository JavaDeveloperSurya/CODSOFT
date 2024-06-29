/*
Task1:- Number game
programmer name:-Surya kumar Gouda
Date:- 13/06/2024
*/
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
class NumberGame
{
	int randomNumber; //instance variable for storing generated random number
	Scanner sc=new Scanner(System.in);
	int userNumber;

	//main() method 
	public static void main(String[] args)
	{
		NumberGame ng=new NumberGame(); //create object of NumberGame class
		ng.randomNumber=ng.numberGenerate(); //invoke the numberGenerate() method 
		ng.winnerStatus();
		 
	}
	
	/*
		winnerStatus() method is define for check and show the result
	*/
	
	public void winnerStatus()
	{
		System.out.println("Enter how many attempts you have to take: "); 
		int attempt=sc.nextInt(); 
		int temp=attempt;
		
		userInput(); //this method is helpful for user input like username and guss number	
		while(attempt+1>2)
		{
			if(!validation())
			{
				userInput();
			}
			else
			{
				DecimalFormat df=new DecimalFormat("##.##");
				double result=((attempt+1.0)/temp)*100;
				System.out.println("Your score is "+df.format(result));
				System.out.println();
				attempt=-5;
				playAgain();
			}
			attempt--;
		}
		System.out.println("you loss the attempts");
		playAgain();
	}
	
	/*
		playAgain() method is define for play again or cancvel the game by user
	*/
	
	public void playAgain()
	{
		System.out.println("If you want to play the game again press YES or yes ");
		System.out.println("if you want to exit or cancel the game press anything else");
		String s=sc.next();
		if(s.equals("YES") || s.equals("yes"))
		{
			NumberGame n=new NumberGame();
			n.randomNumber=n.numberGenerate();
			n.winnerStatus();
			n.playAgain();
		}
		else
		System.exit(0);
	}

	/*
		numberGenerate() method is define for generating a random number in a specific range
	*/

	public int numberGenerate()
	{
		Random r=new Random(); //create Random class object
		return r.nextInt(1,101); //generate a random number within range 01-100 and return it
	}

	/*
		userInput() method is define for accept user input from console
	*/

	public void userInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess a number within (1 - 100): ");
		this.userNumber=sc.nextInt();
	}

	/*
		validation() method is define for validate user number with random number 
	*/

	public boolean validation()
	{
		if(this.randomNumber == userNumber)
		{
			System.out.println("your guess is correct");
			return true;
		}
		else if(this.randomNumber<userNumber)
		{
			System.out.println("your guess too high");
			return false;
		}
		else
		{
			System.out.println("your guess is too low");
			return false;
		}
	} 
}