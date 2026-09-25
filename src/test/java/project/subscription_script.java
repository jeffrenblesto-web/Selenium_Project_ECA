package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class subscription_script extends base_test{
@Test
public void sub_script() {
	
	driver.findElement(By.xpath("//a[@style='color: orange;']")).click();
	
	WebElement element1 = driver.findElement(By.xpath("//h2[text()='Subscription']"));
	Assert.assertEquals(element1.getText().equalsIgnoreCase("Subscription"), true);
	System.out.println(element1.getText());
	
	driver.findElement(By.id("susbscribe_email")).sendKeys("jeffrenblesto@gmail.com");
	
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	
	WebElement down = driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']"));
	Assert.assertEquals(down.getText().equalsIgnoreCase("You have been successfully subscribed!"), true);
	System.out.println(down.getText());
	
}
}
