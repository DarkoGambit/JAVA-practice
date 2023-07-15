//calculate party venue for each student based on their year and programme
import javax.swing.JOptionPane;
public class NightOutApp{
	public static void main (String[] args){
	//declare vars
	int year;
	String prog;
	String venue;
	//objects
	NightOut n;
	n=new NightOut();
	//input
	year=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your year"));
	prog=JOptionPane.showInputDialog(null,"Enter either \"hdbc\" or \"hdaiml\"");
	//set
	n.setYear(year);
	n.setProg(prog);
	//compute
	n.computeVenue();
	//get
	venue=n.getVenue();
	//output
	JOptionPane.showMessageDialog(null," Your night out will be at: "+venue);
	}
}