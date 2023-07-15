//calculating user hourly and yearly pay

import javax.swing.JOptionPane;

 public class Userpay
{
	public static void main (String[] args)
	{
		//input variables
		double monthlyWage=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your monthly wage"));
		double weeklyHours=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your weekly hours worked"));

		//process
		double yearPay= monthlyWage/4*52;
		double hourlyPay=yearPay/(weeklyHours*52);

		//output
		JOptionPane.showMessageDialog(null,"Your yearly pay is "+ yearPay);
		JOptionPane.showMessageDialog(null,"Your hourly pay is "+ hourlyPay);
	}
}