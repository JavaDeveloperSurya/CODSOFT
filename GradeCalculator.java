/*
Task1:- Student Grade calculator
programmer name:-Surya kumar Gouda
Date:- 13/06/2024
*/

import java.util.Scanner;
import java.util.ArrayList;
class GradeCalculator
{
	Scanner sc=new Scanner(System.in);
	int subjectCount;
	ArrayList<Double> a=new ArrayList<Double>();
	
	public static void main(String[] args)
	{
		GradeCalculator gc=new GradeCalculator();
		gc.userInput();
		gc.display();
	}
	
	public void userInput()
	{
		ArrayList<String> l=new ArrayList<String>();
		System.out.println("Enter number of subjects: ");
		this.subjectCount=sc.nextInt();
		for(int i=1; i<=subjectCount; i++)
		{
			System.out.print("enter subject "+i+": ");
			sc.nextLine();
			l.add(sc.nextLine());
			System.out.print("Enter "+l.get(i-1)+" marks: ");
			a.add(sc.nextDouble());	
		}
	}
	public double sumOfMark()
	{
		double sum=0;
		for(int i=0; i<a.size(); i++)
		{
			sum+=a.get(i);
		}
		return sum;
	}
	public String percentage()
	{
		java.text.DecimalFormat df=new java.text.DecimalFormat("##.##");
		return df.format(sumOfMark()/(subjectCount*100)*100);
	}
	public String gradeAssign(double d)
	{
		if(d>90 && d<=100)
			return "A1";
		else if(d>80 && d<=90)
			return "A2";
		else if(d>70 && d<=80)
			return "B1";
		else if(d>60 && d<=70)
			return "B2";
		else if(d>50 && d<=60)
			return "C";
		else if(d>40 && d<=50)
			return "D";
		else if(d>33 && d<=40)
			return "E";
		else
			return "Fail";
	}
	public void display()
	{
		java.text.DecimalFormat df=new java.text.DecimalFormat("##.##");
		System.out.println();
		System.out.println("Total Mark: "+df.format(sumOfMark()));
		System.out.println("Average Percentage: "+percentage()+" %");
		System.out.println("Grade :"+gradeAssign(Double.parseDouble(percentage())));
	}
}