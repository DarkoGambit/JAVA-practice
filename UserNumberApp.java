//check if number is positive of negative

import javax.swing.JOptionPane;

public class UserNumberApp{
	public static void main(String [] args){

		//vars
		double userInput;
		String ans;

		//object
		UserNumber answer;
		answer=new UserNumber();
		//input
		userInput=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter any number of your choice"));
		//set
		answer.setUserInput(userInput);
		//compute
		answer.computeAns();
		// get
		ans=answer.getAns();
		//output
		//output
		JOptionPane.showMessageDialog(null,"This number is: "+ans);

	}
}
