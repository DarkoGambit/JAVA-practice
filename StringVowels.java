//App takes in a string from a user to count vowels
public class StringVowels{

	//variables
	private String user;
	private int sumVowels;
	//constructor
	public StringVowels(){
		user="";
		sumVowels=0;
	}
	//set
	public void setUser (String user){
		this.user=user;
	}
	//compute
	public void computeCountVowels(){
		for(int i=0;i<user.length();i++){
			if(user.charAt(i)=='a' || user.charAt(i)=='e'||user.charAt(i)=='i'|| user.charAt(i)=='o' ||user.charAt(i)=='u'){
				sumVowels=sumVowels+1;

			}
		}
	}
	//get
	public int getSumVowels(){
		return sumVowels;
	}
}