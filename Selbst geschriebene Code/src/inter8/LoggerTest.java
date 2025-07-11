package inter8;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTest {
private static final	Logger logger = Logger.getLogger(LoggerTest.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
		Logger logger2 = Logger.getLogger("inter8.LoggerTest");
		logger2.log(Level.ALL,"iisdcd");
//	logger.info("ein info");
//	logger.warning("A warning");
//	logger.severe("severe");
		logger.log(Level.FINE,"blabla");
	
	logger.setLevel(Level.ALL);
	ConsoleHandler ch = new ConsoleHandler();
	ch.setLevel(Level.ALL);
	logger.addHandler(ch);
	
	FileHandler fh = new FileHandler("Logging.txt",true);// true = append
	fh.setFormatter(new SimpleFormatter());
	logger.addHandler(fh);
	logger.info("Ich hab das geschrieben yo");
	}

}
