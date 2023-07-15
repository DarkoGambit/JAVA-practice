//Year birth
//User inputed values
import javax.swing.JOptionPane;

public class Yearbirth
{
	public static void main(String[] args)
	{
		//Declaring variables entered by user
		int Age=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Age"));
		int Year=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Current Year"));

		//process
		int ans=Year-Age;

		//print
		JOptionPane.showMessageDialog(null,"Your Year of Birth was " +ans);
	}
}