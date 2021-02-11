package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest2 {

	WebDriver driver;
	@Test
	void loginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hurai\\Desktop\\SeleniumWebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(5000);
		System.out.println("Login test is completed");
	}
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
