package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {

	WebDriver driver;
	
	@Test
	void logoTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hurai\\Desktop\\SeleniumWebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logoImg = driver.findElement(By.xpath("//img[@src='/webres_5fee89a90600f2.94309009/themes/default/images/login/logo.png']"));
		Assert.assertTrue(logoImg.isDisplayed());
		Thread.sleep(5000);
		System.out.println("Logo Test is completed");
	}
	@Test
	void homePageTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hurai\\Desktop\\SeleniumWebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(5000);
		System.out.println("Home page title is completed");
	}
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
