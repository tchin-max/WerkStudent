package InterD;

public class Adapter implements Mediaplayer {

	private LeagacyAudioPlayer lop ;
	
	
	public Adapter(LeagacyAudioPlayer lop) {
		this.lop = lop;
	}


	@Override
	public void play(String filename) {

		lop.playfile(filename);
		
		
	}

}
