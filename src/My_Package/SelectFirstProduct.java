package My_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFirstProduct {
	public void selectProduct(WebDriver driver) {
		// it will return a list of webelements 
		List<WebElement> arr = driver.findElements(By.className("_2kHMtA"));
		arr.get(0).click();
	}
}
