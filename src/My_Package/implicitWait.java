package My_Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class implicitWait {
	public void implicitWaitMethod(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
