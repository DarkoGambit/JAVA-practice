//instantiable class

public class Yearbirth{

	//variables
	private int age;
	private int year;
	private int ans;
	//set methods
	public void setAge(int age){
		this.age=age;
	}
	public void setYear(int year){
		this.year=year;
	}
	// compute/process
	public void computeAns(){
		ans=year-age;
	}

	//get methods
	public int getAns(){
		return ans;
	}

}