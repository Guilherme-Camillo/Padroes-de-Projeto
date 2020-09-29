public class Main {
 public static void main(String[] args) {
    MediaPlayer player = new MP3();
    player.play("Musica.MP3");
    
    player = new FormatAdapter(new MP4());
    player.play("Filme.MP4");
 }
}