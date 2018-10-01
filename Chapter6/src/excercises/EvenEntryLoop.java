package excercises;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numChoice;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Pick a number >>>");
			numChoice = input.nextInt();
			if(numChoice % 2 == 0) {
				System.out.println("Good job");
			}
			else 
				System.out.println("Error");
		}while(numChoice != 999);
		
	}

}
