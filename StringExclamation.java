//string with all vowels replaced as exclamation points
public class StringExclamation{

	//variables
	private String user;
	private StringBuffer strBuff;
	private String exclamString;
	//constructor
	public StringExclamation(){
		user="";
		strBuff= new StringBuffer();
		exclamString="0";
	}
	//set
	public void setUser (String user){
		this.user=user;
	}
	//compute
	public void computeExclamation(){
		for(int i=0;i<user.length();i++){
			if(user.charAt(i)=='a' || user.charAt(i)=='e'||user.charAt(i)=='i'|| user.charAt(i)=='o' ||user.charAt(i)=='u'){
				strBuff.append('!');
			}
			else{
				strBuff.append(user.charAt(i));
		}
	}
		exclamString=strBuff.toString();
}
	//get
	public String getExclamString(){
		return exclamString;
	}
}