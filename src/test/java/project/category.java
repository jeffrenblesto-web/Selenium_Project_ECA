package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class category extends base_test{
@Test
public void category() {
	String currentUrl = driver.getCurrentUrl();
	Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
	System.out.println(currentUrl);
	
	WebElement element = driver.findElement(By.xpath("//h2[text()='Category']"));
	Assert.assertEquals(element.getText().equalsIgnoreCase("Category"), true);
	System.out.println(element.getText());
	
	driver.findElement(By.xpath("(//span[@class=\"badge pull-right\"])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Jeans ']")).click();
	
	WebElement element2 = driver.findElement(By.xpath("(//span[@class='google-anno-t'])[1]"));
	Assert.assertEquals(element2.getText().equalsIgnoreCase("Men"), true);
	System.out.println(element2.getText());
	
	driver.findElement(By.xpath("(//span[@class='badge pull-right'])[1]")).click();
	driver.findElement(By.xpath("(//a[text()='Dress '])[1]")).click();
	
}
}
