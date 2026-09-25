package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class search_product extends base_test{
@Test
public void search_pro() {
	driver.findElement(By.xpath("//a[text()=' Products']")).click();
	
	driver.findElement(By.id("search_product")).sendKeys("jeans");
	
	driver.findElement(By.id("submit_search")).click();
	
	WebElement product = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
	Assert.assertEquals(product.getText().equalsIgnoreCase("Searched Products"), true);
	System.out.println(product.getText());
	
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='productinfo text-center']"));
	for (WebElement allproduct : elements) {
		System.out.println(allproduct.getText());
	}
	
}
}
