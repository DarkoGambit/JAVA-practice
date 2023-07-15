//Upgraded Addition
//User inputed values
import javax.swing.JOptionPane;

public class UpgradedAddition
{
	public static void main(String[] args)
	{
		//Declaring variables entered by user
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number 1"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number 2"));
		int ans=num1+num2;

		//print
		JOptionPane.showMessageDialog(null,"The answer is " + ans);

	}
}