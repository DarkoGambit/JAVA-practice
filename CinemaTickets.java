//cinema tickets price based on age and number tickets required
public class CinemaTickets{
	//declaring variables
	private int age;
	private int numbertickets;
	private double price;

	//constructor
	public CinemaTickets(){
		age=1;
		numbertickets=1;
		price=0.0;
	}
	//set
	public void setAge (int age){
		this.age=age;
	}
	public void setNumbertickets (int numbertickets){
		this.numbertickets=numbertickets;
	}
	public void setPrice (double price){
		this.price=price;
	}
	//compute
	public void computePrice(){

		if (age<18) {
			price=10*numbertickets;
		}
		else if (age>=18) {
			price=15*numbertickets;
		}
	}
	//get
	public double getPrice(){
		return price;
		}
}