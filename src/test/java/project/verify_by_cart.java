package project;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class verify_by_cart extends base_test {
@Test
public void verify_() {	
	
	
driver.findElement(By.xpath("//i[text()=' Products']")).click();

driver.findElement(By.xpath("//i[text()='View Product']")).click();

driver.findElement(By.id("quantity")).sendKeys("4");

driver.findElement(By.xpath("//button[@class=\"btn btn-default cart\"]")).click();

driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

driver.findElement(By.xpath("//u[text()='View Cart']")).click();

WebElement element = driver.findElement(By.xpath("//button[text()='8']"));
Assert.assertEquals(element.getText().equalsIgnoreCase("4"), true);
System.out.println(element.getText());
	
}
}
