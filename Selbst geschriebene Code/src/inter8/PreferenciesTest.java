package inter8;

import java.util.prefs.Preferences;

public class PreferenciesTest {

	public static void main(String[] args) {
		Preferences prf = Preferences.userNodeForPackage(PreferenciesTest.class);
		Preferences pr = Preferences.userRoot().node("App");
		pr.put("Language", "de");
		pr.putInt("Volume", 120);
		pr.putBoolean("Fullscreen", true);
		
	String	Language = "de";
	int volume = 120;
	boolean fullscreen = true;
	System.out.println(pr.get("Language :", Language));
	System.out.println(pr.getInt("Volume:", volume));
	System.out.println(pr.getBoolean("Fullsreeen", fullscreen));
		
		
		
	}
}
