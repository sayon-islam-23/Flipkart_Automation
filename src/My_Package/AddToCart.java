package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	public void addToCart(WebDriver driver) {
		WebElement addCart1 = driver.findElement(By.className("_1KOMV2"));  //cart icon
		addCart1.click();
	}
}
