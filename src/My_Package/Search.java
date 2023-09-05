package My_Package;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	
	
	
	public void searchItem_1(WebDriver driver) throws InterruptedException, IOException {
		
		FileReader fr = new FileReader("C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Input\\config.properties");
		Properties p = new Properties();
		p.load(fr);  // 
		String item = p.getProperty("item");
		
		WebElement search = driver.findElement(By.className("_3704LK"));
		search.sendKeys(item);
		Thread.sleep(1000);
		WebElement magButton = driver.findElement(By.className("L0Z3Pu"));
		magButton.click();
	}
	
	public void searchItem_2(WebDriver driver) throws InterruptedException, IOException {
		
		FileReader fr = new FileReader("C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Input\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		String item = p.getProperty("item");
		
		WebElement search = driver.findElement(By.className("Pke_EE"));
		search.sendKeys(item);
		Thread.sleep(1000);
		WebElement magButton = driver.findElement(By.className("_2iLD__"));
		magButton.click();
	}
}
