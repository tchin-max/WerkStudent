package InterD;

public class client {
 
	public static void main(String[] args) {
		LeagacyAudioPlayer lop = new LeagacyAudioPlayer();
		Mediaplayer mp = new Adapter(lop);
		mp.play("play was");
	}
}
