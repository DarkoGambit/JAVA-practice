//check if number is even or odd
	public class OddEven{

	//variables
	private double userInput;
	private String ans;
	//constructor
	public OddEven(){
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
		if ((userInput%2)==0){
			ans="even";
		}
		else {
			ans="odd";
		}
	}
	//get
	public String getAns(){
		return ans;
	}
}