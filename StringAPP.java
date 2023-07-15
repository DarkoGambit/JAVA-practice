///App takes in a string from a user to
//count letters - sumLetters
//count vowels - sumVowels
//string with every second letter - new2LetterString
//positions of each space -
//string with all vowels replaced as exclamation points - exclamString
import javax.swing.JOptionPane;

public class StringAPP{

	public static void main (String [] args){
	//variables
	String user;
	int sumLetters;
	int sumVowels;
	String new2LetterString;
	String exclamString;
	String pos;
	//objects
	StringLetters s;
	s=new StringLetters();
	StringVowels v;
	v=new StringVowels();
	String2Letter l;
	l=new String2Letter();
	StringExclamation e;
	e= new StringExclamation();
	StringPositions p;
	p=new StringPositions();
	//input
	user=JOptionPane.showInputDialog("enter a phrase:");

	//set
	s.setUser(user);
	v.setUser(user);
	l.setUser(user);
	e.setUser(user);
	p.setUser(user);
	//compute
	s.computeCountLetters();
	v.computeCountVowels();
	l.compute2LetterString();
	e.computeExclamation();
	p.computePositions();
	//get
	sumLetters=s.getSumLetters();
	sumVowels=v.getSumVowels();
	new2LetterString=l.getNew2LetterString();
	exclamString=e.getExclamString();
	pos=p.getPos();
	//output

	System.out.println ("This was your entered phrase: "+user);
	System.out.println ("The total number of letters is: "+sumLetters);
	System.out.println ("The total number of vowels is: "+sumVowels);
	System.out.println ("The new string with every second letter is:  "+ new2LetterString);
	System.out.println ("Your sentence with vowels replaced with ! is: "+exclamString);
	System.out.println ("positions of the blank spaces are: "+pos);
	}

}
