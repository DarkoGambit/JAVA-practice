import javax.swing.JOptionPane;

public class StuGrades{
		//declare vars
		private int i;
		private int subjects;
		private double sum;
		private double avg;
		private String mark;
		double[] results=new double[subjects];
		//constructor
		public StuGrades(){
		subjects=0;
		mark="";
		avg=0;
		sum=0;
	}

		//set
		public void setSum(double sum){
			this.sum=sum;
		}
		public void setAvg(double avg){
			this.avg=avg;
		}
		public void setSubjects(int subjects){
			this.subjects=subjects;
		}
		public void setResults(double[] results){
					this.results=results;
		}
		//compute
		public void computeAvg(){
			avg=sum/subjects;
		}
		public void computeMark(){
		for(i=0; i<results.length; i++){
		       if(results[i]>=70 && results[i]<=100){
		            mark="A";
		        }
		        else if(results[i]>=60 && results[i]<70){
		           	mark="B";
		        }
		        else if(results[i]>=50 && results[i]<60){
		            mark="C";
		        }
		        else if(results[i]>=45 && results[i]<50){
		            mark="D";
				}
		        else if(results[i]>=0 && results[i]<45){
		         	mark="E";
				}
		        else{
            		mark="Not a valid grade";
				}
				JOptionPane.showMessageDialog(null, "you scored "+ results[i] + " for module " + (i+1) + ". Your grade is: " +mark);
		}
}
		//get
	public double getAvg(){
		return avg;
	}
	public String getMark(){
		return mark;
	}

}


