//App takes in a string from a user to print every 2 letter
public class String2Letter{

	//variables
	private String user;
	private StringBuffer strBuff;
	private String new2LetterString;

	//constructor
	public String2Letter(){
		user="";
		new2LetterString="0";
		strBuff= new StringBuffer();
	}
	//set
	public void setUser (String user){
		this.user=user;
	}
	//compute
	public void compute2LetterString(){
		for(int i=1;i<user.length();i=i+2){//check
			strBuff.append(user.charAt(i));//check
		}
		new2LetterString=strBuff.toString();
	}
	//get
	public String getNew2LetterString(){
		return new2LetterString;
	}
}