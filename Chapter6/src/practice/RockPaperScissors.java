package practice;

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int user;
	      int computer;
	      String msg = null;
	      final int LOW = 1;
	      final int HIGH = 3;
	      int count = 0;
		
	      for(int i = 0; i < 5; i++ ){
	      computer = LOW + (int)(Math.random() * HIGH);
	      user = Integer.parseInt(JOptionPane.showInputDialog(null,
	        "Type one of the following numbers:\n1 -- Rock" + "\n2 - Paper\n3 -- Scissors"));
	      
		    if(computer == 1) {
		    	if(user == 1) {
		    		msg = "Tie";
		    	}
		    	else if(user == 2) {
		    		msg ="You lost";
		    	}
		    	else {
		    		msg = "You won";
		    		count = count +1;
		    	}
		    }
		    if(computer == 2) {
		    	if(user == 2) {
		    		msg = "Tie";
		    	}
		    	else if(user == 3) {
		    		msg = "You won";
		    		count = count +1;
		    	}
		    	else
		    		msg = "You lost";
		    }
		    if(computer == 3) {
		    	if(user == 3) {
		    		msg = "Tie";
		    	}
		    	else if(user == 2) {
		    		msg = "You lost";
		    	}
		    	else {
		    		msg = "You won";
		    		count = count +1;
		    	}
		    }
		    JOptionPane.showMessageDialog(null,
			        "\n Did you win?\n: " + msg + "\nNumber of wins " + count);
		    
	    } 
	      
	}

}
