public class BottlesApp{
	public static void main(String[] args){
		//declare and create objects
		Bottles song;
		song=new Bottles();
		//compute
		song.generateLyrics();
		//get and output
		System.out.println(song.getLyrics());
	}
}