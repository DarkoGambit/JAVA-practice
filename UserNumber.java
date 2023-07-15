//check if number is positive or negative
	public class UserNumber{

	//variables
	private double userInput;
	private String ans;
	//constructor
	public UserNumber(){
		ans="";
	}
	//set methods
	public void setUserInput (double userInput){
		this.userInput=userInput;
	}
	public void setAns (String ans){
		this.ans=ans;
	}
	//compute
	public void computeAns(){
		if (userInput>0){
			ans="positive";
		}
		else if (userInput<0){
			ans="negative";
		}
		else if (userInput==0){
			ans="0";
		}
	}
	//get
	public String getAns(){
		return ans;
	}
}