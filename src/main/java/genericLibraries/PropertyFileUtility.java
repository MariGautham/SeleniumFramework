package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	Properties property;
	public void propertyFileInitialization() throws IOException {
		FileInputStream fis= new FileInputStream(IConstantPath.PROPERTYPATH);
		 property=new Properties();
		property.load(fis);
	}
	public String fetchDataFromPropetyFile(String key) throws IOException {
	return property.getProperty(key);

}
}
