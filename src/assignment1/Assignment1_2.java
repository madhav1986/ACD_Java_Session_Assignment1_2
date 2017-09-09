package assignment1;
import java.util.Scanner;
/*
This call will help you to master the concepts : Variable declaration,assignment of value and Operators.
*/
class Assignment1_2
{
	
	static int sum(int fnum,int snum)
	{
		int carry=0;
		
		 //applying the logic as stated in the assignment.
		while(snum!=0)
		{
			
			carry=fnum&snum;
			fnum=fnum^snum;
			snum=carry<<1;
		}
		return fnum;
	}
	
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		
		
		int firstnum,secnum; //declaring all the variables 
		Scanner input = new Scanner(System.in); // Scanner object to take the input from the user.
		System.out.println("Enter first number:");
		firstnum=input.nextInt(); //initializing first number
		System.out.println("Enter second number:");
		secnum=input.nextInt(); //initializing second number
		System.out.println("Result="+sum(firstnum,secnum));
		input.close();
	}
}