//check if random number is above or below 10
	public class GuessGame{

	//variables
	private int randomNum;
	private String ans;
	//constructor
	public GuessGame(){
		ans="";
	}
	//set methods
	public void setRandomNum (int randomNum){
		this.randomNum=randomNum;
	}
	public void setAns (String ans){
		this.ans=ans;
	}
	//compute
	public void computeAns(){
		if (randomNum >=10){
			ans="above";
		}
		else {
			ans="below";
		}
	}
	//get
	public String getAns(){
		return ans;
	}
}