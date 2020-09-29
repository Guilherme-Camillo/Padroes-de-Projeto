
public class FormatAdapter implements MediaPlayer {
		private MediaPackage media;
	
	public FormatAdapter(MediaPackage m) {
    media = m;
 }
	
 public void play(String filename) {
   System.out.print("Utilizando Adaptador -> ");
   media.playFile(filename);
 }
}