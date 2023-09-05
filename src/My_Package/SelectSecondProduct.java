package My_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectSecondProduct {
	public void selectProduct(WebDriver driver) {
		List<WebElement> arr = driver.findElements(By.className("_2kHMtA"));
		arr.get(1).click();
//		WebElement secondProd = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div"));
//		secondProd.click() ;
	
	}
}
