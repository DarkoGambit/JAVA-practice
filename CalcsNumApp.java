public class CalcsNumApp{

public static void main(String [] args){
	//declare vars
		int results;
		int i;
		double sum=0.0;
		double mean;
	//objects
	CalcsNum c;
	c=new CalcsNum();
	//input
	double [] numbers={45.0,65.0,2.0,97.0,14.0};
	int length=numbers.length;
	//set
	c.setNumbers(numbers);
	//compute
	c.computeSum();
	c.computeMean();
	//get
	sum= c.getSum();
	mean= c.getMean();

	//output
	System.out.println("Sum of array is: "+sum+ " and numbers average is: " + mean);

}
}