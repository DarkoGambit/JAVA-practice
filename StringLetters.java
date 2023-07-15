//App takes in a string from a user to count letters
public class StringLetters{

	//variables
	private String user;
	private int sumLetters;
	//constructor
	public StringLetters(){
		user="";
		sumLetters=0;
	}
	//set
	public void setUser (String user){
		this.user=user;
	}
	//compute
	public void computeCountLetters(){
		for(int i=0;i<user.length();i++){
			if(user.charAt(i)!='.' && user.charAt(i)!=' '){
				sumLetters=sumLetters+1;

			}
		}
	}
	//get
	public int getSumLetters(){
		return sumLetters;
	}
}