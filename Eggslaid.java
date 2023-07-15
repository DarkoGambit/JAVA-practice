//input eggs laid
//output how many 6-egg boxes needed and leftover eggs

import javax.swing.JOptionPane;

public class Eggslaid
{
	public static void main(String[] args)
	{
	//user enter number of eggs laid
	int eggs=Integer.parseInt(JOptionPane.showInputDialog (null, "Please enter the number of eggs laid"));

	//process
	int boxes=eggs/6;
	int leftover=eggs%6;

	//output
	JOptionPane.showMessageDialog(null, "How many boxes are required: " + boxes);
	JOptionPane.showMessageDialog(null, "How many eggs are leftover: " + leftover);

	}

}