//Create an instantiable class that returns details of an array of numbers.
//The class should contain 3 methods:
//method that accepts as a parameter an array of integers and calculate the sum of the array and the max value
//method that returns the max
//method that returns the sum
public class RandomArrayApp{
	public static void main(String [] args){
	//variables, create and declare array
	int sum;
	int max;
	//object
	RandomArray r;
	r=new RandomArray();
	//input
	int [] numbers={34,56,64,23,45};
	//set, compute and get
	sum=r.calcs(numbers);
	max=r.bigger(numbers);
	//output
	System.out.println("Sum of array is: "+sum);

	System.out.println("Max number on the array is: "+max);
	}
}