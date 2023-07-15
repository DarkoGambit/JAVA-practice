import javax.swing.JOptionPane;

public class CinemaTicketApp{
	public static void main(String [] args){
		//variables
		int numbTickets;
		int age;
		boolean weekDay;
		double cost;
		//objects
		CinemaTicket c;
		c=new CinemaTicket();
		//inputs
		numbTickets=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the desired number of tickets:"));
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age:"));
		//weekDay=JOptionPane.showInputDialog(null,"Buying tickets for weekday?");
		weekDay=JOptionPane.showshowConfirmDialog(null, JOptionPane.YES_NO_OPTION);
		//set
		c.setAge(age);
		c.setNumbTickets(numbTickets);
		c.setWeekDay(weekDay);
		//compute
		c.computeCost();
		//get
		cost=c.getCost();
		//output
		JOptionPane.showMessageDialog(null,numbTickets+" tickets will cost: "+cost);
	}
}