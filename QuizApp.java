/*
Task1:- QUI APPLICATION 
programmer name:-Surya kumar Gouda
Date:- 27/06/2024
*/

import java.io.*;
import java.util.Scanner;

class QuizApp
{
	Scanner sc=new Scanner(System.in);
	int correctAns=0;
	public void clear() throws IOException, InterruptedException 
	{
        	if (System.getProperty("os.name").contains("Windows")) 
		{
            		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        	} 
		else 
		{
            		new ProcessBuilder("clear").inheritIO().start().waitFor();
        	}
    	}
	public void q1()
	{
		int ans=1;
		System.out.println("Which one is correct ?");
		System.out.println("1) CODSOFT");
		System.out.println("2) CODESOFT");
		System.out.println("3) CODE SOFT");
		System.out.println("4) CODE SOFTWARE");
		int c=sc.nextInt();
		if(c==ans)
		correctAns++;
	}
	public void q2()
	{
		int ans=3;
		System.out.println("Father of java ?");
		System.out.println("1) KEN THOMPSON");
		System.out.println("2) DENNIS RITCHE");
		System.out.println("3) JAMES GOSLING");
		System.out.println("4) GUIDO VAN ROSSUM");
		int c=sc.nextInt();
		if(c==ans)
		correctAns++;
	}
	public void q3()
	{
		int ans=2;
		System.out.println("JAVA developed in which year ?");
		System.out.println("1) 1990");
		System.out.println("2) 1995");
		System.out.println("3) 2000");
		System.out.println("4) 2003");
		int c=sc.nextInt();
		if(c==ans)
		correctAns++;
	}
	public void q4()
	{
		int ans=4;
		System.out.println("initial name of JAVA ?");
		System.out.println("1) yava");
		System.out.println("2) python");
		System.out.println("3) c++++");
		System.out.println("4) OAK");
		int c=sc.nextInt();
		if(c==ans)
		correctAns++;
	}
	public void q5()
	{
		int ans=3;
		System.out.println("which is the parent class of all class ?");
		System.out.println("1) Class");
		System.out.println("2) Math");
		System.out.println("3) Object");
		System.out.println("4) Lang");
		int c=sc.nextInt();
		if(c==ans)
		correctAns++;
	}
	
	public static void main(String[] args)
	{
		QuizApp q=new QuizApp();
		q.q1();
		try{q.clear();}catch(Exception e){}
		q.q2();
		try{q.clear();}catch(Exception e){}
		q.q3();
		try{q.clear();}catch(Exception e){}
		q.q4();
		try{q.clear();}catch(Exception e){}
		q.q5();
		try{q.clear();}catch(Exception e){}
		System.out.println("Your score is "+q.correctAns);	
	}
}
		