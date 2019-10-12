package week8.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BlueLagoon {

	@Test
	public void main() {
//		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementByXPath("(//div[@class='controls']//input)[1]").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementByXPath("(//div[@class='controls']//input)[2]").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		driver.findElementByXPath("(//div[@class='dropdown']//button)[5]").click();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue lagoon");
		driver.findElementById("buttonSearch").click();
		String Country = driver.findElementByXPath("(//table[@class='table']//td)[5]").getText();
		System.out.println(Country);
	
	}
}
