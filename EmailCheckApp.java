//takes in 2 pieces of information from a user;
//a single email address and an array of
//3 character domain extensions (eg com, edu, org).
//parameters into a single method.
//1 method that sets and computes and
//1 method that returns information.
//Check that there is an @ symbol in the email address
//Check that there is a . before the 3 character extension
//nsure that the domain extension is one of the 3 character Strings from the array
//The method should return a String that states whether or not the email address is valid, and why.

import javax.swing.JOptionPane;

public class EmailCheckApp{

	public static void main (String [] args){

	//variables
	String email;
	String msg;
	String[] domains=new String[3];
	//objects
	EmailCheck e;
	e=new EmailCheck();
	//input
	
	email= JOptionPane.showInputDialog("Please enter your email address");
	for (int i=0; i<3; i++){
		domains[i]=JOptionPane.showInputDialog("enter your email address domain");
	}

	//compute
	e.compute(email,domains);
	//get
	msg=e.getMsg();
	//output
	JOptionPane.showMessageDialog(null ,msg);


	}
}