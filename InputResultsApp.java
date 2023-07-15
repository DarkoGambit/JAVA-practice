//create an array 3x3 and put set values in the array
//then sum each row
//sum each column
//sum entire array
public class InputResultsApp{

	public static void main(String [] args){
	//declare vars
	int[] sumRow= new int[3];
	int[] sumColumn= new int[3];
	int sumTotal;
	//input and array initialize
	int[][]values={{10,30,2},{15,5,99},{46,28,55}};
	//objects
	InputResults r;
	r=new InputResults();
	//set
	r.setValues(values);
	//compute
	r.computeSumRow();
	r.computeSumColumn();
	r.computeSumTotal();
	//get
	sumRow= r.getSumRow();
	sumColumn= r.getSumColumn();
	sumTotal= r.getSumTotal();
	//output

	System.out.println("Sum of your array is: " + sumTotal);

	}
}