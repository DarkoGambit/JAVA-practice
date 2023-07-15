//Year birth
//User inputed values
import javax.swing.JOptionPane;

public class YearbirthApp{

	public static void main(String[] args){

		//variables
		int age;
		int year;
		int ans;

		//objects
		Yearbirth add;
		add=new Yearbirth();

		//input
		age=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Age"));
		year=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Current Year"));

		//set
		add.setAge(age);
		add.setYear(year);

		//compute
		add.computeAns();

		//get
		ans=add.getAns();

		//output
		JOptionPane.showMessageDialog(null,"Your Year of Birth was " +ans);
	}
}