package seleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	//private final String CONFIG_FILE_PATH ="./src/main/java/seleniumSessions/config.properties";
	 Properties prop;
	public Properties initProperties() {
		try {
			FileInputStream ip = new FileInputStream("./src/main/java/seleniumSessions/config.properties");
			prop = new Properties();
		
			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
}
