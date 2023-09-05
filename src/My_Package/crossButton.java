package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class crossButton {
	public void crossButtonWorking(WebDriver driver) {
		WebElement cross = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		cross.click();
	}
}
