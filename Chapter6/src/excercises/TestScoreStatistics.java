package excercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int userChoice;
		int count = 0;
		int high = 0;
		int low = 100;
		int avg;
		int total = 0;
		System.out.print("Enter a number to exit enter 999 >>>");
		userChoice = input.nextInt();
		
		do
		{
			if(userChoice > high) 
			{
				high = userChoice;
				count = count + 1;
			}
			else if(userChoice < low) 
			{
				low = userChoice;
				count = count + 1;
			}
			else if(userChoice > 100 || userChoice < 0) 
			{
				System.out.println("Out of range");
			}
			total = total + userChoice;
			avg = total/count;
		}while(userChoice != 999);
	}

}
