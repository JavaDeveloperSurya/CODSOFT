/*
Task1:- ATM INTERFACE
programmer name:-Surya kumar Gouda
Date:- 27/06/2024
*/

import java.util.Scanner;

interface AtmMachine
{
	void withdraw(double amount);
	void deposite(double amount);
	void checkBalance();
}

class ATM implements AtmMachine
{
	public static double amount;
	public void withdraw(double amount)
	{
		if(ATM.amount<amount)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			ATM.amount-=amount;
			System.out.println("Withdraw successful");
		}
	}
	
	public void deposite(double amount)
	{
		ATM.amount+=amount;
		System.out.println("Deposite successful");
	}
	
	public void checkBalance()
	{
		System.out.println("your Balance is "+ATM.amount);
	}

	public static void Main()
	{
		ATM atm=new ATM();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do{
			try{Thread.sleep(1000);}catch(InterruptedException e){}
			System.out.println("\n----------------------------------");
			System.out.println("WEL-COME TO ATM press (1 -4) value");
			System.out.println("----------------------------------");
			System.out.println("1 for DEPOSITE");
			System.out.println("2 for WITHDRAW");
			System.out.println("3 for CHECK BALANCE");
			System.out.println("4 for EXIT");

			choice =sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter amount for deposite: ");
					double amt=sc.nextDouble();
					atm.deposite(amt); 
					break;	
				}
				case 2:
				{
					System.out.println("Enter amount for Withdraw: ");
					double amt=sc.nextDouble();
					atm.withdraw(amt); 
					break;	
				}
				case 3:
				{
					atm.checkBalance(); 
					break;	
				}
				case 4:
				{
					System.exit(0); 
					break;	
				}
				default : Main();
			}
		}while(choice!=4);
	}
	
	public static void main(String[] args)
	{
		Main();
	}
}