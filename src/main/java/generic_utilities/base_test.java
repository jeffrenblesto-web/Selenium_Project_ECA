package generic_utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class base_test {

	public WebDriver driver;
	public WebDriver wait;

	@BeforeClass
	public void openbrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/");

	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("jeffrenblesto@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Jeffren123!@#");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

	}

	@AfterMethod

	public void logout() {
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
