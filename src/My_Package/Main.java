package My_Package;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter your input => 1.GOOGLE Chrome 2.Microsoft Edge");
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		Browser bw = new Browser();
		WebDriver driver;
		if(val==1) {
			driver = bw.setGoogleBrowser();  // creating a Chrome driver
		}
		else {
			driver = bw.setEdgeBrowser(); // creating a Edge driver
		}
		scan.close();
		Thread.sleep(1000);
		String originalWindow = driver.getWindowHandle();
		
		driver.manage().window().maximize();     // maximizing the window size
		openFlipkart flipkart = new openFlipkart();         
		System.out.println("Flipkart Opens in Browser");
		
		flipkart.openFlipkartApp(driver);   // opening FLIPKART Shopping Site
		
		implicitWait iw = new implicitWait();
		iw.implicitWaitMethod(driver);           // implicit wait to load the entire web-site
		
		try {
			crossButton cross = new crossButton(); cross.crossButtonWorking(driver);  // closing the login box pop up
			
			Highlights.highlight(driver, driver.findElement(By.className("_3704LK")));
			ScreenShot sh = new ScreenShot();
			Thread.sleep(1000);
			Highlights.highlight(driver, driver.findElement(By.className("L0Z3Pu")));
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_1.png");
			Search search = new Search(); search.searchItem_1(driver);                // searching the item from the csv file
			
			Thread.sleep(1000);
			Highlights.highlight(driver, driver.findElement(By.className("_2kHMtA")));
			SelectFirstProduct first = new SelectFirstProduct(); first.selectProduct(driver);  // selecting the first product
			
			Thread.sleep(1000);
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_2.png");
			Thread.sleep(1000);

			driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));     // switching control to the next tab
			Thread.sleep(2000);
			
			AddToCart cart = new AddToCart(); cart.addToCart(driver);                  // add to cart the first item
			Thread.sleep(1000);
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_3.png");
			Thread.sleep(2000);
			
			driver.close();                                                            // closing the current tab 
			
			Thread.sleep(2000);
			driver.switchTo().window(originalWindow);                                  // switching back control to the previous tab
			
			Thread.sleep(2000);
			
			ScrollPage sp = new ScrollPage();
			sp.Scroll(driver);
			Thread.sleep(2000);
			Highlights.highlight(driver, driver.findElements(By.className("_2kHMtA")).get(1));
			SelectSecondProduct second = new SelectSecondProduct(); second.selectProduct(driver);  // selecting the second product
			Thread.sleep(1000);
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_4.png");
			Thread.sleep(1000);
			
			driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));				 // switching control to the next tab
			
			Thread.sleep(2000);

			cart.addToCart(driver);																// add to cart the second item
			Thread.sleep(1000);
			
			Get_Price_1 price = new Get_Price_1(); 
			
			// printing price of the first item
			String value_1 = price.getPrice_1(driver); System.out.println("The price of the first item = "+value_1.substring(1));
			Thread.sleep(2000);
			
			// printing price of the second item
			String value_2 = price.getPrice_2(driver); System.out.println("The price of the second item = "+value_2.substring(1));
			Thread.sleep(2000);
			
			// printing price of total items
			String total = price.getTotalPrice(driver);
			Thread.sleep(2000);
			System.out.println("The total price = "+total.substring(1));
			
			// validating the price summation
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_5.png");
			PriceValidation validation = new PriceValidation();
			Thread.sleep(2000);
			
			// result validation
			
			if(validation.validateResult(value_1.substring(1), value_2.substring(1), total.substring(1))==true) {
				System.out.println("Result Successfully Validated.");
			}
			else {
				System.out.println("False Result");
			}
			
		}
		catch(Exception e){
			
			Highlights.highlight(driver, driver.findElement(By.className("Pke_EE")));
			ScreenShot sh = new ScreenShot();
			Thread.sleep(1000);
			Highlights.highlight(driver, driver.findElement(By.className("_2iLD__")));
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_1.png");
			Search search = new Search(); search.searchItem_2(driver);						// searching the item from the csv file
			Thread.sleep(1000);
			Highlights.highlight(driver, driver.findElement(By.className("_2kHMtA")));
			SelectFirstProduct first = new SelectFirstProduct(); first.selectProduct(driver);			// selecting the first product
			Thread.sleep(1000);
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_2.png");
			Thread.sleep(1000);
			
			driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));					// switching control to the next tab
			Thread.sleep(2000);
			AddToCart cart = new AddToCart(); cart.addToCart(driver);							// add to cart the first item
			Thread.sleep(1000);
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_3.png");
			Thread.sleep(2000);
			
			driver.close();																// closing the current tab 		
			
			Thread.sleep(2000);
			driver.switchTo().window(originalWindow);								// switching back control to the previous tab
			Thread.sleep(2000);
			ScrollPage sp = new ScrollPage();
			sp.Scroll(driver);
			Thread.sleep(2000);
			Highlights.highlight(driver, driver.findElements(By.className("_2kHMtA")).get(1));
			//Highlights.highlight(driver, driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div")));
			SelectSecondProduct second = new SelectSecondProduct(); second.selectProduct(driver);    // selecting the second product
			Thread.sleep(1000);
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_4.png");
			Thread.sleep(1000);
			driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));				// switching control to the next tab
			cart.addToCart(driver);														// add to cart the first item
			Thread.sleep(1000);
			
			Get_Price_1 price = new Get_Price_1(); 
			
			// printing price of the first item
			String value_1 = price.getPrice_1(driver); System.out.println("The price of the first item = "+value_1.substring(1));
			Thread.sleep(2000);
			
			// printing price of the second item
			String value_2 = price.getPrice_2(driver); System.out.println("The price of the second item = "+value_2.substring(1));
			Thread.sleep(2000);
			
			// printing price of total items
			String total = price.getTotalPrice(driver);
			System.out.println("The total price = "+total.substring(1));
			
			sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\My_mini_project\\Output_Screenshots\\output_5.png");
			
			// validating the price summation
			PriceValidation validation = new PriceValidation();
			
			// result validation
			if(validation.validateResult(value_1.substring(1), value_2.substring(1), total.substring(1))==true) {
				System.out.println("Result Successfully Validated.");
			}
			else {
				System.out.println("False Result");
			}
		}
		finally {
			System.out.println("Browser Closed");
			Thread.sleep(2000);
			driver.quit();
		}
	}

}