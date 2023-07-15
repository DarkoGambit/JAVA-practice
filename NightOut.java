//calculate party venue for each student based on their year and programme
public class NightOut{
	//variables
	private int year;
	private String prog;
	private String venue;
	//constructor
	public NightOut(){
		year=0;
		prog="";
		venue="";
	}
	//set
	public void setYear(int year){
		this.year=year;
	}
	public void setProg(String prog){
		this.prog=prog;
	}
	//compute
	public void computeVenue(){
		if(year==1){
			if(prog.equalsIgnoreCase("HDAIML")){
			venue="Lagoona";
			}
			else if(prog.equalsIgnoreCase("HDBC")){
			venue="Harbourmaster";
			}
			else{
				System.out.println("sorry, invalid programme entry");
			}
		}
		else if(year==2){
			if(prog.equalsIgnoreCase("HDAIML")){
			venue="Harbourmaster";
			}
			else if(prog.equalsIgnoreCase("HDBC")){
			venue="Lagoona";
			}
			else{
				System.out.println("sorry, invalid programme entry");
			}
		}
		else{
			System.out.println("Sorry, invalid entry for programme year");
		}

	}
	//get
	public String getVenue(){
		return venue;
	}
}