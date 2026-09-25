package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class scroll_script extends base_test{
@Test
public void scroll_up() {
	String currentUrl = driver.getCurrentUrl();
	Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
	System.out.println(currentUrl);
	
	
	WebElement element = driver.findElement(By.xpath("//h2[text()='Subscription']"));
	Actions action = new Actions(driver);
	action.scrollToElement(element).perform();
	
	Assert.assertEquals(element.getText().equalsIgnoreCase("SUBSCRIPTION"), true);
	System.out.println(element.getText());
	
	WebElement element2 = driver.findElement(By.xpath("//a[text()=' Home']"));
	action.scrollToElement(element2).perform();
}
}
