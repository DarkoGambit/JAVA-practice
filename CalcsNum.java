public class CalcsNum{

	//vars and array initi
	double [] numbers={45.0,65.0,2.0,97.0,14.0};
	int length=numbers.length;
	int results;
	int i;
	double sum=0.0;
	double mean;

	//constructor


	//set
	public void setNumbers(double [] numbers){
		this.numbers=numbers;
	}

	//compute
	public void computeSum(){
		for(i=0;i<numbers.length;i=i+1){
		sum=sum+numbers[i];
		}
	}
	public void computeMean(){
		mean=sum/length;
	}
	//get
	public double getSum(){
		return sum;
	}
	public double getMean(){
			return mean;
	}

}