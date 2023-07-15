//check if random number is above or below 10

import javax.swing.JOptionPane;

public class GuessGameApp{
	public static void main(String [] args){

		//vars
		int randomNum;
		String ans;

		//object
		GuessGame answer;
		answer=new GuessGame();
		//input
		randomNum=(int)(Math.random()*20);

		//set
		answer.setRandomNum(randomNum);
		//compute
		answer.computeAns();
		// get
		ans=answer.getAns();
		//output
		JOptionPane.showMessageDialog(null,"The random number generated was "+ randomNum +" which is "+ ans + " 10");

	}
}