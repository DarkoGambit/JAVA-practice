//check if number is positive of negative

import javax.swing.JOptionPane;

public class OddEvenApp{
	public static void main(String [] args){

		//vars
		double userInput;
		String ans;

		//object
		OddEven answer;
		answer=new OddEven();
		//input
		userInput=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter any number of your choice"));
		//set
		answer.setUserInput(userInput);
		//compute
		answer.computeAns();
		// get
		ans=answer.getAns();
		//output
		JOptionPane.showMessageDialog(null,"This number is: "+ans);

	}
}