public class CinemaTicket{

	//vars
	private int numbTickets;
	private int age;
	private boolean weekDay;
	private double cost;
	//constructor
	public CinemaTicket(){
		numbTickets=1;
		age=0;
		cost=0.0;
	}
	//set
	public void setNumbTickets(int numbTickets){
		this.numbTickets=numbTickets;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setWeekDay(boolean weekDay){
		this.weekDay=weekDay;
	}
	//compute
	public void computeCost(){
	if (weekDay=true){
		if (age>=18){
			cost=12.50*numbTickets;
		}
		else if (age<18){
			cost=10.0*numbTickets;
		}
		else{
			System.out.println("Invalid entry for age");
		}
	}
	else {
		if (age>=18){
			cost=10.50*numbTickets;
		}
		else if (age<18){
			cost=8.0*numbTickets;
		}
		else{
			System.out.println("Invalid entry for age");
		}
	}
	}
		//get
		public double getCost(){
			return cost;
		}

}