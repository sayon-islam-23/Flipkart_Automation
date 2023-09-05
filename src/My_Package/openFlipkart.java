package My_Package;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class openFlipkart {
	public void openFlipkartApp(WebDriver driver) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Resources\\config.properties");
		Properties p = new Properties();
		p.load(fr);  // load the filereader object into the properties instance.
		String url = p.getProperty("url");  // in properties, this method is used get the value from the properties file
		driver.get(url);
	}

}