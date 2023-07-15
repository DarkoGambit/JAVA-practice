//stores positions of each space
public class StringPositions{

	//variables
	private String user;
	private StringBuffer strBuff;
	private String pos;

	//constructor
	public StringPositions(){
		user="";
		strBuff= new StringBuffer();
		pos="";
	}
	//set
	public void setUser (String user){
		this.user=user;
	}
	//compute
	public void computePositions(){


		for(int i=0;i<user.length();i++){
			if(user.charAt(i)==' '){
				strBuff.append(i);
			}
			else{
				strBuff.append(',');
		}
		pos=strBuff.toString();
	}
}

	//get
	public String getPos(){
		return pos;
	}
}