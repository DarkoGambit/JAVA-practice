public class Bottles{
	private String lyrics;
	//compute
	public void generateLyrics(){
		for(int i=99;i>0;i--){
			System.out.println((i)+" bottles of beer \n");
		}
	}
	//get
	public String getLyrics(){
		return lyrics;
	}

}