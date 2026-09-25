package project;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class Register_Module extends base_test{
	@Test
 public void login_page() {
	driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jeffren");
	driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("jeffrenblesto@gmail.com");
	driver.findElement(By.xpath("//button[text()='Signup']")).click();
	WebElement element = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
	
	Assert.assertEquals(element.equals("Enter Account Information"), false);
	System.out.println(element.getText());
	driver.findElement(By.id("id_gender1")).click();
	driver.findElement(By.id("password")).sendKeys("Jeffren123!@#");
	WebElement dropdown = driver.findElement(By.id("days"));
	Select select =new Select (dropdown);
	select.selectByValue("10");
	WebElement dropdown1 = driver.findElement(By.id("months"));
	Select select1 =new Select (dropdown1);
	select1.selectByValue("4");
	WebElement dropdown2 = driver.findElement(By.id("years"));
	Select select2 =new Select (dropdown2);
	select2.selectByValue("2004");
	driver.findElement(By.id("newsletter")).click();
	driver.findElement(By.id("optin")).click();
	driver.findElement(By.id("first_name")).sendKeys("jeffren");
	driver.findElement(By.id("last_name")).sendKeys("blesto");
	driver.findElement(By.id("company")).sendKeys("oracel");
	driver.findElement(By.id("address1")).sendKeys("F-01/02, First Floor, Salcon Rasvillas, D-1, District Centre, Saket, New Delhi - 110017");
	driver.findElement(By.id("state")).sendKeys("TamilNadu");
	driver.findElement(By.id("city")).sendKeys("chennai");
	driver.findElement(By.id("zipcode")).sendKeys("600066");
	driver.findElement(By.id("mobile_number")).sendKeys("6488474946");
	driver.findElement(By.xpath("//button[text()='Create Account']")).click();
	WebElement element2 = driver.findElement(By.xpath("//b[text()='Account Created!']"));
	Assert.assertEquals(element2.getText().equalsIgnoreCase("Account Created!"), true);
	System.out.println(element2.getText());
	driver.findElement(By.xpath("//a[text()='Continue']")).click();
	
}
}


