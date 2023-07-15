public class ResultsYear{
	//variables
	private double[] sum=new double[4];
	private double[] avg=new double[4];
	private double total;
	private double avgTotal;
	//array
	private double [][] results=new double[4][5];
	//constructor
	public ResultsYear(){

	}
	//set
	public void setResults(double [][] results){
		this.results=results;
	}
	//compute
	public void compute(){
		for (int i=0;i<results.length;i++){
			for (int j=0;j<results[i].length;j++){

			sum[i]=sum[i]+results[i][j];

			}
			avg[i]= sum[i]/results[i].length;
			total=total+sum[i];
			avgTotal=total/20;
		}
	}
	//get
	public double[] getSum(){
		return sum;
	}
	public double[] getAvg(){
		return avg;
	}
	public double getAvgTotal(){
		return avgTotal;
	}

}




