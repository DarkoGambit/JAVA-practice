//cinema tickets price based on age and number tickets required
import javax.swing.JOptionPane;

public class CinemaTicketsApp{
	public static void main(String[] args){
		//vars
		int age;
		int numbertickets;
		double price;

		//objects (instantiable class)
		CinemaTickets cost;
		cost=new CinemaTickets();
		//input
		age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
		numbertickets=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of tickets"));
		//set
		cost.setAge(age);
		cost.setNumbertickets(numbertickets);
		//compute
		cost.computePrice();
		//get
		price=cost.getPrice();
		//output
		JOptionPane.showMessageDialog(null,"Total price of "+numbertickets +" tickets is " + price);

	}
}