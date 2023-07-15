import javax.swing.JOptionPane;
public class StuGradesApp{
public static void main(String [] args){
	//declare vars
		int i;
		int subjects;
		double sum=0;
		double avg;
		String mark;

	//objects
	StuGrades s;
	s=new StuGrades();
	//input
	subjects=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of subjects you took:"));
	double[] results=new double[subjects];

	for(i=0; i<results.length; i++){
	results[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "please enter grade for subject " +(i+1)));

	sum=sum+results[i];

	System.out.println(results[i]);

	}

	//set
	s.setSum(sum);
	s.setSubjects(subjects);
	s.setResults(results);
	//compute
	s.computeAvg();
	s.computeMark();
	//get
	avg= s.getAvg();
    mark=s.getMark();
	//output

	//for(i=0; i<subjects; i++){
	//JOptionPane.showMessageDialog(null, "you scored "+ results[i] + " for module " + (i+1) + ". Your grade is: " +mark);
	//System.out.println(mark);
//}
	JOptionPane.showMessageDialog(null, "your course average is: " +avg);


}
}