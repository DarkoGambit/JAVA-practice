import javax.swing.JOptionPane;
public class BloodApp{
public static void main(String [] args){
	//declare vars
	int age;
	String type;
	String msg;
	//objects
	Blood b;
	b=new Blood();
	//input
	age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
	type=JOptionPane.showInputDialog(null,"Enter your blood type:");
	//set
	b.setAge(age);
	b.setType(type);
	//compute
	b.computeMsg();
	//get
	msg=b.getMsg();
	//output
	JOptionPane.showMessageDialog(null, msg);
	}
}