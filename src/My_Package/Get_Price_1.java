package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Get_Price_1 {
	public String getPrice_2(WebDriver driver) {
		WebElement val = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/div[1]/div[1]/span[2]"));
		String price = val.getText();
		return price;
	}
	
	public String getPrice_1(WebDriver driver) {
		WebElement val = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/span[2]"));
		String price = val.getText();
		return price;
	}
	
	public String getTotalPrice(WebDriver driver) {
		WebElement val = driver.findElement(By.className("z4Ha90"));
		String price = val.getText();
		return price;
	}
}
