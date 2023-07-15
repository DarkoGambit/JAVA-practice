public class Blood{
	//variables
	private int age;
	private String type;
	private String msg;
	//constructor
	public Blood(){
		age=0;
		type="";

	}
	//set
	public void setAge(int age){
		this.age=age;
	}
	public void setType(String type){
		this.type=type;
	}
		//compute
	public void computeMsg(){
	if(age>=18){
		if(type.equalsIgnoreCase("A")){
		msg="donate A and AB;receive A and O";
		}
		else if(type.equalsIgnoreCase("AB")){
		msg="donate AB; receive A, B, AB and O";
		}
		else if (type.equalsIgnoreCase("B")){
		msg="donate B and AB; receive B and O";
		}
		else if (type.equalsIgnoreCase("O")){
		msg="donate AB, A, B and O; receive O";
		}
	}
	else{
		msg="You must be over 18";
	}
	}
	//get
	public String getMsg(){
		return msg;
	}
}
