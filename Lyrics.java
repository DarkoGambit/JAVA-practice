//print all lyrics from song 99 bottles of beer
public class Lyrics{
	//public static void main(String[] args){
		//declare vars
		private int i=99;
		private String lyr;
		//constructor
		public Lyrics(){
			i=0;
			lyr="";
		}
	//set
	public void setI(int i){
		this.i=i;
	}
		//compute
		public void computeLyr(){
		for(i=99;i>=0;i=i-1){
			if(i>2){
		//after loop ends print the lyrics
			System.out.println(i+ " bottles of beer on the wall, " +i+  " bottles of beer ");
			System.out.println(" Take one down and pass it around, " +(i-1)+ " bottles of beer on the wall \n");
			}
			else if (i==2){
			System.out.println(i+ " bottles of beer on the wall, " +i+  " bottles of beer ");
			System.out.println(" Take one down and pass it around, " +(i-1)+ " bottle of beer on the wall \n" );
			}
			else if (i==1){
			System.out.println(i+ " bottle of beer on the wall, " +i+  " bottle of beer ");
			System.out.println(" Take one down and pass it around, " +(i-1)+ " bottles of beer on the wall \n" );
			}
			else if(i==0){
				System.out.println("No more bottles of beer on the wall, " + "no more bottles of beer ");
				System.out.println(" Go to the store and buy some more, 99 bottles of beer on the wall \n");
			}
			}
			}

		//get
		public String getLyr(){
		return lyr;
}

}