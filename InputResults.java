//create an array 3x3 and put set values in the array
//then sum each row
//sum each column
//sum entire array
public class InputResults{
	//variables
	private int[] sumRow= new int [3];
	private int[] sumColumn= new int[3];
	private int sumTotal;
	//array initialize
	private int[][]values={{10,30,2},{15,5,99},{46,28,55}};
	//constructor
	public InputResults(){

	}
	//set
	public void setValues(int[][] values){
		this.values=values;
	}
	//compute
	public void computeSumRow(){
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values[i].length;j++){
			sumRow[i]=sumRow[i] + values[i][j];
			}
			System.out.println("Sum of row " + (i+1)+ " is: " + sumRow[i]);
		}
	}
	public void computeSumColumn(){
			for(int j=0;j<values.length;j++){
				for(int i=0;i<values.length;i++){
				sumColumn[j]=sumColumn[j] + values[i][j];

			}
		System.out.println("Sum of column " + (j+1)+ " is: " + sumColumn[j]);
		}
	}
	public void computeSumTotal(){
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values.length;j++){
		    sumTotal=sumTotal + values[i][j];
	}

	   }
    }
	//get
	public int[] getSumRow(){
		return sumRow;
	}
	public int[] getSumColumn(){
			return sumColumn;
	}
	public int getSumTotal(){
		return sumTotal;
	}

}