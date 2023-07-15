//instantiable that calculates the sum of an array

public class RandomArray{

	//variables
	private int sum;
	private int max;

	//combined method

	public int calcs(int [] numbers){
		for (int i=0;i<numbers.length;i=i+1){
			sum=sum+numbers[i];
		}
		return sum;
	}

	public int bigger (int [] numbers){
	    for(int i=1;i<numbers.length;i=i+1) {
        if(max < numbers[i]) {
            max = numbers[i];
        }
    }
    return max;
	}


	}
