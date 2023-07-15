//user enter 5 results for each year of a 4 year course. average for each year. total average

import javax.swing.JOptionPane;

public class ResultsYearApp{
	public static void main (String[] args){
		//variables
		String user;
		double[] avg;
		double[] sum;
		double avgTotal;
		//declare and create array;
		double [][] results=new double[4][5];
		//objects
		ResultsYear r;
		r=new ResultsYear();
		//input
		for (int i=0;i<results.length;i++){
			for (int j=0;j<results[i].length;j++){
				user = JOptionPane.showInputDialog(null, "Enter a result for position (" + (i) + ", " + (j) + "):");
				results[i][j] = Double.parseDouble(user);

			}
		}
		//set
		r.setResults(results);
		//compute
		r.compute();
		//get
		sum=r.getSum();
		avg=r.getAvg();
		avgTotal=r.getAvgTotal();
		//output
		for (int i=0;i<results.length;i++) {
			for (int j=0;j<results[i].length;j++){

			System.out.print(results[i][j]+("     "));

			}
			System.out.println();
			System.out.println("average result of year " +(i+1)+ " is " +avg[i]);

		}
			System.out.println();
			System.out.println("4 year course average is: " +avgTotal);
	}
}